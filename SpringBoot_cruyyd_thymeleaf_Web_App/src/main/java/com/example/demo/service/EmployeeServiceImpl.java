package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Employee;
import com.example.demo.reposatory.EmployeeReprosatory;
@Service
public  class EmployeeServiceImpl implements EmployeeService
{
	@Autowired
	private EmployeeReprosatory employeeReprosatory;

	@Override
	public List<Employee> getAllEmployees() {
		// TODO Auto-generated method stub
		return employeeReprosatory.findAll();
	}

	@Override
	public void saveEmployee(Employee employee){
		this.employeeReprosatory.save(employee);
		
	}

	@Override
	public Employee getEmployeeById(Long id) {
		// TODO Auto-generated method stub
		Optional<Employee> optional=employeeReprosatory.findById(id);
		Employee employee= null;
		if(optional.isPresent()) {
			employee=optional.get();
		}
		else {
			throw new RuntimeException("Employee not found for id::" + id);
		}
		return employee;
	}

	@Override
	public void deleteEmployee(Long id) {
		this.employeeReprosatory.deleteById(id);
	}
	

}
