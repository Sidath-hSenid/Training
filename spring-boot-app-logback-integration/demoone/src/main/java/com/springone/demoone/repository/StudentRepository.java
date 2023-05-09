package com.springone.demoone.repository;

import com.springone.demoone.dto.StudentRequestDTO;
import com.springone.demoone.model.Student;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends MongoRepository<Student, Integer> {
    StudentRequestDTO findByName(String name);
}
