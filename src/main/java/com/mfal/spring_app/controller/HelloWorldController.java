package com.mfal.spring_app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.mfal.spring_app.service.HelloWorldService;
import com.mfal.spring_app.domain.User;

@RestController
@RequestMapping("/hello-world")
public class HelloWorldController {

    @Autowired
    private HelloWorldService helloWorldService;

    @GetMapping("/get-message")
    public String getMessage() {

        try {
            return helloWorldService.generateHelloWorld("Chaves");
        }
        catch (Exception ex){
            return "Hello, World";
        }
    }

    @PostMapping("/{id}")
    public String createMessage(@RequestBody User body, @PathVariable String id, @RequestParam(value = "filter", defaultValue = "not defined") String filter) {
        try {
            return STR."Message created: \{body.name} with ID \{id} \nFilter: \{filter}";
        }
        catch (Exception ex) {
            return "Error";
        }
    }
}
