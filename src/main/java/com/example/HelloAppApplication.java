package com.example;

import com.example.service.LockSimulator;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HelloAppApplication {
    public static void main(String[] args) {
        SpringApplication.run(HelloAppApplication.class, args);
        new LockSimulator().start();
    }
}
