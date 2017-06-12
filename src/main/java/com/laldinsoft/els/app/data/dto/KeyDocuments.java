package com.laldinsoft.els.app.data.dto;


import com.laldinsoft.els.app.data.document.KeyDocument;

import java.io.Serializable;
import java.util.List;

public class KeyDocuments implements Serializable {

    private List<KeyDocument> keyDocuments;

    public KeyDocuments(List<KeyDocument> keyDocuments) {
        this.keyDocuments = keyDocuments;
    }

    public List<KeyDocument> getKeyDocuments() {
        return keyDocuments;
    }

    public void setKeyDocuments(List<KeyDocument> keyDocuments) {
        this.keyDocuments = keyDocuments;
    }
}
