package ru.atc.pgu.proccenter.config;

import org.apache.cxf.binding.soap.SoapMessage;
import org.apache.cxf.binding.soap.interceptor.AbstractSoapInterceptor;
import org.apache.cxf.binding.soap.saaj.SAAJOutInterceptor;
import org.apache.cxf.interceptor.Fault;
import org.apache.cxf.message.Message;
import org.apache.cxf.phase.Phase;
import org.apache.cxf.phase.PhaseInterceptor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import ru.atc.pgu.proccenter.DAO.XmlDataDAO;
import ru.atc.pgu.proccenter.domain.XmlData;
import ru.atc.pgu.proccenter.utils.BuildAnswerUtils;
import ru.atc.pgu.proccenter.utils.IOUtils;
import ru.atc.smev.crypto.XmlSignatureTool;
import ru.gosuslugi.smev.signaturetool.xsd.Part4SignType;

import javax.xml.soap.SOAPException;
import javax.xml.soap.SOAPMessage;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Set;

@Service
public class ResponseInterceptor extends AbstractSoapInterceptor {
    private static final Logger logger = LoggerFactory.getLogger(RequestInterceptor.class);

    public static final String SMEV_ACTOR = "http://smev.gosuslugi.ru/actors/smev";

    @Value("${crypto.certAlias}")
    String certAlias;
    @Value("${crypto.keyAlias}")
    String keyAlias;
    @Value("${crypto.password}")
    String password;

    @Autowired
    XmlDataDAO xmlDataDAO;

    private WSS4JOutInterceptorInternal ending;
    private SAAJOutInterceptor saajOut = new SAAJOutInterceptor();
    private boolean mtomEnabled;



    public ResponseInterceptor() {
        super(Phase.PRE_PROTOCOL);
        getAfter().add(SAAJOutInterceptor.class.getName());

        ending = createEndingInterceptor();
    }

    public boolean isAllowMTOM() {
        return mtomEnabled;
    }

    public void setAllowMTOM(boolean allowMTOM) {
        this.mtomEnabled = allowMTOM;
    }

    public void handleMessage(SoapMessage mc) throws Fault {
        //must turn off mtom when using WS-Sec so binary is inlined so it can
        //be properly signed/encrypted/etc...
        if (!mtomEnabled) {
            mc.put(org.apache.cxf.message.Message.MTOM_ENABLED, false);
        }

        if (mc.getContent(SOAPMessage.class) == null) {
            saajOut.handleMessage(mc);
        }

        mc.getInterceptorChain().add(ending);
    }

    public void handleFault(SoapMessage message) {
        saajOut.handleFault(message);
    }

    public final WSS4JOutInterceptorInternal createEndingInterceptor() {
        return new WSS4JOutInterceptorInternal();
    }

    final class WSS4JOutInterceptorInternal
            implements PhaseInterceptor<SoapMessage> {
        public WSS4JOutInterceptorInternal() {
            super();
        }

        public void handleMessage(SoapMessage mc) throws Fault {

            if (mc == null) {
                return;
            }
            SOAPMessage saaj = mc.getContent(SOAPMessage.class);
            ByteArrayOutputStream out = new ByteArrayOutputStream();
            try {
                saaj.writeTo(out);
            } catch (SOAPException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
            String outputXML = null;
            try {
                outputXML = new String(out.toByteArray(), "UTF-8");
            } catch (UnsupportedEncodingException e) {
                e.printStackTrace();
            }
            try {
                outputXML = signSoapRequest(outputXML);
                mc.setContent(SOAPMessage.class, BuildAnswerUtils.getSoapMessageFromString(outputXML));
            } catch (SOAPException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
            String originRequestIdRef = mc.getExchange().getInMessage().getContextualProperty(RequestInterceptor.originRequestIdRef).toString();
            String inputName = mc.getExchange().getBindingOperationInfo().getOperationInfo().getInputName();
            if (!inputName.equalsIgnoreCase("searchParticipants") && !inputName.equalsIgnoreCase("dictionary") && !inputName.equalsIgnoreCase("regNumber")) {
                XmlData xmlData = xmlDataDAO.findByOriginIdRef(originRequestIdRef);
                if (xmlData != null) {
                    try {
                        xmlData.setResponseXml(outputXML);
                        Node changeOrderInfo = BuildAnswerUtils.getTag(saaj, "changeOrderInfo");
                        Node lastChild = changeOrderInfo.getLastChild();
                        String textContent = lastChild.getTextContent();
                        xmlData.setComment(textContent);
                        xmlDataDAO.save(xmlData);
                    }catch (Exception e){
                        e.printStackTrace();
                    }
                }
            }
            logger.debug("Response xml[originRequestIdRef = "+ originRequestIdRef +"]:  " + outputXML);
        }

        @Override
        public void handleFault(SoapMessage message) {
        }

        public Set<String> getAfter() {
            return Collections.emptySet();
        }

        public Set<String> getBefore() {
            return Collections.emptySet();
        }

        public String getId() {
            return WSS4JOutInterceptorInternal.class.getName();
        }

        public String getPhase() {
            return Phase.POST_PROTOCOL;
        }

        public Collection<PhaseInterceptor<? extends Message>>
        getAdditionalInterceptors() {
            return null;
        }
    }


    public String signSoapRequest(String request) {

        XmlSignatureTool tool = new XmlSignatureTool();

        Part4SignType part4Sign = new Part4SignType();
        part4Sign.setName("Body");
        part4Sign.setNamespace("http://schemas.xmlsoap.org/soap/envelope/");
        List<Part4SignType> parts = Collections.singletonList(part4Sign);

        String signedRequest = "";
        final Document doc = IOUtils.readXml(request);
        try {
            final Document signDoc = tool.signMessage(doc, parts, SMEV_ACTOR, certAlias, keyAlias, password);

            signedRequest = IOUtils.writeXml(signDoc);

        } catch (Exception e) {
            throw new RuntimeException(e.getLocalizedMessage());
        }
        return signedRequest;
    }
}
