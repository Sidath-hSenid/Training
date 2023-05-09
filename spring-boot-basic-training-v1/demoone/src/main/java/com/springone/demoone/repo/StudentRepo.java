package com.springone.demoone.repo;

import com.springone.demoone.entity.StudentEntity;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepo extends MongoRepository<StudentEntity, Integer> {
}
