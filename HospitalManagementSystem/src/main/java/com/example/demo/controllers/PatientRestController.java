package com.example.demo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Patient;
import com.example.demo.serviceImple.PatientServiceImple;

@RestController
@RequestMapping("/patient")
public class PatientRestController {

	@Autowired
	private PatientServiceImple patientServiceImple;
	
	@GetMapping("/greet")
	public String greeting() {
		return "Hello";
	}
	
	@GetMapping("/get")
	public List<Patient> getPatient(){
		return patientServiceImple.viewPatient();
	}
	
	@GetMapping("/getById")
	public Patient getPatientById(Integer id) {
		return patientServiceImple.viewById(id);
	}
	
	@PostMapping("/post")	
	public Patient savePatient(@RequestBody Patient patient) {
		return patientServiceImple.registerPatient(patient);
	}
	
	@DeleteMapping("/delete/{id}")
	public String erasePatient(@PathVariable Integer id) {
		return patientServiceImple.deletePatient(id);
	}
}
