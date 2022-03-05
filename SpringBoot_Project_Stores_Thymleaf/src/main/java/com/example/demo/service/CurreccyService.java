package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.demo.model.CountryCurrencies;
import com.example.demo.model.Currency;
import com.example.demo.reposatory.CountryCurrenciesRepo;
import com.example.demo.reposatory.CurrencyRepo;

public class CurreccyService {

	@Autowired
	private CurrencyRepo currencyRepo;

	public Currency save(Currency  currency) {
		return currencyRepo.save(currency);	
	}
	
	public List<Currency> getAll(){
		return currencyRepo.findAll();
	}
	
	public Currency update(Currency currency)
	{
		return currencyRepo.save(currency);
	}
	
	public String delete(Currency  currency) {
		currencyRepo.delete(currency);
		return "Delete Country";
}
}