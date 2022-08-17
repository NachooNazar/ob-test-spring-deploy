package com.example.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
   /* @Value("${app.message}")
    private String message;

    @Value("${app.varexample}")
    private String varexample;*/

    @GetMapping("/hello")
    public String HelloWorld(){
        return "Hello World! ";    }

    @GetMapping("/")
    public String landing(){
        return "This is the landing ";    }
}
