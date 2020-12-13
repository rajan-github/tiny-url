package com.rajan.redirectservice.redirect;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManagerFactory;
import java.net.URL;

@Repository
public interface URLDataRepository extends JpaRepository<URLData, Long>, URLDataRepositoryCustom<URLData, Long> {
    public URLData getByShortUrl(String shortUrl);
}
