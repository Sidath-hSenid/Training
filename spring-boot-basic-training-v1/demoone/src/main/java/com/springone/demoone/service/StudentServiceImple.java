package com.springone.demoone.service;

import com.springone.demoone.entity.StudentEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.springone.demoone.repo.StudentRepo;

import java.util.List;
import java.util.Optional;

@Service
public class StudentServiceImple implements StudentService {

    @Autowired
    private StudentRepo studentRepo;

    @Override
    public int addStudent(StudentEntity students) {
        return studentRepo.save(students).getId();
    }

    @Override
    public List<StudentEntity> getStudents() {
        return studentRepo.findAll();
    }

    @Override
    public Optional<StudentEntity> getStudentById(int id) {
        return studentRepo.findById(id);
    }

    @Override
    public void deleteStudent(int id) {
        studentRepo.deleteById(id);
    }
}
