package com.scaler.java_spring_basics.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestControllerClass {

    @GetMapping("/hello")
    public String sayHello()
    {
        return "Hello World";
    }
}
