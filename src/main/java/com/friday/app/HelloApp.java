package com.friday.app;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloApp {

    @GetMapping("/")
    public String home() {
        return "Spring Boot App is Running Successfully! 🎉";
    }

    @GetMapping("/hello")
    public String sayHello() {
        return "Assalamu Alaikum from Spring Boot! 👋";
    }
}
