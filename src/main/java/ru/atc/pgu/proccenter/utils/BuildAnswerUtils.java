package ru.atc.pgu.proccenter.utils;

import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.soap.MessageFactory;
import javax.xml.soap.MimeHeaders;
import javax.xml.soap.SOAPException;
import javax.xml.soap.SOAPMessage;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.*;


public class BuildAnswerUtils {


    /*public static Answer generateAnswerAccept(SOAPMessage soapMessage) {
        Answer answer = new Answer();
        answer.setUuid("");
        answer.setXml(generateAnswer(soapMessage));
        return answer;
    }*/


    public static SOAPMessage generateAnswer(SOAPMessage soapMessage) {
        XMLGregorianCalendar xmlGregorianCalendar = null;
        try {
            xmlGregorianCalendar = DatatypeFactory.newInstance().newXMLGregorianCalendar(new GregorianCalendar());
        } catch (DatatypeConfigurationException e) {
            e.printStackTrace();
        }
        setTag(soapMessage, "Date", xmlGregorianCalendar.toXMLFormat());

        Node sender = getTag(soapMessage, "Sender");
        Node recipient = getTag(soapMessage, "Recipient");

        String senderName = "";
        String senderCode = "";
        String recipientName = "";
        String recipientCode = "";


        if (sender != null) {
            senderCode = sender.getFirstChild().getTextContent();
            if (senderCode.trim().isEmpty() && sender.getFirstChild().getNextSibling()!=null)
                senderCode = sender.getFirstChild().getNextSibling().getTextContent();
            senderName = sender.getLastChild().getTextContent();
            if (senderName.trim().isEmpty() && sender.getLastChild().getPreviousSibling() != null)
                senderName = sender.getLastChild().getPreviousSibling().getTextContent();
        }

        if (recipient != null) {
            recipientCode = recipient.getFirstChild().getTextContent();
            if (recipientCode.trim().isEmpty())
                recipientCode = recipient.getFirstChild().getNextSibling().getTextContent();
            recipientName = recipient.getLastChild().getTextContent();
            if (recipientName.trim().isEmpty() && recipient.getLastChild().getPreviousSibling() != null)
                recipientName = recipient.getLastChild().getPreviousSibling().getTextContent();
        }

        if (sender != null) {
            if (sender.getFirstChild().getTextContent().trim().isEmpty() && sender.getFirstChild().getNextSibling() != null)
                sender.getFirstChild().getNextSibling().setTextContent(recipientCode);
            else
                sender.getFirstChild().setTextContent(recipientCode);
            if (sender.getLastChild().getTextContent().trim().isEmpty() && sender.getLastChild().getPreviousSibling() != null)
                sender.getLastChild().getPreviousSibling().setTextContent(recipientName);
            else
                sender.getLastChild().setTextContent(recipientName);
        }

        if (recipient != null) {
            if (recipient.getFirstChild().getTextContent().trim().isEmpty() && recipient.getFirstChild().getNextSibling() != null)
                recipient.getFirstChild().getNextSibling().setTextContent(senderCode);
            else
                recipient.getFirstChild().setTextContent(senderCode);
            if (recipient.getLastChild().getTextContent().trim().isEmpty() && recipient.getLastChild().getPreviousSibling() != null)
                recipient.getLastChild().getPreviousSibling().setTextContent(senderName);
            else
                recipient.getLastChild().setTextContent(senderName);
        }

        return soapMessage;
    }

    public static Node getTag(SOAPMessage message, String tag) {
        NodeList el = message.getSOAPPart().getElementsByTagNameNS("http://smev.gosuslugi.ru/rev120315", tag);
        String id = "";
        if (el.getLength() == 0) {
            el = message.getSOAPPart().getElementsByTagNameNS("http://smev.gosuslugi.ru/rev111111", tag);
        }
        if (el.getLength() == 1) {
            return el.item(0);
        }
        return null;
    }

    public static Node getTagMessageForAnswer(String xml) {
        SOAPMessage message = null;
        try {
            message = MessageFactory.newInstance().createMessage(new MimeHeaders(), new ByteArrayInputStream(xml.getBytes()));
            message = generateAnswer(message);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (SOAPException e) {
            e.printStackTrace();
        }

        NodeList el = message.getSOAPPart().getElementsByTagNameNS("http://smev.gosuslugi.ru/rev120315", "Message");
        if (el.getLength() == 0) {
            el = message.getSOAPPart().getElementsByTagNameNS("http://smev.gosuslugi.ru/rev111111", "Message");
        }
        if (el.getLength() == 1) {
            return el.item(0);
        }
        return null;
    }

    public static void setTag(SOAPMessage message, String tag, String value) {
        Node findTag = getTag(message, tag);
        if (findTag != null) findTag.setTextContent(value);
    }

    public static String getTagValue(SOAPMessage message, String tag) {
        NodeList el = message.getSOAPPart().getElementsByTagNameNS("http://smev.gosuslugi.ru/rev120315", tag);
        String id = "";
        if (el.getLength() == 0) {
            el = message.getSOAPPart().getElementsByTagNameNS("http://smev.gosuslugi.ru/rev111111", tag);
        }
        if (el.getLength() == 1) {
            return el.item(0).getTextContent();
        }
        return "";
    }

    public static void removeEmptyValues(HashMap responseMap) {
        responseMap.values().removeAll(Collections.singleton(""));
        Iterator it = responseMap.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();

            Object mapValue = entry.getValue();


            if (mapValue instanceof HashMap) {
                HashMap subHash = (HashMap) mapValue;
                removeEmptyValues(subHash);
                if (subHash.isEmpty()) {
                    it.remove();

                }
            }
            if (mapValue instanceof ArrayList) {
                ArrayList subList = (ArrayList) mapValue;
                ListIterator iterator = subList.listIterator();
                while (iterator.hasNext()) {
                    Object listValue = iterator.next();
                    if (listValue instanceof HashMap) {
                        HashMap subHash = (HashMap) listValue;
                        removeEmptyValues(subHash);
                        if (subHash.isEmpty()) {
                            iterator.remove();
                        }
                    }
                }

            }

        }
    }

    public static SOAPMessage getSoapMessageFromString(String xml) throws SOAPException, IOException {
        MessageFactory factory = MessageFactory.newInstance();
        SOAPMessage message = factory.createMessage(new MimeHeaders(), new ByteArrayInputStream(xml.getBytes(Charset.forName("UTF-8"))));
        return message;
    }

}
