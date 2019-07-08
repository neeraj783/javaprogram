package com.java.program.resources;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.*")

public class swaggerapplication {public static void main(String[]agr){
    SpringApplication.run(swaggerapplication.class, agr);

}

}
