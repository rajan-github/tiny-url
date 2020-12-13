package com.rajan.redirectservice.redirect;

public interface URLDataRepositoryCustom<S extends URLData, Long> {
    S save(URLData entity);
}
