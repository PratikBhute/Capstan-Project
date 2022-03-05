package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.demo.model.Sales;
import com.example.demo.model.Stores;
import com.example.demo.reposatory.SalesRepo;
import com.example.demo.reposatory.StoresRepo;

public class StoreService {
	
	@Autowired
	private StoresRepo storesRepo;

	public Stores save(Stores stores) {
		return storesRepo.save(stores);	
	}
	
	public List<Stores> getAll(){
		return storesRepo.findAll();
	}
	
	public Stores update(Stores stores)
	{
		return storesRepo.save(stores);
	}
	
	public String delete(Stores  stores) {
		storesRepo.delete(stores);
		return "Delete Stores";
}
}
