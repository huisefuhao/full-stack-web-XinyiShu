package edu.infsci2560.repositories;
//package com.hellokoding.auth.repository;

import edu.infsci2560.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByUsername(String username);
}