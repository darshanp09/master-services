package com.edureka;


import com.edureka.entities.Army;
import com.edureka.repositories.ArmyRepositories;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class ArmyServiceApplication {
    public static void main(String[] args) {
        SpringApplication.run(ArmyServiceApplication.class,args);
    }

    @Bean
    public CommandLineRunner seedDataBase(ArmyRepositories repositories){
        return args -> {
            repositories.save(Army.builder().
                    personId(1L).
                    dragons(10).
                    knights(5).
                    ships(8).
                    soldiers(25).
                    build());

            repositories.save(Army.builder().
                    personId(2L).
                    dragons(3).
                    knights(10).
                    ships(3).
                    soldiers(40).
                    build());

            repositories.save(Army.builder().
                    personId(3L).
                    dragons(11).
                    knights(27).
                    ships(15).
                    soldiers(80).
                    build());
        };
    }
}
