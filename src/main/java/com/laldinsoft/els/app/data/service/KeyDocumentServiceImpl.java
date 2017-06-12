package com.laldinsoft.els.app.data.service;

import com.laldinsoft.els.app.data.document.KeyDocument;
import com.laldinsoft.els.app.data.repository.KeyDocumentRepository;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;

@Service
public class KeyDocumentServiceImpl implements KeyDocumentService {

    @Resource
    private KeyDocumentRepository keyDocumentRepository;

    @Override
    public KeyDocument save(KeyDocument keyDocument) {
        return keyDocumentRepository.save(keyDocument);
    }

    @Override
    public Stream<KeyDocument> findAll() {
        return StreamSupport.stream(keyDocumentRepository.findAll().spliterator(), false);
    }
}
