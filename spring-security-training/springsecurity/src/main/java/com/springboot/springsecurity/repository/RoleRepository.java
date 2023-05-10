package com.springboot.springsecurity.repository;

import com.springboot.springsecurity.model.ERole;
import com.springboot.springsecurity.model.Role;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.Optional;

public interface RoleRepository extends MongoRepository<Role, String> {
    Optional<Role> findByName(ERole name);
}
