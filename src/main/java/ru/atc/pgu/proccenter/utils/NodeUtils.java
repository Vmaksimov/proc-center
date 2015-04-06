package ru.atc.pgu.proccenter.utils;

import org.apache.commons.io.IOUtils;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;


public class NodeUtils {


    public static final String NS_SOAP_ENVELOPE = "http://schemas.xmlsoap.org/soap/envelope/";
    public static final String UTF_8 = "UTF-8";

    public static String getMethodFromBody(String xmlRequest) {
       return getChildString(NodeUtils.NS_SOAP_ENVELOPE, "Body", xmlRequest);
    }

    public static String getChildString(String ns, String nameEl, String xmlRequest) {
        try {
            Document document = NodeUtils.parseDocFromByte(xmlRequest.getBytes(UTF_8));
            NodeList nodeList = document.getElementsByTagNameNS(ns, nameEl);
            Element elementBody = (Element) nodeList.item(0);
            NodeList nodes = elementBody.getChildNodes();
            Element element = null;
            for (int i = 0; i < nodes.getLength(); i++) {
                if (nodes.item(i).getNodeType() == Node.ELEMENT_NODE) {
                    element = (Element) nodes.item(i);
                }
            }
            Document bodyDoc = NodeUtils.getDocumentFromElement(element);
            xmlRequest = IOUtils.toString(NodeUtils.transformerDocToByte(bodyDoc), UTF_8);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return xmlRequest;
    }

    public static String wrapperEnvelope(String responseStr) throws ParserConfigurationException, IOException, TransformerException {
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        DocumentBuilder builder = factory.newDocumentBuilder();
        Document documentEnvelope = builder.newDocument();
        Document documentResponse = NodeUtils.parseDocFromByte(responseStr.getBytes(UTF_8));
        Element elEnvelope = documentEnvelope.createElementNS(NS_SOAP_ENVELOPE, "soapenv:Envelope");
        Element elHeader = documentEnvelope.createElementNS(NS_SOAP_ENVELOPE, "soapenv:Header");
        elEnvelope.appendChild(elHeader);
        Element elBody =documentEnvelope.createElementNS(NS_SOAP_ENVELOPE, "soapenv:Body");
        elBody.setAttributeNS("http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-utility-1.0.xsd", "wsu:Id", "Body");
        Node elementMethod = documentResponse.getDocumentElement();
        elBody.appendChild(documentEnvelope.importNode(elementMethod, true));
        elEnvelope.appendChild(elBody);
        documentEnvelope.appendChild(elEnvelope);
        responseStr = IOUtils.toString(NodeUtils.transformerDocToByte(documentEnvelope), UTF_8);
        return responseStr;
    }

    public static DocumentBuilderFactory createDocumentBuilderFactory() {
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        factory.setNamespaceAware(true);
        factory.setIgnoringComments(true);

        return factory;
    }

    public static Document parseDocFromByte(byte[] b) {
        try {
            final DocumentBuilder loader = createDocumentBuilderFactory().newDocumentBuilder();
            String xmlContent = IOUtils.toString(b, UTF_8);

            return loader.parse(IOUtils.toInputStream(xmlContent, UTF_8));
        } catch (Exception e) {

            e.printStackTrace();
            return null;
        }
    }


    public static Document getDocumentFromElement(Element el) throws Exception {
        ByteArrayOutputStream os = new ByteArrayOutputStream();

        final TransformerFactory tf = TransformerFactory.newInstance();
        final Transformer transformer = tf.newTransformer();
        transformer.transform(new DOMSource(el), new StreamResult(os));

        final DocumentBuilder loader = createDocumentBuilderFactory().newDocumentBuilder();
        final Document doc = loader.parse(new ByteArrayInputStream(os.toByteArray()));
        return doc;
    }

    public static byte[] transformerDocToByte(Document doc) throws TransformerException {
        final TransformerFactory tf = TransformerFactory.newInstance();
        final Transformer transformer = tf.newTransformer();
        ByteArrayOutputStream os = new ByteArrayOutputStream();
        transformer.transform(new DOMSource(doc.getDocumentElement()),
                new StreamResult(os));

        return os.toByteArray();
    }





}
