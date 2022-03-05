package com.example.demo.frontControllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.example.demo.model.Appointment;
import com.example.demo.model.Patient;
import com.example.demo.serviceImple.AppointmentServiceImple;
import com.example.demo.serviceImple.PatientServiceImple;

/**
 * Project Title: HealthCare Management System.
 * 
 * Group Name-C
 * 
 * Group Members: Pratik Bhute Jitesh Binner Amit Jiwane Pallavi Dhawale
 * 
 * 
 **/

@Controller
public class AppointmentFrontController {

	@Autowired
	private AppointmentServiceImple appointmentServiceImple;

	@Autowired
	private PatientServiceImple patientServiceImple;

	// it is used to print the list of the appointments
	@GetMapping("/listOfAppointment")
	public String listOfAppointment(Model model) {
		model.addAttribute("appointmentRef", appointmentServiceImple.viewAppointments());
		return "listAppointment";
	}

	// it is used to navigate the blank appointment form
	@GetMapping("/loadAppointment")
	public String loadAppointmentform(Model model) {
		Appointment appointment = new Appointment();
		Patient patient = new Patient();
		/* model.addAttribute("patientRef", patient); */
		appointment.setPatient(patient);
		model.addAttribute("addAppointmentRef", appointment);
		return "appointmentForm";
	}

	// this method is used to the appointment which will filled by
	@PostMapping("/saveAppointment")
	public String saveAppointment(@ModelAttribute("appointment") Appointment appointment) {
		appointmentServiceImple.addAppointment(appointment);
		return "redirect:/listOfAppointment";
	}

	// this is used to delete the particular appointment
	@GetMapping("/deleteAppointment/{id}")
	public String deletedAppointment(@PathVariable Integer id) {
		appointmentServiceImple.removeAppointmentById(id);
		return "redirect:/listOfAppointment";
	}
}
