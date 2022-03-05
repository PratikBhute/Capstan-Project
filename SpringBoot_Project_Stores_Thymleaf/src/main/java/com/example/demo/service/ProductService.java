package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.demo.model.Currency;
import com.example.demo.model.Products;
import com.example.demo.reposatory.CurrencyRepo;
import com.example.demo.reposatory.ProductRepo;

public class ProductService
{
	@Autowired
	private ProductRepo productRepo;

	public Products save(Products  products) {
		return productRepo.save(products);	
	}
	
	public List<Products> getAll(){
		return productRepo.findAll();
	}
	
	public Products update(Products products)
	{
		return productRepo.save(products);
	}
	
	public String delete(Products  products) {
		productRepo.delete(products);
		return "Delete Products";
}

}
