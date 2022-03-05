package com.example.demo.reposatory;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.Costumar;
import com.example.demo.model.CountryCurrencies;

public interface CountryCurrenciesRepo extends JpaRepository<CountryCurrencies, String> {

}
