package com.example.demo.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;

import lombok.Data;

@Entity
@Data
public class DiagnosticCenter {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer dignosticId;
	private String name;
	private String contactNo;
	private String address;
	private String contactEmail;

	@OneToOne(cascade = CascadeType.ALL)
	private Appointment appointment;

	@ManyToMany
	@JoinTable(name = "DiagnosticCenter_DiagnosticTest", joinColumns = @JoinColumn(name = "centerId"), inverseJoinColumns = @JoinColumn(name = "testId"))
	private List<DiagnosticTest> diagnosticTest;

}
