package ru.atc.pgu.proccenter.config;

import org.apache.cxf.binding.soap.SoapMessage;
import org.apache.cxf.binding.soap.interceptor.AbstractSoapInterceptor;
import org.apache.cxf.binding.soap.saaj.SAAJInInterceptor;
import org.apache.cxf.interceptor.Fault;
import org.apache.cxf.phase.Phase;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Service;
import org.w3c.dom.Document;
import org.w3c.dom.Node;
import ru.atc.pgu.proccenter.DAO.ParticipantDAO;
import ru.atc.pgu.proccenter.DAO.VoterDAO;
import ru.atc.pgu.proccenter.DAO.XmlDataDAO;
import ru.atc.pgu.proccenter.domain.XmlData;
import ru.atc.pgu.proccenter.stub.rev120315.StatusType;
import ru.atc.pgu.proccenter.utils.BuildAnswerUtils;

import javax.xml.soap.SOAPException;
import javax.xml.soap.SOAPMessage;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.UUID;


@Service
public class RequestInterceptor extends AbstractSoapInterceptor {
    private static final SAAJInInterceptor saajIn = new SAAJInInterceptor();
    public static final String originRequestIdRef = "originRequestIdRef";
    public RequestInterceptor() {
        super(Phase.POST_PROTOCOL);
    }

    @Autowired
    XmlDataDAO xmlDataDAO;

    @Autowired
    ParticipantDAO participantDAO;

    @Autowired
    VoterDAO voterDAO;


    private static final Logger logger = LoggerFactory.getLogger(RequestInterceptor.class);

    @Override
    public void handleMessage(SoapMessage message) throws Fault {
        saajIn.handleMessage(message);
        SOAPMessage saaj = message.getContent(SOAPMessage.class);


        ByteArrayOutputStream out = new ByteArrayOutputStream();
        try {
            saaj.writeTo(out);
        } catch (SOAPException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        String incommingXML = null;
        try {
            incommingXML = new String(out.toByteArray(), "UTF-8");
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }

        String element = BuildAnswerUtils.getTagValue(saaj, "MessageId");
        if(element.isEmpty()) {
            element = UUID.randomUUID().toString();
        }
        logger.info("Request [originRequestIdRef = "+ element +"]");
        logger.debug("Request xml[originRequestIdRef = "+ element +"]: " + incommingXML);
        String inputName = message.getExchange().getBindingOperationInfo().getOperationInfo().getInputName();
        if (!inputName.equalsIgnoreCase("searchParticipants") && !inputName.equalsIgnoreCase("dictionary") && !inputName.equalsIgnoreCase("regNumber")) {
            XmlData XmlDataExisted = xmlDataDAO.findByOriginIdRef(element);
            XmlData xmlData = new XmlData();
            if (XmlDataExisted != null)
                xmlData = XmlDataExisted;
            else
                xmlData.setOriginIdRef(element);
            xmlData.setRequestXml(incommingXML);
            xmlDataDAO.save(xmlData);
        }
        BuildAnswerUtils.generateAnswer(saaj);
        BuildAnswerUtils.setTag(saaj, "Status", StatusType.RESULT.value());
        Node requestIdRef = BuildAnswerUtils.getTag(saaj, "RequestIdRef");

        if(requestIdRef == null) {
            try {
                Node nodeMessage = BuildAnswerUtils.getTag(saaj, "Message");
                Document doc = nodeMessage.getOwnerDocument();
                Node node1 = doc.createElementNS(nodeMessage.getNamespaceURI(), "RequestIdRef");
                node1.appendChild(doc.createTextNode(element));
                nodeMessage.appendChild(node1);
                node1 = doc.createElementNS(nodeMessage.getNamespaceURI(), "OriginRequestIdRef");
                node1.appendChild(doc.createTextNode(element));
                nodeMessage.appendChild(node1);
                saaj.saveChanges();

            } catch (SOAPException e) {
                e.printStackTrace();
            }

        }
        message.setContextualProperty(originRequestIdRef, element);

    }
}
