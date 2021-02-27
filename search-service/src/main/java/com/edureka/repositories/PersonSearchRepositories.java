package com.edureka.repositories;

import com.edureka.entites.Person;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.stereotype.Repository;

import java.math.BigInteger;
import java.util.stream.Stream;

@Repository
public interface PersonSearchRepositories extends ElasticsearchRepository<Person, BigInteger> {
    Stream<Person> findAllByName(String name);
}
