package com.example.gittest.controller.ui;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentUIController {
    @RequestMapping("/hello")
    String sayHello(){
        return "<h1>hello!</h1>";
    }
}
