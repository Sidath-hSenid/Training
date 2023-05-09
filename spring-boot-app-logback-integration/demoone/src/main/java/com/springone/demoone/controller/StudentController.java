package com.springone.demoone.controller;

import com.springone.demoone.dto.StudentRequestDTO;
import com.springone.demoone.dto.StudentResponseDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.springone.demoone.service.StudentService;

import java.util.List;

@RestController
@RequestMapping("/api")
public class StudentController {

    @Autowired

    private StudentService studentService;

    @PostMapping("/students")
    public ResponseEntity<StudentRequestDTO> addStudent(@RequestBody StudentRequestDTO studentRequestDTO){
        return new ResponseEntity(studentService.addStudent(studentRequestDTO), HttpStatus.OK);
    }

    @GetMapping("/students")
    public ResponseEntity<List<StudentResponseDTO>> getStudents(){
        return new ResponseEntity(studentService.getStudents(), HttpStatus.OK);
    }

    @GetMapping("/students/{id}")
    public ResponseEntity<StudentResponseDTO> getStudentById(@PathVariable int id) {
        return new ResponseEntity(studentService.getStudentById(id), HttpStatus.OK);
    }

    @DeleteMapping("/students/{id}")
    public boolean deleteProduct(@PathVariable int id) {
        studentService.deleteStudent(id);
        return true;
    }
}
