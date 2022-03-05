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

import com.example.demo.model.DiagnosticCenter;
import com.example.demo.serviceImple.DiagnosticCenterServiceImple;

@RestController
@RequestMapping("/diagnosticCenter")
public class DiagnosticCenterRestController {

	@Autowired
	private DiagnosticCenterServiceImple diagnosticCenterServiceImple;
	
	@GetMapping("/get")
	public List<DiagnosticCenter> obtainAllDiagnosticCenters() {
		// TODO Auto-generated method stub
		return diagnosticCenterServiceImple.getAllDiagnosticCenters();
	}

	@GetMapping("/get/{id}")
	public DiagnosticCenter obtainDiagnosticCenterById(@PathVariable Integer diagnosticCenterId) {
		// TODO Auto-generated method stub
		return diagnosticCenterServiceImple.getDiagnosticCenterById(diagnosticCenterId);
	}

	@PostMapping("/post")
	public DiagnosticCenter saveDiagnosticCenter(@RequestBody DiagnosticCenter diagnosticCenter) {
		// TODO Auto-generated method stub
		return diagnosticCenterServiceImple.addDiagnosticCenter(diagnosticCenter);
	}

	@PutMapping("/update")
	public DiagnosticCenter updateDiagnosticCenter(@RequestBody DiagnosticCenter diagnosticCenter) {
		// TODO Auto-generated method stub
		return diagnosticCenterServiceImple.addDiagnosticCenter(diagnosticCenter);
	}

	@DeleteMapping("/delete/{id}")
	public String deleteDiagnosticCenter(@PathVariable Integer id) {
		// TODO Auto-generated method stub
		diagnosticCenterServiceImple.removeDiagnosticCenter(id);
		return "deleted";
	}

}
