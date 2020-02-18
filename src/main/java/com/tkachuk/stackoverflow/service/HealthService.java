package com.tkachuk.stackoverflow.service;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class HealthService {
    private RestTemplate restTemplate = new RestTemplate();

    public String getHealth() {
        return restTemplate.getForObject("http://localhost:8083/health", String.class);
    }
}
