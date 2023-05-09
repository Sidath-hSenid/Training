package com.studentdata;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String[] subjectList = {"Maths", "English", "History"};
        Student studentObj = new Student();

        // Initializing values
        studentObj.id = 1;
        studentObj.name ="john";
        studentObj.age =20;
        studentObj.subjects = Arrays.asList(subjectList);

        // Print Outputs
        System.out.println("Student ID: " + studentObj.getId());
        System.out.println("Student Name: " + studentObj.getName());
        System.out.println("Student Age: " + studentObj.getAge());
        System.out.println("Student Subjects: " + studentObj.getSubjects());

    }
}