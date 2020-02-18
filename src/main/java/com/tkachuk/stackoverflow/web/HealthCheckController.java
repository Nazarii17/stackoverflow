package com.tkachuk.stackoverflow.web;

import com.tkachuk.stackoverflow.service.HealthService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HealthCheckController {
    private final HealthService healthService;

    @Autowired
    public HealthCheckController(HealthService healthService) {
        this.healthService = healthService;
    }

    @RequestMapping("/check")
    public String checkStatus() {
        healthService.clearAttempt();
        return healthService.getHealth();
    }
}
