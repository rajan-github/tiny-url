package com.rajan.shorturlservice;

public interface URLDataRepositoryCustom<S extends URLData, Long> {
    S save(URLData entity);
}

