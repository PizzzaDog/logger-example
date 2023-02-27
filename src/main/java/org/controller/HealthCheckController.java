package org.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HealthCheckController {

    @GetMapping("/health")
    public String healthCheck() {
        return "I'm alive";
    }

    @GetMapping("/ulyana")
    public String ulyana() {
        return "EN: Ulyana loh \nRU: Ульяна лох)";
    }

}
