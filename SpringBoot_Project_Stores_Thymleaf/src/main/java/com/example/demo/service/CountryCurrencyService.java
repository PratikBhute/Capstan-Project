package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.demo.model.Country;
import com.example.demo.model.CountryCurrencies;
import com.example.demo.reposatory.CountryCurrenciesRepo;
import com.example.demo.reposatory.CountryRepo;

public class CountryCurrencyService {

	@Autowired
	private CountryCurrenciesRepo countryCurrenciesRepo;
	
	public CountryCurrencies save(CountryCurrencies  countryCurrencies) {
		return countryCurrenciesRepo.save(countryCurrencies);	
	}
	
	public List<CountryCurrencies> getAll(){
		return countryCurrenciesRepo.findAll();
	}
	
	public CountryCurrencies update(CountryCurrencies countryCurrencies)
	{
		return countryCurrenciesRepo.save(countryCurrencies);
	}
	
	public String delete(CountryCurrencies  countryCurrencies) {
		countryCurrenciesRepo.delete(countryCurrencies);
		return "Delete Country";
}
}
