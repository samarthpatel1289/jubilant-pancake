package com.example.tictactoe.helloWorld;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class helloWorld {
    @GetMapping("/")
    public String helloWorldController(){
        return "Hello World!";
    }
}
