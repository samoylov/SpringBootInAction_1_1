package com.example.security;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ReaderRepository
        extends JpaRepository<Reader, String> {
}