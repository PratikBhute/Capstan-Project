package com.example.demo.serviceImple;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Patient;
import com.example.demo.repository.PatientRepository;
import com.example.demo.services.PatientService;

@Service
public class PatientServiceImple implements PatientService {

	@Autowired
	private PatientRepository patientRepository;

	@Override
	public Patient registerPatient(Patient patient) {
		// TODO Auto-generated method stub
		return patientRepository.save(patient);
	}

	@Override
	public List<Patient> viewPatient() {
		// TODO Auto-generated method stub
		return patientRepository.findAll();
	}

	@Override
	public Patient viewById(Integer id) {
		// TODO Auto-generated method stub
		return patientRepository.getById(id);
	}

	@Override
	public String deletePatient(Integer id) {
		// TODO Auto-generated method stub
		patientRepository.deleteById(id);
		return "deleted" + id;
	}

}
