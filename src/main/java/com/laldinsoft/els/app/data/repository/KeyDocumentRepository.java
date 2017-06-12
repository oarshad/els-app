package com.laldinsoft.els.app.data.repository;


import com.laldinsoft.els.app.data.document.KeyDocument;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

public interface KeyDocumentRepository extends ElasticsearchRepository<KeyDocument, String> {

}
