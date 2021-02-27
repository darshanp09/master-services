package com.edureka.repositories;

import com.edureka.entities.Person;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.math.BigInteger;
import java.util.stream.Stream;

@Repository
public interface PersonRepository extends MongoRepository<Person, BigInteger> {
    Stream<Person> findByName(String name);
    Stream<Person> findByPlace(String place);
}
