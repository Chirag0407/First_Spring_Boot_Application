package com.example.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.util.List;

@Configuration
public class StudentConfig {
    @Bean
    CommandLineRunner commandLineRunner(
            StudentRepository repository){
        return args -> {
            Student chirag=new Student(
                    "Chirag",
                    "chiragbamb@gmail.com",
                    LocalDate.of(2002,7,4)
            );
            Student Alex=new Student(
                    "Alex",
                    "Alex@gmail.com",
                    LocalDate.of(2002,7,4)
            );

            repository.saveAll(
                    List.of(chirag,Alex)
            );
        };
    }
}
