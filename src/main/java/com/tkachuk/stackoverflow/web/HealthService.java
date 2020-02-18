package com.tkachuk.stackoverflow.web;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Random;

@RestController
public class HealthService {
    @RequestMapping("/health")
    public ResponseEntity<String> getStatus() {
        Random randomGenerator = new Random();
        int randomInt = randomGenerator.nextInt(2);
        if (randomInt == 1) {
            return new ResponseEntity<>("ERROR", HttpStatus.INTERNAL_SERVER_ERROR);
        } else {
            return new ResponseEntity<>("OK", HttpStatus.OK);
        }
    }
}
