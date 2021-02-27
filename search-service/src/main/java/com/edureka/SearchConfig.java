package com.edureka;

import lombok.SneakyThrows;
import org.elasticsearch.client.RestClient;
import org.elasticsearch.client.RestHighLevelClient;
import org.elasticsearch.common.settings.Settings;

import org.elasticsearch.node.Node;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.elasticsearch.core.ElasticsearchOperations;
import org.springframework.data.elasticsearch.core.ElasticsearchRestTemplate;
import org.springframework.data.elasticsearch.core.ElasticsearchTemplate;
import org.springframework.data.elasticsearch.repository.config.EnableElasticsearchRepositories;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

@Configuration
@EnableElasticsearchRepositories
public class SearchConfig {
   /* @Bean
    @SneakyThrows
    public ElasticsearchOperations elasticsearchOperations() {
        Path tempDir = Files.createTempDirectory("temp-search-dir");
        Settings settings = Settings.builder().
                put("http.enabled","false").
                put("transport.type","local").
                put("path.home",tempDir)
                .build();

        return new ElasticsearchTemplate(new Node().start().client());
    }*/

    @Bean
    NodeBuilder

    @Bean
    RestHighLevelClient restHighLevelClient() throws IOException {
        Path tempDir = Files.createTempDirectory("temp-search-dir");
        Settings settings = Settings.builder().
                put("http.enabled","false").
                put("transport.type","local").
                put("path.home",tempDir)
                .build();
        return new RestHighLevelClient(RestClient.builder(String.valueOf(settings)));
    }

    @Bean
    public ElasticsearchRestTemplate elasticsearchRestTemplate() throws IOException {
        return new ElasticsearchRestTemplate(restHighLevelClient());
    }
}
