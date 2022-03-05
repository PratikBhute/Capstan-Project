package com.example.demo.services;

import java.util.List;

import com.example.demo.model.Patient;
import com.example.demo.model.TestResult;

public interface TestResultService {

	List<TestResult> viewResultofAllPatient();
	
	TestResult viewResultById(Integer id);
	
	TestResult addTestResult(TestResult tr);
	
	TestResult updateTestResult(TestResult tr);
	
	String removeTestResultById(Integer id);
	

}
