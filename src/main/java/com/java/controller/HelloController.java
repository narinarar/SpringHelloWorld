package com.java.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/api")
public class HelloController {

    // localHost:8080/api/hello
    @GetMapping(path = "/hello")
    public String sayHello(){
        return "Hello World!!";
    }
}
