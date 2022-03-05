package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.demo.model.Region;
import com.example.demo.model.Sales;
import com.example.demo.reposatory.RegionRepo;
import com.example.demo.reposatory.SalesRepo;

public class SalesService {
	@Autowired
	private SalesRepo salesRepo;

	public Sales save(Sales   sales) {
		return salesRepo.save(sales);	
	}
	
	public List<Sales> getAll(){
		return salesRepo.findAll();
	}
	
	public Sales update(Sales sales)
	{
		return salesRepo.save(sales);
	}
	
	public String delete(Sales  sales) {
		salesRepo.delete(sales);
		return "Delete Salse";
}
}
