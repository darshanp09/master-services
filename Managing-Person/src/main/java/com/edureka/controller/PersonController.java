package com.edureka.controller;

import com.edureka.entities.Person;
import com.edureka.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.math.BigInteger;
import java.util.Optional;
import java.util.stream.Stream;

@RestController
public class PersonController {

    @Autowired
    PersonService personService;

    @GetMapping("/person")
    public Stream<Person> getPerson(){
        return personService.getAll();
    }

    @GetMapping({"/name/{name}"})
    public Stream<Person> getByName(@PathVariable String name){
        return personService.getByName(name);
    }

    @GetMapping({"/place/{place}"})
    public Stream<Person> getByPlace(@PathVariable String place){
        return personService.getByPlace(place);
    }

    @GetMapping({"/{id}"})
    public Optional<Person> getById(@PathVariable BigInteger id){
        return personService.getById(id);
    }

    @PostMapping
    public Person getById(@RequestBody Person person){
        return personService.save(person);
    }
}
