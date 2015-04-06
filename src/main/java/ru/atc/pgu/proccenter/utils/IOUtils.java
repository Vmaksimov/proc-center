package ru.atc.pgu.proccenter.utils;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.w3c.dom.Document;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.io.StringWriter;


public class IOUtils {

    private static final Logger logger = LoggerFactory.getLogger(IOUtils.class);



    public static String writeXml(Document doc) {
        String signedRequest = "";
        try {
            Transformer transformer = TransformerFactory.newInstance().newTransformer();
//            transformer.setOutputProperty(OutputKeys.INDENT, "yes");

            StreamResult result = new StreamResult(new StringWriter());
            DOMSource source = new DOMSource(doc);
            transformer.transform(source, result);
            signedRequest = result.getWriter().toString();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return signedRequest;
    }

    public static Document readXml(String request) {
        Document doc = null;
        try {
            DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
            dbf.setNamespaceAware(true);
            dbf.setIgnoringComments(true);
            dbf.setValidating(false);

            DocumentBuilder dBuilder = dbf.newDocumentBuilder();

            /*System.out.println(request);*/
            doc = dBuilder.parse(org.apache.commons.io.IOUtils.toInputStream(request, "UTF-8"));
            doc.getDocumentElement().normalize();

        } catch (Exception e) {
            e.printStackTrace();
        }
        return doc;
    }
}
