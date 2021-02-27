package com.edureka.controller;


import com.edureka.entities.PersonEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigInteger;

@RestController
public class HelloController {

    @GetMapping("/")
    public PersonEntity getPerson(){
        return PersonEntity.builder().id(BigInteger.valueOf(1)).name("Doremon").designation("Master of Gadget").build();
    }
}
