package com.example.demo.frontControllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.demo.model.Appointment;
import com.example.demo.model.Patient;
import com.example.demo.serviceImple.AppointmentServiceImple;
import com.example.demo.serviceImple.PatientServiceImple;


@Controller
public class PatientFrontController {

	@Autowired
	private PatientServiceImple patientServiceImple;
	
	@Autowired
	private AppointmentServiceImple appointmentServiceImple;
	
	@GetMapping("/demo")
	public String Testing() {
		return "demo";
	}
	
	@GetMapping("/home")
	public String Home() {
		return "home";
	}
	
	@GetMapping("/aboutUs")
	public String aboutUs() {
		return "about";
	}
	@GetMapping("/logIn")
	public String LogIn() {
		return "logIn";
	}
	
	//In that we want to list of the data
	@GetMapping("/listPatient")
	public String listPatient(Model model){
		List<Patient> patient2=patientServiceImple.viewPatient();
		List<Appointment> appoint3=appointmentServiceImple.viewAppointments();
		model.addAttribute("Ref", patient2);
		/* model.addAttribute("appoint3Ref", appoint3); */
		return "listPatient";
		
	}
	
	//it will load our registration form of patient
	@GetMapping("/loadRegistrationForm")
	public String loadPatientForm(Model model) {
		Patient patient=new Patient();
		Appointment appoint=new Appointment();
		patient.setAppointment(appoint);
		model.addAttribute("addPatientRef", patient);
		/* model.addAttribute("appoint2", appoint); */
		return "registrationForm";
	}
	
	//it will used to save the information of patient
	@PostMapping("/savePatient")
	public String addPatient(@ModelAttribute("patient") Patient patient) {
        patientServiceImple.registerPatient(patient);
		return "redirect:/listPatient";
	}
	
	//this end point will delete the patient by id
	@GetMapping("/deletePatient/{id}")
	public String deletePatient(@PathVariable Integer id) {
		patientServiceImple.deletePatient(id);
		return "redirect:/listPatient";
	}
}

