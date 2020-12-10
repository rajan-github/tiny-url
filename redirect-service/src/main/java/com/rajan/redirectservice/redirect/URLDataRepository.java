package com.rajan.redirectservice.redirect;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface URLDataRepository extends JpaRepository<URLData, Long> {

//    public String getByShortUrl(String shortUrl){
//
//    }
}
