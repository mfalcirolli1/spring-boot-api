package com.mfal.spring_app.service;

import org.springframework.stereotype.Service;

@Service
public class HelloWorldService {

    public String generateHelloWorld(String name) {

        return STR."Hello, World! \{name}";
    }
}
