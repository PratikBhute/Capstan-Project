package com.example.demo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Appointment;
import com.example.demo.serviceImple.AppointmentServiceImple;

/**
 * Project Title: HealthCare Management System.
 * 
 * Group Name-C
 * 
 * Group Members: Pratik Bhute
 * 				  Jitesh Binner
 * 				  Amit Jiwane
 * 				  Pallavi Dhawale
 * 
 *  
 * **/

@RestController
@RequestMapping("/appointment")
public class AppointmentRestController {

	@Autowired
	private AppointmentServiceImple appointmentServiceImple;
	
	@GetMapping("/get/{appointmentId}")
	public Appointment getAppointmentById(@PathVariable Integer id){
		return appointmentServiceImple.viewAppointment(id);
	}
	
	@GetMapping("/getAll")
	public List<Appointment> getAllAppointments() {
		// TODO Auto-generated method stub
		return appointmentServiceImple.viewAppointments();
	}
	
	@PostMapping("/post")
	public Appointment saveAppointment(@RequestBody Appointment appointment){
		return appointmentServiceImple.addAppointment(appointment);
	}
	
	@PutMapping("/update")
	public Appointment modifyAppointment(@RequestBody Appointment appointment) {
		// TODO Auto-generated method stub
		return appointmentServiceImple.addAppointment(appointment);
	}

	@DeleteMapping("/delete/{id}")
	public String deleteAppointmentById(@PathVariable Integer id) {
		// TODO Auto-generated method stub
		appointmentServiceImple.removeAppointmentById(id);
		return "Deleted";
	}
	
	
}
