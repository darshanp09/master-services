package com.edureka.controller;

import com.edureka.entites.Person;
import com.edureka.servies.SearchServices;
import lombok.AllArgsConstructor;
import org.springframework.data.elasticsearch.core.SearchHit;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.stream.Stream;

@RestController
@AllArgsConstructor
@RequestMapping("/search")
public class SearchController {

    SearchServices searchServices;

    @GetMapping({"/name/{name}"})
    public Stream<Person> searchByName(@PathVariable String name){
        return searchServices.searchByName(name);
    }

    @GetMapping({"/{anyWord}"})
    public Stream<SearchHit<Person>> searchEverything(@PathVariable String anyWord){
        return searchServices.search(anyWord);
    }
}
