package com.previred.desafiospringboot.repository;

import com.previred.desafiospringboot.model.CustomUser;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;


public interface UserRepository extends JpaRepository<CustomUser, Long> {
    Optional<CustomUser> findByUsername(String username);
    Boolean existsByUsername(String username);
}
