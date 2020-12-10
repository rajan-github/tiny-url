package com.rajan.redirectservice.redirect;

import javax.persistence.Entity;
import java.util.Objects;

@Entity
public class URLData {
    private Long id;
    private String longUrl;
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
