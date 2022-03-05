package com.example.demo.service;

import java.util.List;

import com.example.demo.model.Employee;

public interface EmployeeService
{
	List<Employee> getAllEmployees();
	
	 void saveEmployee(Employee employee);
	 
	 Employee getEmployeeById(Long id);
	 
	 void deleteEmployee(Long id);
	
	

}
