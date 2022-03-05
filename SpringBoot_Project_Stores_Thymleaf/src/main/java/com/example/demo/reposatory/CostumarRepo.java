package com.example.demo.reposatory;

import org.aspectj.apache.bcel.util.Repository;
import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.Costumar;
import com.example.demo.model.Country;

public interface CostumarRepo extends JpaRepository<Costumar, String>
{	
	

}
