package com.example.demo.ec2.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {


    @RequestMapping("/ec2")
    public String hello() {
        return "<h1> Spring Boot Application Running On EC2...<h1>";
    }
}
