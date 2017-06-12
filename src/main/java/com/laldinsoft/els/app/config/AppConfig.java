package com.laldinsoft.els.app.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.elasticsearch.core.ElasticsearchOperations;
import org.springframework.data.elasticsearch.core.ElasticsearchTemplate;
import org.springframework.data.elasticsearch.repository.config.EnableElasticsearchRepositories;

import static org.elasticsearch.node.NodeBuilder.nodeBuilder;

@Configuration
@ComponentScan(basePackages = "com.laldinsoft.els.app")
@EnableElasticsearchRepositories(basePackages = "com.laldinsoft.els.app.data")
public class AppConfig {

    @Bean
    public ElasticsearchOperations elasticsearchTemplate() {
        return new ElasticsearchTemplate(nodeBuilder().local(true).node().client());
    }

}
