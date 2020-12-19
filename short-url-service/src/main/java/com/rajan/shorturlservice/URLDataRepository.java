package com.rajan.shorturlservice;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface URLDataRepository extends JpaRepository<URLData, Long>, URLDataRepositoryCustom<URLData, Long> {
    public URLData getByShortUrl(String shortUrl);
}