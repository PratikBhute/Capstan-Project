package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.demo.model.Products;
import com.example.demo.model.Region;
import com.example.demo.reposatory.ProductRepo;
import com.example.demo.reposatory.RegionRepo;

public class RegionService {
	@Autowired
	private RegionRepo regionRepo;

	public Region save(Region   region) {
		return regionRepo.save(region);	
	}
	
	public List<Region> getAll(){
		return regionRepo.findAll();
	}
	
	public Region update(Region region)
	{
		return regionRepo.save(region);
	}
	
	public String delete(Region  region) {
		regionRepo.delete(region);
		return "Delete Region";
}
}
