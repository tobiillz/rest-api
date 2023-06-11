package com.example.restApi.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class firstController {

    @GetMapping("/greet")
    public String greetMessage(){
        return "Good Day";
    }
}
