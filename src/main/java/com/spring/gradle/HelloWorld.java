package com.spring.gradle;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorld {

    @GetMapping("/message")
    public String getMessaage() {
        return "HELLO WORLD";
    }
}
