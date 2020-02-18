package com.tkachuk.stackoverflow.web;

import com.tkachuk.stackoverflow.service.HealthService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HealthCheckController {
    @Autowired
    private HealthService healthService;

    @RequestMapping("/check")
    public String checkStatus() {
        return healthService.getHealth();
    }
}
