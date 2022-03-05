package com.example.demo.reposatory;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Employee;
@Repository
public interface EmployeeReprosatory extends JpaRepository<Employee, Long> {

}
