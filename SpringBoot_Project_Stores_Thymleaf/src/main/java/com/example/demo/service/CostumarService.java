package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Costumar;
import com.example.demo.model.Country;
import com.example.demo.reposatory.CostumarRepo;

@Service
public class CostumarService  
{
	
	@Autowired
	private CostumarRepo costumarRepo;
	
	public Costumar save(Costumar costumar) {
		return costumarRepo.save(costumar);
	}
	
	public List<Costumar> getAllCostumar(){
		return costumarRepo.findAll();
	}
	

	public Costumar getCostumarById(Long id) {
		// TODO Auto-generated method stub
		Optional<Costumar> optional=costumarRepo.findById(null);
		Costumar costumar= null;
		if(optional.isPresent()) {
			costumar=optional.get();
		}
		else {
			throw new RuntimeException("costumar not found for id::" + id);
		}
		return costumar;
	}
	
	public Costumar updateCostumar(Costumar costumar)
	{
		return costumarRepo.save(costumar);
	}
	
	public String deleteCostumarById(Long id) {
		costumarRepo.deleteAllById(null);
		return "Delete ";
	}

	
	
	
	
	
	
	
	
	
	
}
