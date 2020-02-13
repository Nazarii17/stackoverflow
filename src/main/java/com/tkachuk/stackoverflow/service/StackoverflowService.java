package com.tkachuk.stackoverflow.service;

import com.google.common.collect.ImmutableList;
import com.tkachuk.stackoverflow.model.SiteDto;
import com.tkachuk.stackoverflow.model.StackoverflowWebsite;
import com.tkachuk.stackoverflow.repository.StackoverflowWebsiteRepository;
import lombok.NonNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

import static java.util.stream.Collectors.collectingAndThen;
import static java.util.stream.Collectors.toList;

@Service
public class StackoverflowService {
    private final StackoverflowWebsiteRepository repository;
    private final StackExchangeClient stackExchangeClient;

    @Autowired
    public StackoverflowService(StackoverflowWebsiteRepository repository, StackExchangeClient stackExchangeClient) {
        this.repository = repository;
        this.stackExchangeClient = stackExchangeClient;
    }

    /**
     * Converts given not null SiteDto to StackoverflowWebsite
     *
     * @param input - SiteDto
     * @return - StackoverflowWebsite
     */
    private StackoverflowWebsite toStackoverflowWebsite(@NonNull SiteDto input) {
        return new StackoverflowWebsite(
                input.getSite_url().substring("http:// ".length(), input.getSite_url().length() - ".com".length()),
                input.getSite_url(),
                input.getFavicon_url(),
                input.getName(),
                input.getAudience()
        );
    }

    /**
     * Finds and returns all StackoverflowWebsites from the https://api.stackexchange.com/
     *
     * @return list of websites from https://api.stackexchange.com/
     */
    public List<StackoverflowWebsite> findAll() {
        return stackExchangeClient.getSites().stream()
                .map(this::toStackoverflowWebsite)
                .filter(this::ignoreMeta)
                .collect(collectingAndThen(toList(), ImmutableList::copyOf));
    }

    /**
     * Checks stackoverflowWebsite, if id of the site hasn't "meta.", method returns true
     *
     * @param stackoverflowWebsite to parse
     * @return true if ID of stackoverflowWebsite doesn't have "meta."
     */
    private boolean ignoreMeta(@NonNull StackoverflowWebsite stackoverflowWebsite) {
        return !stackoverflowWebsite.getId().startsWith("meta.");
    }

    /**
     * Finds and returns all StackoverflowWebsites from the DB
     * @return list of websites from db
     */
//    public List<StackoverflowWebsite> findAll() {
//        return repository.findAll();
//    }
}
