package com.example.demo.frontControllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.DiagnosticTest;
import com.example.demo.serviceImple.DiagnosticTestServiceImple;

@Controller
public class DiagnosticTestFrontController {

	@Autowired
	private DiagnosticTestServiceImple diagnosticTestServiceImple;
	
	@GetMapping("/demoChecking")
	public String name() {
		return "check done";
	}
	
	//this end point will show all the list of test available
	@GetMapping("/listOfDiagTest")
	public String listDiagnosticTest(Model model){
		List<DiagnosticTest> test=diagnosticTestServiceImple.getAllTest();
		model.addAttribute("diagTestRef", diagnosticTestServiceImple.getAllTest());
		return "listDiagTest";
		
	}
	
	@GetMapping("/loadDiagTestRegistrationForm")
	public String loadTestForm(Model model) {
		DiagnosticTest diagnosticTest=new DiagnosticTest();
		model.addAttribute("addDiagTestRef", diagnosticTest);
		return "diagTestRegistrationForm";
	}
	
	@PostMapping("/saveDiagTest")
	public String saveTest(DiagnosticTest diagnosticTest) {
       diagnosticTestServiceImple.addTest(diagnosticTest);
		return "redirect:/listOfDiagTest";
	}
	
	@GetMapping("/deleteDiagTest/{id}")
	public String deleteDiagTest(@PathVariable Integer id) {
		diagnosticTestServiceImple.removeTestById(id);
		return "redirect:/listOfDiagTest";
	}
}
