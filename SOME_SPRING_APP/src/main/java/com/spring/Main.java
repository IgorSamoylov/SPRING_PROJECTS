package com.spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import javax.annotation.Resource;

@SpringBootApplication
@Configuration
@PropertySource("classpath:/spring.properties")
public class Main {

    public static void main(String[] args) {
        SpringApplication.run(Main.class, args);
    }
}
