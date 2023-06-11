package com.example.restApi.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class secondController {

    @GetMapping("/mock")
    public String secondMessage(){
        return "Brother Bernard!!!!";
    }
}
