package com.example.demo.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

import lombok.Data;

@Entity
@Data
public class TestResult {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer testId;
	private Double testReading;
	private String conditionP;

	@ManyToOne(fetch = FetchType.LAZY)
	private Appointment appointment;

}
