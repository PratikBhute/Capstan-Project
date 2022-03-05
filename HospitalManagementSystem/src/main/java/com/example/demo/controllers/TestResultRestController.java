package com.example.demo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Patient;
import com.example.demo.model.TestResult;
import com.example.demo.serviceImple.TestResultServiceImple;

@RestController
@RequestMapping("/testResult")
public class TestResultRestController {

	@Autowired
	private TestResultServiceImple testResultServiceImple;
	
	@GetMapping("/getAll")
	public List<TestResult> viewResultofAllPatient() {
		// TODO Auto-generated method stub
		return testResultServiceImple.viewResultofAllPatient();
	}
	
	@GetMapping("/get/{id}")
	public TestResult viewResultById(@PathVariable Integer id) {
		// TODO Auto-generated method stub
		return testResultServiceImple.viewResultById(id);
	}

	@PostMapping("/post")
	public TestResult saveTestResult(@RequestBody TestResult tr) {
		// TODO Auto-generated method stub
		return testResultServiceImple.addTestResult(tr);
	}

	
	@PutMapping("/update")
	public TestResult modifyTestResult(@RequestBody TestResult tr) {
		// TODO Auto-generated method stub
		return testResultServiceImple.updateTestResult(tr);
	}

	
	@DeleteMapping("/delete/{id}")
	public String deleteTestResultById(@PathVariable Integer id) {
		// TODO Auto-generated method stub
		testResultServiceImple.removeTestResultById(id);
		return "deleted";
	}

}
