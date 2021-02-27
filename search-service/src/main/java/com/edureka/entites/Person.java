package com.edureka.entites;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;

import java.math.BigInteger;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
@Document(indexName = "person", shards = 1, replicas = 0, refreshInterval = "-1")
public class Person {

    @Id
    BigInteger id;
    private String name;
    private String place;
    private String aka;
}
