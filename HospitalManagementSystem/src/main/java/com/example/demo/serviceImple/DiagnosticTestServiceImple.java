package com.example.demo.serviceImple;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.DiagnosticTest;
import com.example.demo.repository.DiagnosticTestRepository;
import com.example.demo.services.DiagnosticTestService;

@Service
public class DiagnosticTestServiceImple implements DiagnosticTestService {

	@Autowired
	private DiagnosticTestRepository diagnosticTestRepository;

	@Override
	public List<DiagnosticTest> getAllTest() {
		// TODO Auto-generated method stub
		return diagnosticTestRepository.findAll();
	}

	@Override
	public DiagnosticTest getTestById(Integer id) {
		// TODO Auto-generated method stub
		return diagnosticTestRepository.findById(id).get();
	}

	@Override
	public DiagnosticTest addTest(DiagnosticTest diagnosticTest) {
		// TODO Auto-generated method stub
		return diagnosticTestRepository.save(diagnosticTest);
	}

	@Override
	public DiagnosticTest updateTestDetails(DiagnosticTest test) {
		// TODO Auto-generated method stub
		return diagnosticTestRepository.save(test);
	}

	@Override
	public String removeTestById(Integer id) {
		// TODO Auto-generated method stub
		diagnosticTestRepository.deleteById(id);
		return "Deleted";
	}

}
