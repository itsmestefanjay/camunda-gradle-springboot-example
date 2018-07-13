package de.stefanjay;

import org.camunda.bpm.spring.boot.starter.annotation.EnableProcessApplication;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableProcessApplication("mySimpleApplication")
public class SimpleApplication {
    public static void main(final String... args) throws Exception {
        SpringApplication.run(SimpleApplication.class, args);
    }
}