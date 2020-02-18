package com.tkachuk.stackoverflow.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Random;

@RestController
public class HealthService {
    @RequestMapping("/health")
    public String getStatus() {
        return "OK";
    }
}
