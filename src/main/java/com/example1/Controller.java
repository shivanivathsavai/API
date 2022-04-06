package com.example1;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class Controller {
    @GetMapping("/helloworld")
    public String HelloWorld() {
        return "Hello World";
    }
}
