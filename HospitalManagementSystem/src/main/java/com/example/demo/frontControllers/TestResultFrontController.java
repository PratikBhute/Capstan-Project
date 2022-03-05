package com.example.demo.frontControllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.demo.model.TestResult;
import com.example.demo.serviceImple.TestResultServiceImple;

@Controller
public class TestResultFrontController {

	@Autowired
	private TestResultServiceImple testResultServiceImple;
	
	//it is used to fetch list data from the database
	@GetMapping("/listOfTestResult")
	public String listTestResult(Model model) {
		model.addAttribute("testResultRef", testResultServiceImple.viewResultofAllPatient());
		return "listTestResult";
	}
	
	//it is resposniblr to load the input field
	@GetMapping("/loadTestResultForm")
	public String loadTestResult(Model model) {
		TestResult testResult=new TestResult();
		model.addAttribute("addTestResultRef", testResult);
		return "testResultForm";
	}
	
	//it is responsible to save the field
	@PostMapping("/saveTestResult")
	public String saveTestResult(TestResult testResult) {
		testResultServiceImple.addTestResult(testResult);
		return "redirect:/listOfTestResult";
	}
	
	//it is used to delete results
	@GetMapping("/deleteTestResult/{id}")
	public String deleteTestResult(@PathVariable Integer id) {
		testResultServiceImple.removeTestResultById(id);
		return "redirect:/listOfTestResult";
	}
}
