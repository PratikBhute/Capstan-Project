package com.example.demo.services;

import java.util.List;

import com.example.demo.model.DiagnosticTest;

public interface DiagnosticTestService {

	DiagnosticTest addTest(DiagnosticTest diagnosticTest);  // Add test
	
	List<DiagnosticTest> getAllTest();						// View all test

	DiagnosticTest getTestById(Integer Id);					// view test by id

	DiagnosticTest updateTestDetails(DiagnosticTest test);	// update test

	String removeTestById(Integer id);						// Delete test
}
