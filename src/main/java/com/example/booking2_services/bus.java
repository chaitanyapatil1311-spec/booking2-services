package com.example.booking2_services;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class bus {
    @GetMapping("/bus")
    public String getData() {
        return "Please book of bus ticket 30% discount" ;
    }
}