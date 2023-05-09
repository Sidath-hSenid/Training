package com.springone.demoone.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.springone.demoone.entity.StudentEntity;
import com.springone.demoone.service.StudentService;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api")
public class StudentController {

    @Autowired

    private StudentService studentService;

    @GetMapping("/students")
    public List<StudentEntity> getStudents(){
        return studentService.getStudents();
    }

    @PostMapping("/students")
    public int addStudent(@RequestBody StudentEntity students){
        return studentService.addStudent(students);
    }

    @GetMapping("/students/{id}")
    public ResponseEntity<Optional<StudentEntity>> getStudentById(@PathVariable int id) {
        return ResponseEntity.ok().body(studentService.getStudentById(id));
    }

    @DeleteMapping("/students/{id}")
    public void deleteProduct(@PathVariable int id) {
        studentService.deleteStudent(id);
    }
}
