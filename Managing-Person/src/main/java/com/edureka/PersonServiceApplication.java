package com.edureka;

import com.edureka.entities.Person;
import com.edureka.repositories.PersonRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.math.BigInteger;

@SpringBootApplication
public class PersonServiceApplication {
    public static void main(String[] args) {
        SpringApplication.run(PersonServiceApplication.class,args);
    }

    @Bean
    public CommandLineRunner saveDataBase(PersonRepository repository){
        return args -> {
            repository.save(Person.builder()
                    .id(BigInteger.valueOf(1))
                    .name("Doremon")
                    .place("Japan")
                    .aka("Master of Gadget")
                    .build());

            repository.save(Person.builder()
                    .id(BigInteger.valueOf(2))
                    .name("John-Wick")
                    .place("usa")
                    .aka("Master of Hunter")
                    .build());

            repository.save(Person.builder()
                    .id(BigInteger.valueOf(3))
                    .name("2-States")
                    .place("India")
                    .aka("Shakti Man")
                    .build());
        };
    }
}
