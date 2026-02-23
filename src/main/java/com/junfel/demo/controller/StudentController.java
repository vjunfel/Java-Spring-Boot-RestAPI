package com.junfel.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping()
public class StudentController {

    @GetMapping("/")
    String Home() {
        return "Hello from spring boot!";
    }

    @GetMapping("/api/students")
    String StudentController() {
        return "Hello Student!";
    }
}
