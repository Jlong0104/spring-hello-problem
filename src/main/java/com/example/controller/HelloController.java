package com.example.controller;

import com.example.service.LockSimulator;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/hello")
    public String hello() {
        synchronized (LockSimulator.globalLock) {
            return "Hello World";
        }
    }
}
