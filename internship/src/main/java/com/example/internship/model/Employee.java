package com.example.internship.model;

import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ToString
@Getter
@Setter

@Document(collection = "Employee")
public class Employee {


    private Long id;
    private String employeeName;
    private String phoneNumber;
    private String email;
    private Long reportsTo;
    private String profileImage;
   
}
