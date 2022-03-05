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

import com.example.demo.model.DiagnosticTest;
import com.example.demo.serviceImple.DiagnosticTestServiceImple;

@RestController
@RequestMapping("/diagnosticTest")
public class DiagnosticTestRestController {

	@Autowired
	private DiagnosticTestServiceImple diagnosticTestServiceImple;
	
	@GetMapping("/getAll")
	public List<DiagnosticTest> ObtainAllTest() {
		// TODO Auto-generated method stub
		return diagnosticTestServiceImple.getAllTest();
	}

	@GetMapping("/get/{id}")
	public DiagnosticTest obtainTestById(@PathVariable Integer id) {
		// TODO Auto-generated method stub
		return diagnosticTestServiceImple.getTestById(id);
	}

	@PostMapping("/post")
	public DiagnosticTest saveTest(@RequestBody DiagnosticTest diagnosticTest) {
		// TODO Auto-generated method stub
		return diagnosticTestServiceImple.addTest(diagnosticTest);
	}
	
	@PutMapping("/update")
	public DiagnosticTest modifyTestDetails(@RequestBody DiagnosticTest test) {
		// TODO Auto-generated method stub
		return diagnosticTestServiceImple.updateTestDetails(test);
	}

	@DeleteMapping("/delete/{id}")
	public String deleteTestById(@PathVariable Integer id) {
		// TODO Auto-generated method stub
		 diagnosticTestServiceImple.removeTestById(id);
		 return "Deleted";
	}

}
