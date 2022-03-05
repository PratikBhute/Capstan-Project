package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
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
@SpringBootApplication
@EnableJpaAuditing
public class HospitalManagementApplication {

	public static void main(String[] args) {
		SpringApplication.run(HospitalManagementApplication.class, args);
	}

}
