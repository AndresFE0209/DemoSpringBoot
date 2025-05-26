package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class EndPointsController {
    @GetMapping("/endpoints1")
    public Map<String, String>endpoints1() {
        Map<String, String> response = new HashMap<>();
        response.put("message", "Endpoints 1");
        return response;
    }


    @GetMapping("/endpoints2")
    public Map<String, String>endpoints2() {
        Map<String, String> response = new HashMap<>();
        response.put("message", "Endpoints 2");
        return response;
    }
}
