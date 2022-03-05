package com.example.demo.model;

import java.util.List;
import java.util.Objects;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
@Entity
@Table(name = "COSTUMAR")
public class Costumar { 
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private String currencyId;
	
	@Column(name = "First_Name")
	private String firstName;
	
	@Column(name = "Last_Name")
	private String lastName;
	
	@Column(name = "Email")
	private String email;
	
	@Column(name = "phone")
	private String phone;
		
	private String CountryId;
	
	public Costumar() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Costumar(String currencyId, String firstName, String lastName, String email, String phone, String countryId
			) {
		super();
		this.currencyId = currencyId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.phone = phone;
		CountryId = countryId;
		
	}

	@Override
	public String toString() {
		return "Costumar [currencyId=" + currencyId + ", firstName=" + firstName + ", lastName=" + lastName + ", email="
				+ email + ", phone=" + phone + ", CountryId=" + CountryId + " ]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(CountryId, currencyId, email, firstName, lastName, phone);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Costumar other = (Costumar) obj;
		return Objects.equals(CountryId, other.CountryId)
				&& Objects.equals(currencyId, other.currencyId) && Objects.equals(email, other.email)
				&& Objects.equals(firstName, other.firstName) && Objects.equals(lastName, other.lastName)
				&& Objects.equals(phone, other.phone);
	}

	public String getCurrencyId() {
		return currencyId;
	}

	public void setCurrencyId(String currencyId) {
		this.currencyId = currencyId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getCountryId() {
		return CountryId;
	}

	public void setCountryId(String countryId) {
		CountryId = countryId;
	}
	
}


