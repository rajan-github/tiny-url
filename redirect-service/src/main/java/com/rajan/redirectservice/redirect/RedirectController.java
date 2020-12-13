package com.rajan.redirectservice.redirect;

import org.springframework.hateoas.EntityModel;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@RestController
public class RedirectController {

    private final URLDataRepository repository;

    @PersistenceContext
    private EntityManager entityManager;

    public RedirectController(URLDataRepository repository){
        this.repository=repository;
    }

    @GetMapping("/shortUrl/{shortUrl}")
    public EntityModel<URLData> getLongUrl(@PathVariable String shortUrl){
        String longUrl;
        return null;
    }
}
