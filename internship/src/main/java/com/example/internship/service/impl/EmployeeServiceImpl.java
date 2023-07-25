package com.example.internship.service.impl;

import java.util.List;


import org.springframework.stereotype.Service;

import com.example.internship.exception.ResourceNotFoundException;
import com.example.internship.model.Employee;
import com.example.internship.repository.EmployeeRepository;
import com.example.internship.service.EmployeeService;

@Service
public class EmployeeServiceImpl implements EmployeeService{

	private EmployeeRepository employeeRepository;
	
	public EmployeeServiceImpl(EmployeeRepository employeeRepository) {
		super();
		this.employeeRepository = employeeRepository;
	}

	@Override
	public Employee saveEmployee(Employee employee) {
		return employeeRepository.save(employee);
	}

	@Override
	public List<Employee> getAllEmployees() {
		return employeeRepository.findAll();
	}

	@Override
	public Employee getEmployeeById(long id) {
		return employeeRepository.findById(id).orElseThrow(() -> 
						new ResourceNotFoundException("Employee", "Id", id));
		
	}

	@Override
	public Employee updateEmployee(Employee employee, long id) {
		
		Employee existingEmployee = employeeRepository.findById(id).orElseThrow(
				() -> new ResourceNotFoundException("Employee", "Id", id)); 
		
		existingEmployee.setEmployeeName(employee.getEmployeeName());
		existingEmployee.setPhoneNumber(employee.getPhoneNumber());
		existingEmployee.setEmail(employee.getEmail());
		existingEmployee.setReportsTo(employee.getReportsTo());
		existingEmployee.setProfileImage(employee.getProfileImage());
		employeeRepository.save(existingEmployee);
		return existingEmployee;
	}

	@Override
	public void deleteEmployee(long id) {
		
		employeeRepository.findById(id).orElseThrow(() -> 
								new ResourceNotFoundException("Employee", "Id", id));
		employeeRepository.deleteById(id);
	}
	
}
