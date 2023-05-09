package com.springone.demoone.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class StudentResponseDTO {
    private int id;
    private String name;
    private Date dateOfBirth;
    private double average;

}