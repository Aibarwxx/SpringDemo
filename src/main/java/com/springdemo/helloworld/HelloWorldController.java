package com.springdemo.helloworld;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

    @GetMapping
    public String helloWorld(){
        return "Hello World from Spring Boot";
    }

    @GetMapping(path = "/goodbye")
    public String goodbye(){
        return "Goodbye from Spring Boot";
    }
}
