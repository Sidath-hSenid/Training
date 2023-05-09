package com.springone.demoone.service;

import com.springone.demoone.dto.StudentRequestDTO;
import com.springone.demoone.dto.StudentResponseDTO;

import java.util.List;

public interface StudentService {
    StudentRequestDTO addStudent(StudentRequestDTO studentRequestDTO);

    List<StudentResponseDTO> getStudents();

    StudentResponseDTO getStudentById(int id);

    void deleteStudent(int id);
}
