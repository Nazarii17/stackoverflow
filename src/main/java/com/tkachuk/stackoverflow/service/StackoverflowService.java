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
        items.add(new StackoverflowWebsite(
                "serverfault",
                "http://serverfault.com",
                "http://cdn.sstatic.net/Sites/serverfault/img/favicon.ico",
                "Server Fault",
                "For system administrators")
        );
        items.add(new StackoverflowWebsite(
                "superuser",
                "http://superuser.com",
                "http://cdn.sstatic.net/Sites/superuser/img/favicon.ico",
                "Super User",
                "For computer enthusiasts")
        );
        items.add(new StackoverflowWebsite(
                "askubuntu",
                "http://askubuntu.com",
                "http://cdn.sstatic.net/Sites/askubuntu/img/favicon.ico",
                "Ask Ubuntu",
                "For Ubuntu users")
        );
        items.add(new StackoverflowWebsite(
                "wordpress",
                "http://wordpress.com",
                "http://cdn.sstatic.net/Sites/wordpress/img/favicon.ico",
                "WordPress",
                "For WordPress users")
        );
    }

    public List<StackoverflowWebsite> findAll() {
        return items;
    }
}
