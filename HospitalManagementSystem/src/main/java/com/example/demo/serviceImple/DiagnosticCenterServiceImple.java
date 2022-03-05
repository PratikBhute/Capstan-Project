package com.example.demo.serviceImple;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.DiagnosticCenter;
import com.example.demo.repository.DiagnosticCenterRepository;
import com.example.demo.services.DiagnosticCenterService;

@Service
public class DiagnosticCenterServiceImple implements DiagnosticCenterService {

	@Autowired
	private DiagnosticCenterRepository diagnosticCenterRepository;

	@Override
	public List<DiagnosticCenter> getAllDiagnosticCenters() {
		// TODO Auto-generated method stub
		return diagnosticCenterRepository.findAll();
	}

	@Override
	public DiagnosticCenter getDiagnosticCenterById(Integer diagnosticCenterId) {
		// TODO Auto-generated method stub
		return diagnosticCenterRepository.findById(diagnosticCenterId).get();
	}

	@Override
	public DiagnosticCenter addDiagnosticCenter(DiagnosticCenter diagnosticCenter) {
		// TODO Auto-generated method stub
		return diagnosticCenterRepository.save(diagnosticCenter);
	}

	@Override
	public DiagnosticCenter updateDiagnosticCenter(DiagnosticCenter diagnosticCenter) {
		// TODO Auto-generated method stub
		return diagnosticCenterRepository.save(diagnosticCenter);
	}

	@Override
	public String removeDiagnosticCenter(Integer id) {
		// TODO Auto-generated method stub
		diagnosticCenterRepository.deleteById(id);
		return "deleted";
	}

}
