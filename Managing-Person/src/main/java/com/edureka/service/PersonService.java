package com.edureka.service;

import com.edureka.entities.Person;
import com.edureka.repositories.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigInteger;
import java.util.Optional;
import java.util.stream.Stream;

@Service
public class PersonService {

    @Autowired
    PersonRepository personRepository;

    public Stream<Person> getByName(String name){
        return personRepository.findByName(name);
    }

    public Stream<Person> getByPlace(String place){
        return personRepository.findByPlace(place);
    }

    public Optional<Person> getById(BigInteger id){
        return personRepository.findById(id);
    }

    public Stream<Person> getAll(){
        return personRepository.findAll().stream();
    }

    public Person save(Person person){
        return personRepository.save(person);
    }
}
