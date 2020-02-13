package com.tkachuk.stackoverflow.repository;

import com.tkachuk.stackoverflow.model.StackoverflowWebsite;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StackoverflowWebsiteRepository extends JpaRepository<StackoverflowWebsite, String> {
}
