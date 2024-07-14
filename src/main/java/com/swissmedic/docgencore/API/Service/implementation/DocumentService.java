package com.swissmedic.docgencore.API.Service.implementation;

import com.aspose.words.Document;
import com.swissmedic.docgencore.API.Service.DocumentService_I;
import com.swissmedic.docgencore.Utils.Document.DocHandler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
@Service
public class DocumentService implements DocumentService_I {

    public Document createDocument(String templateName, File xmlFile) {
        DocHandler docHandler = new DocHandler();
        return docHandler.createDocument(templateName, xmlFile);

    }

}
