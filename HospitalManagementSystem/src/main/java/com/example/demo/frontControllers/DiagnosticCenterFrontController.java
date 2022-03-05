package com.example.demo.frontControllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.demo.model.DiagnosticCenter;
import com.example.demo.serviceImple.DiagnosticCenterServiceImple;

@Controller
public class DiagnosticCenterFrontController {

	@Autowired
	private DiagnosticCenterServiceImple diagnosticCenterServiceImple;
	
	//this is used to fetch the center list from the database
	@GetMapping("/listOfDiagnosticCenter")
	public String listDiagnosticCenter(Model model) {
		model.addAttribute("listDiagCenterRef", diagnosticCenterServiceImple.getAllDiagnosticCenters());
		return "listDiagnosticCenter";
	}
	
	//this is used to load the form so that we can save the data from input field
	@GetMapping("/loadDiagCenterForm")
	public String loadDiagnosticCenterForm(Model model) {
		DiagnosticCenter diagnosticCenter=new DiagnosticCenter();
		model.addAttribute("addDiagCenterRef", diagnosticCenter);
		return "diagCenterRegistrationForm";
		
	}
	
	//this is responsible to save the center whatever we get data from input
	@PostMapping("/saveDiagnosticCenter")
	public String saveDiagnosticCenter(DiagnosticCenter diagnosticCenter) {
		diagnosticCenterServiceImple.addDiagnosticCenter(diagnosticCenter);
		return "redirect:/listOfDiagnosticCenter";
	}
	
	//it is responsible to delete particular center
	@GetMapping("/deleteDiagCenter/{id}")
	public String deleteDiagnosticCenterById(@PathVariable Integer id) {
		diagnosticCenterServiceImple.removeDiagnosticCenter(id);
		return "redirect:/listOfDiagnosticCenter";
	}
}
