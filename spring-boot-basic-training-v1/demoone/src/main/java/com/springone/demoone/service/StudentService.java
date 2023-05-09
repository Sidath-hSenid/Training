package com.springone.demoone.service;

import com.springone.demoone.entity.StudentEntity;

import java.util.List;
import java.util.Optional;

public interface StudentService {
    int addStudent(StudentEntity students);

    List<StudentEntity> getStudents();

    Optional<StudentEntity> getStudentById(int id);

    void deleteStudent(int id);
}
