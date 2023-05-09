package com.springone.demoone.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

@Document(collection = "students")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Student {

    @Id
    private int id;
    private String name;
    private Date dateOfBirth;
    private Double average;
}
