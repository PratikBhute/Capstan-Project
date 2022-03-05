package com.example.demo;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.mockito.Mockito.verify;
import static org.springframework.security.test.web.servlet.request.SecurityMockMvcRequestPostProcessors.digest;
import org.junit.jupiter.api.ClassOrderer.OrderAnnotation;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.mockito.ArgumentCaptor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import com.example.demo.model.Appointment;
import com.example.demo.model.DiagnosticCenter;
import com.example.demo.model.DiagnosticTest;
import com.example.demo.model.Patient;
import com.example.demo.model.TestResult;
import com.example.demo.repository.AppointmentRepository;
import com.example.demo.repository.DiagnosticCenterRepository;
import com.example.demo.serviceImple.AppointmentServiceImple;
import com.example.demo.serviceImple.DiagnosticCenterServiceImple;
import com.example.demo.serviceImple.DiagnosticTestServiceImple;
import com.example.demo.serviceImple.PatientServiceImple;
import com.example.demo.serviceImple.TestResultServiceImple;
import com.example.demo.services.AppointmentService;

@SpringBootTest
//@TestMethodOrder(OrderAnnotation.class)

class HospitalManagementApplicationTests {
	@Autowired
	AppointmentServiceImple appointmentServiceImple;
	@Autowired
	PatientServiceImple patientServiceImple;
	@Autowired
	DiagnosticCenterServiceImple diagnosticCenterServiceImple;
	@Autowired
	DiagnosticTestServiceImple diagnosticTestServiceImple;
	@Autowired
	TestResultServiceImple testResultServiceImple;
	@Autowired
	DiagnosticCenterRepository diagnosticCenterRepository;
	@Autowired
	AppointmentRepository appointmentRepository;
	@Autowired
	AppointmentService appointmentService;

	@Test
	public void viewAppointments() // display
	{
		assertThat(appointmentServiceImple.viewAppointments()).isNotEqualTo(0);
	}

	@Test
	public void viewPatient() 
	{
		assertThat(patientServiceImple.viewPatient()).isNotEqualTo(0);
	}

	@Test
	public void getAllTest()
	{
		assertThat(diagnosticTestServiceImple.getAllTest()).isNotEqualTo(0);
	}

	@Test
	public void getAllDiagnosticCenters() 
	{
		assertThat(diagnosticCenterServiceImple.getAllDiagnosticCenters()).isNotEqualTo(0);
	}

	@Test
	public void viewResultofAllPatient() 
	{
		assertThat(testResultServiceImple.viewResultofAllPatient()).isNotEqualTo(0);
	}

	@Test
		public void AddAppointments() {
		Appointment appointment = new Appointment();
		appointment.setAppointmentId(1);
		appointment.getAppointmentDate();
		assertThat(appointment.getAppointmentId()).isGreaterThan(0);
		
		Patient patient = new Patient();
		patient.setName("");
		patient.setAge(23);
		patient.setGender("male");
		patient.setPatientId(1);
		patient.setPhoneNo("7418529696");
		appointment.setPatient(patient);
		patient.setAppointment(appointment);
		assertThat(patient.getPatientId()).isGreaterThan(0);
		
		
		DiagnosticCenter diagnosticCenter = new DiagnosticCenter();
		diagnosticCenter.setAddress("Nagpur");
		diagnosticCenter.setContactEmail("xyz@gmail.com");
		diagnosticCenter.setContactNo("741852963");
		diagnosticCenter.setDignosticId(1);
		diagnosticCenter.setName("Sk center");
		diagnosticCenter.setAppointment(appointment);
		assertThat(diagnosticCenter.getDignosticId().equals(appointment));
		
		
		DiagnosticTest diagnosticTest = new DiagnosticTest();
		diagnosticTest.setDiagnosticTestId(1);
		diagnosticTest.setNormalValue("4.5");
		diagnosticTest.setTestName("Sugar Test");
		diagnosticTest.setTestPrice(700.00);
		diagnosticTest.setUnits("mM");
		diagnosticTest.setAppointment(appointment);
		assertThat(diagnosticTest.getDiagnosticTestId().equals(diagnosticCenter));
		
		
		
		TestResult testResul = new TestResult();
		testResul.setConditionP("medium");
		testResul.setTestId(1);
		testResul.setTestReading(154.07);
		testResul.setAppointment(appointment);
		assertThat(testResul.getTestId().equals(appointment));
	}

}