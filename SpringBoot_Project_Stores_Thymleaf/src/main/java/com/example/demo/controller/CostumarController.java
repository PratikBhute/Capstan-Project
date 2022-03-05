package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.demo.model.Costumar;
import com.example.demo.service.CostumarService;

@Controller
public class CostumarController
{
	@Autowired
	private CostumarService costumarService;
	
	@GetMapping("/")
	public String ViewHomePage(Model model) 
	{
		model.addAttribute("listCostumar",costumarService.getAllCostumar());
				return "index";
	}

	@GetMapping("/showNewCostumarform")
	public String showNewCostumarform(Model model) {
		Costumar costumar=new Costumar();
		model.addAttribute("costumar", costumar);
		return "new_costumar";
		
	}
	@PostMapping("/saveCostumar")
	public String saveCostumar(@ModelAttribute("costumar") Costumar costumar) {
		costumarService.save(costumar);
		return "redirect:/" ; 		
	}
	@GetMapping("/showFormforUpdate/{id}")
	public String showFormforUpdate(@PathVariable (value = "id") long id, Model model) {
		Costumar costumar=(Costumar) costumarService.getCostumarById(id);
		model.addAttribute("costumar", costumar);
		return "update_Costumar";
	}
	
	@GetMapping("/deleteCostumar/{id}")
	public String deleteCostumar (@PathVariable (value = "id") long id, Model model) {
		this.costumarService.deleteCostumarById(null);
		return "redirect:/";
	}
}





