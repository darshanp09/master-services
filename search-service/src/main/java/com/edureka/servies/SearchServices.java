package com.edureka.servies;

import com.edureka.entites.Person;
import com.edureka.repositories.PersonSearchRepositories;
import lombok.AllArgsConstructor;
import org.elasticsearch.index.query.QueryBuilders;
import org.springframework.data.elasticsearch.core.ElasticsearchRestTemplate;
import org.springframework.data.elasticsearch.core.SearchHit;
import org.springframework.data.elasticsearch.core.query.NativeSearchQuery;
import org.springframework.data.elasticsearch.core.query.NativeSearchQueryBuilder;
import org.springframework.stereotype.Service;

import java.util.stream.Stream;

@Service
@AllArgsConstructor
public class SearchServices {

    PersonSearchRepositories repositories;

    ElasticsearchRestTemplate template;

    public Stream<Person> searchByName(String name){
        return repositories.findAllByName(name);
    }

    public Stream<SearchHit<Person>> search(String anyWord){
        NativeSearchQuery searchQuery = new NativeSearchQueryBuilder().
                withFilter(QueryBuilders.regexpQuery("_all", ".*" + anyWord + ".*"))
                .build();
        return template.search(searchQuery,Person.class).stream();
    }

}
