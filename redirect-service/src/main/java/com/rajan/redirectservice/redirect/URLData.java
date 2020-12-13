package com.rajan.redirectservice.redirect;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.UniqueConstraint;
import java.util.Objects;

@Entity
public class URLData {
    @Id
    private Long id;

    @Column(unique = true)
    private String longUrl;

    @Column(unique=true)
    private String shortUrl;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getLongUrl() {
        return longUrl;
    }

    public void setLongUrl(String longUrl) {
        this.longUrl = longUrl;
    }

    public String getShortUrl() {
        return shortUrl;
    }

    public void setShortUrl(String shortUrl) {
        this.shortUrl = shortUrl;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        URLData urlData = (URLData) o;
        return Objects.equals(id, urlData.id) &&
                Objects.equals(longUrl, urlData.longUrl) &&
                Objects.equals(shortUrl, urlData.shortUrl);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, longUrl, shortUrl);
    }
}
