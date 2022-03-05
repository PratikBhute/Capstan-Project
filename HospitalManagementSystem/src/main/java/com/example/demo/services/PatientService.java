package com.example.demo.services;

import java.util.List;

import com.example.demo.model.Patient;

public interface PatientService {

	public Patient registerPatient(Patient patient);

	public List<Patient> viewPatient();
	
	public Patient viewById(Integer id);

	public String deletePatient(Integer id);
}
