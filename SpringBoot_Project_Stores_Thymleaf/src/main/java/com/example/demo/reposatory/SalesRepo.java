package com.example.demo.reposatory;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.Costumar;
import com.example.demo.model.Sales;

public interface SalesRepo extends JpaRepository<Sales, String> {

}
