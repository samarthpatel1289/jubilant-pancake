package com.example.tictactoe.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class helloWorld {
    @GetMapping("/")
    public String helloWorld(){
        return "Hello World!";
    }
}
