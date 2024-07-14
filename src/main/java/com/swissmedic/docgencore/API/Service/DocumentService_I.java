package com.swissmedic.docgencore.API.Service;

import com.aspose.words.Document;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;

@Service
public interface DocumentService_I {

    Document createDocument(String templateName, File xmlFile);
}
