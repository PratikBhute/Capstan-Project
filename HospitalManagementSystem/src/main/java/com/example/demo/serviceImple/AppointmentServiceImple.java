package com.example.demo.serviceImple;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Appointment;
import com.example.demo.repository.AppointmentRepository;
import com.example.demo.services.AppointmentService;

@Service
public class AppointmentServiceImple implements AppointmentService {

	@Autowired
	private AppointmentRepository appointmentRepository;

	@Override
	public List<Appointment> viewAppointments() {
		// TODO Auto-generated method stub
		return appointmentRepository.findAll();
	}

	@Override
	public Appointment addAppointment(Appointment appointment) {
		// TODO Auto-generated method stub
		return appointmentRepository.save(appointment);
	}

	@Override
	public Appointment viewAppointment(Integer id) {
		// TODO Auto-generated method stub
		return appointmentRepository.findById(id).get();
	}

	@Override
	public Appointment updateAppointment(Appointment appointment) {
		// TODO Auto-generated method stub
		return appointmentRepository.save(appointment);
	}

	@Override
	public String removeAppointmentById(Integer id) {
		// TODO Auto-generated method stub
		appointmentRepository.deleteById(id);
		return "Deleted";
	}

}
