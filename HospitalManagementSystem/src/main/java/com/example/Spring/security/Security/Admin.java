package com.example.Spring.security.Security;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

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

@Entity
@Data
public class Admin {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String username;
	private String password;
	private String address;
	private String mobileNo;
	private String email;
	@Enumerated(EnumType.STRING)
	private Role role;
	
	
	
}

