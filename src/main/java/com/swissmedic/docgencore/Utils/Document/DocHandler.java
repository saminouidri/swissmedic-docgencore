package com.swissmedic.docgencore.Utils.Document;
import com.aspose.words.*;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import java.io.File;

public class DocHandler {

    public Document createDocument(String templateName, File xmlFile) {
        String templatePath = "src/main/resources/templates/" + templateName + ".docx";

        String xmlFilePath = "src/main/resources/xml/" + xmlFile.getName();
        return injectXML(xmlFile.getAbsolutePath(), templatePath);
    }

    public Document injectXML(String xmlFilePath, String docxFilePath) {
        try {
            DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
            org.w3c.dom.Document xmlDocument = dBuilder.parse(xmlFilePath);
            xmlDocument.getDocumentElement().normalize();

            // Loading the DOCX Document
            Document docxDocument = new Document(docxFilePath);

            processNode(xmlDocument.getDocumentElement(), docxDocument);
            System.out.println("Document created");


            return docxDocument;


        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    private void processNode(Node node, Document docxDocument) throws Exception {
        // Check if node is a leaf node
    }
}

