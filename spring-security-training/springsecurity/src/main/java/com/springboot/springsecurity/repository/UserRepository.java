package com.springboot.springsecurity.repository;

import com.springboot.springsecurity.model.User;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.Optional;

public interface UserRepository extends MongoRepository<User, String> {
    Optional<User> findById(String id);

    Optional<User> findByUsername(String userName);

     boolean existsByEmail(String userName);

     boolean existsByUsername(String email);

}
