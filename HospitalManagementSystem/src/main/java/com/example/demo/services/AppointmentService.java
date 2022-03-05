package com.example.demo.services;

import java.util.List;

import com.example.demo.model.Appointment;

/**
 * Project Title: HealthCare Management System.
 * 
 * Group Name-C
 * 
 * Group Members:  Pratik Bhute, Jitesh Binner, Amit Jiwane, Pallavi Dhawale.
 * 
 * 
 **/
public interface AppointmentService {

	Appointment addAppointment(Appointment appointment);

	List<Appointment> viewAppointments();

	Appointment viewAppointment(Integer id);

	Appointment updateAppointment(Appointment appointment);

	String removeAppointmentById(Integer id);
	
	
}
