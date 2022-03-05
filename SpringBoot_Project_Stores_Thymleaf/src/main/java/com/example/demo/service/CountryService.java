package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.demo.model.Costumar;
import com.example.demo.model.Country;
import com.example.demo.reposatory.CostumarRepo;
import com.example.demo.reposatory.CountryRepo;

public class CountryService {

	@Autowired
	private CountryRepo countryRepo;
	
	public Country save(Country country) {
		return countryRepo.save(country);	
	}
	
	public List<Country> getAll(){
		return countryRepo.findAll();
	}
	
	public Country update(Country country)
	{
		return countryRepo.save(country);
	}
	
	public String delete(Country  country) {
		countryRepo.delete(country);
		return "Delete Country";
}
	
}
