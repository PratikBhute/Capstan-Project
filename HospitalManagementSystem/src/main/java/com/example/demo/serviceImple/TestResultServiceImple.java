package com.example.demo.serviceImple;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Patient;
import com.example.demo.model.TestResult;
import com.example.demo.repository.TestResultRepository;
import com.example.demo.services.TestResultService;

@Service
public class TestResultServiceImple implements TestResultService {

	@Autowired
	private TestResultRepository testResultRepository;

	@Override
	public List<TestResult> viewResultofAllPatient() {
		// TODO Auto-generated method stub
		return testResultRepository.findAll();
	}

	@Override
	public TestResult viewResultById(Integer id) {
		// TODO Auto-generated method stub
		return testResultRepository.findById(id).get();
	}

	@Override
	public TestResult addTestResult(TestResult tr) {
		// TODO Auto-generated method stub
		return testResultRepository.save(tr);
	}

	@Override
	public TestResult updateTestResult(TestResult tr) {
		// TODO Auto-generated method stub
		return testResultRepository.save(tr);
	}

	@Override
	public String removeTestResultById(Integer id) {
		// TODO Auto-generated method stub
		testResultRepository.deleteById(id);
		return "deleted";
	}

}
