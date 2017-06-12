package com.laldinsoft.els.app.controller;

import com.laldinsoft.els.app.data.document.KeyDocument;
import com.laldinsoft.els.app.data.dto.KeyDocuments;
import com.laldinsoft.els.app.data.service.KeyDocumentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.stream.Collectors;

import static org.springframework.web.bind.annotation.RequestMethod.POST;

@RestController
@RequestMapping("/api")
public class KeyDocumentController {

    @Autowired
    private KeyDocumentService keyDocumentService;

    @RequestMapping("/findAll")
    public KeyDocuments getAllDocuments() {
        return new KeyDocuments(keyDocumentService.findAll().collect(Collectors.toList()));
    }

    @RequestMapping(path = "/save", method = POST)
    public KeyDocument saveNewDocument(@RequestBody KeyDocument keyDocument) {
        return keyDocumentService.save(keyDocument);
    }
}
