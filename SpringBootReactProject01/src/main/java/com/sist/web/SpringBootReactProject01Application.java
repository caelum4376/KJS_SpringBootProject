package com.sist.web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com.sist.web.controller", "com.sist.web.dao", "com.sist.web.manager"})
public class SpringBootReactProject01Application {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootReactProject01Application.class, args);
    }

}
