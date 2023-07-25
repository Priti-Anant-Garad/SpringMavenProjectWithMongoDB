package com.example.internship.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.internship.model.Employee;

public interface EmployeeRepository extends MongoRepository<Employee, Long>{

}
