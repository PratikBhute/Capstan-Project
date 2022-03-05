package com.example.demo.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

import lombok.Data;

@Entity
@Data
public class DiagnosticTest {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer diagnosticTestId;
	private String testName;
	private Double testPrice;
	private String normalValue;
	private String units;
	
	@ManyToOne(fetch = FetchType.LAZY)
	private Appointment appointment;
	
//	@OneToOne(cascade = CascadeType.ALL)
//	private Appointment appointment;
	
	
	@ManyToMany(cascade = CascadeType.ALL)
	private List<DiagnosticCenter> diagnosticCenter;

//	@OneToOne(cascade = CascadeType.ALL)
//	private DiagnosticCenter diagnosticCenter;
	
	
}