package com.example.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorld {
    @GetMapping("/hello")
    public String Helloworld(){
        System.out.println("HelloWorld");
    return "Hello World";
    }
}
//Question:-
//Create a Simple REST API Endpoint
//Problem: Create a Spring Boot application with a single REST endpoint, /hello. When accessed via a GET request, it should return the message "Hello, World!".
//
//Objective: Understand how to set up a controller and handle HTTP GET requests.
