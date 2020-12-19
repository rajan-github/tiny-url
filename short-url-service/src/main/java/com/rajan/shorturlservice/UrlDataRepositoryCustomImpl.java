package com.rajan.shorturlservice;

import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.EntityManager;
import javax.transaction.Transactional;

public class UrlDataRepositoryCustomImpl implements URLDataRepositoryCustom<URLData, Long> {
    @Autowired
    EntityManager entityManager;


    @Transactional
    @Override
    public URLData save(URLData entity) {
        if (entityManager != null) {
            String longUrl = entity.getLongUrl();
            URLData savedEntity = (URLData) entityManager.createQuery("select * from URLData where URLData.longUrl like : longUrl").setParameter("longUrl", entity.getLongUrl()).getSingleResult();
            if (savedEntity != null) {
                return savedEntity;
            } else {
                entityManager.persist(entity);
            }
            return entity;
        } else {
            throw new IllegalStateException("Entity manage is null.");
        }
    }
}

