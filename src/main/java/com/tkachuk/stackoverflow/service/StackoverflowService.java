package com.tkachuk.stackoverflow.service;

import com.tkachuk.stackoverflow.model.StackoverflowWebsite;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class StackoverflowService {

    private static List<StackoverflowWebsite> items = new ArrayList<>();

    static {
        items.add(new StackoverflowWebsite(
                "stackoverflow",
                "http://stackoverflow.com",
                "http://cdn.sstatic.net/Sites/stackoverflow/img/favicon.ico",
                "Stack Overflow",
                "For programmers")
        );
    }

    public List<StackoverflowWebsite> findAll() {
        return items;
    }
}
