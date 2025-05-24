package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EndPointsController {
    @GetMapping("/hola")
    public String hello() {
        return "Hola, mundo!";
    }

    @GetMapping("/adios")
    public String adios() {
        return "Adiós, mundo cruel!";
    }
}
