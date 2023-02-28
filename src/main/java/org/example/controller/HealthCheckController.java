package org.example.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HealthCheckController {

    @GetMapping("/health")
    public String healthCheck() {
        System.out.println("some");
        return "I'm alive";
    }

    @GetMapping("/ulyana")
    public String ulyana() {
        return "EN: Ulyana loh \nRU: Ульяна лох)";
    }

}
