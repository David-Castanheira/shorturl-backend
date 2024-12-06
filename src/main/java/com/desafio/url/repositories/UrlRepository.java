package com.desafio.url.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.desafio.url.entities.Url;
import java.util.Optional;

public interface UrlRepository extends JpaRepository<Url, Long> {
    Optional<Url> findByShortUrl(String shortUrl);
}
