package com.laldinsoft.els.app.data.service;

import com.laldinsoft.els.app.data.document.KeyDocument;

import java.util.stream.Stream;

public interface KeyDocumentService {

    KeyDocument save(KeyDocument keyDocument);

    Stream<KeyDocument> findAll();
}
