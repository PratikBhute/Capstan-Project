package com.example.demo.reposatory;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.Costumar;
import com.example.demo.model.Country;

public interface CountryRepo extends JpaRepository<Country, String> {

}
