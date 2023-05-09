package com.studentdata;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

public class Student {
    // Added lombok method to remove Getters and Setters
    @Getter @Setter int id;
    @Getter @Setter String name;
    @Getter @Setter int age;
    @Getter @Setter List<String> subjects;

//    // Getters and Setters for Student attributes
//    public int getId() {
//        return id;
//    }
//
//    public void setId(int id) {
//        this.id = id;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public int getAge() {
//        return age;
//    }
//
//    public void setAge(int age) {
//        this.age = age;
//    }
//
//    public List<String> getSubjects() {
//        return subjects;
//    }
//
//    public void setSubjects(List<String> subjects) {
//        this.subjects = subjects;
//    }

}
