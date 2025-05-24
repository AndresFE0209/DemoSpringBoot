package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EndPointsController {
    @GetMapping("/endpoints1")
    public String endpoints1() {
        return "Endpoints 1";
    }

    @GetMapping("/endpoints2")
    public String endpoints2() {
        return "Endpoints 2";
    }
}
