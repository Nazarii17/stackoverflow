package com.tkachuk.stackoverflow.service;

import com.tkachuk.stackoverflow.model.StackoverflowWebsite;
import com.tkachuk.stackoverflow.repository.StackoverflowWebsiteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StackoverflowService {

    private final StackoverflowWebsiteRepository repository;

    @Autowired
    public StackoverflowService(StackoverflowWebsiteRepository repository) {
        this.repository = repository;
    }

    public List<StackoverflowWebsite> findAll() {
        return repository.findAll();
    }
}
