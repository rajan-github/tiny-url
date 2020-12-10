package com.rajan.redirectservice.redirect;

import org.springframework.hateoas.EntityModel;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RedirectController {

    private final URLDataRepository repository;

    public RedirectController(URLDataRepository repository){
        this.repository=repository;
    }

    @GetMapping("/shortUrl/{id}")
    public EntityModel<URLData> getLongUrl(@PathVariable String id){
        String longUrl;

    }
}
