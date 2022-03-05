package com.example.demo.model;


import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name = "PATIENT")
public class Patient {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer patientId;
	private String name;
	private String phoneNo;
	private Integer age;
	private String gender;
	
	@OneToOne(cascade = CascadeType.ALL)
	private Appointment appointment;
	
	
}
