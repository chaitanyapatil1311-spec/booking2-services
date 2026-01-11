package com.example.booking2_services;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class railway {
    @GetMapping("/railway")
    public String getData() {
        return "Please hotel ticket 30% discount" ;
    }
}