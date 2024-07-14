package com.swissmedic.docgencore.API.Controller;

import com.aspose.words.Document;
import com.swissmedic.docgencore.API.Service.DocumentService_I;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;

@RestController
@RequestMapping("/api")
public class DocumentController {

    @Autowired
    private DocumentService_I documentService;

    @GetMapping("/")
    public String index() {
        return "Swissmedic DocGenCore API";
    }

}
