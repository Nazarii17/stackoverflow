package com.tkachuk.stackoverflow.web;

import com.tkachuk.stackoverflow.model.StackoverflowWebsite;
import com.tkachuk.stackoverflow.service.StackoverflowService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/stackoverflow")
public class StackoverflowController {

    private final StackoverflowService stackoverflowService;

    @Autowired
    public StackoverflowController(StackoverflowService stackoverflowService) {
        this.stackoverflowService = stackoverflowService;
    }

    @RequestMapping
    public List<StackoverflowWebsite> getListOfProviders() {
        return stackoverflowService.findAll();
    }
}
