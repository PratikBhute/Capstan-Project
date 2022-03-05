package com.example.demo.model;

import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;
@Entity
@Table(name = "CURRENCIES")
public class Currency {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	
	@Column(name ="Currency_Id")
	private String currencyId;
	
	@Column(name = "Crrency_Name")
	private String currencyName;
	
	
	@OneToOne(mappedBy = "currencyId")
	private CountryCurrencies countryCurrencies;


	public Currency() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Currency(String currencyId, String currencyName, CountryCurrencies countryCurrencies) {
		super();
		this.currencyId = currencyId;
		this.currencyName = currencyName;
		this.countryCurrencies = countryCurrencies;
	}


	public String getCurrencyId() {
		return currencyId;
	}


	public void setCurrencyId(String currencyId) {
		this.currencyId = currencyId;
	}


	public String getCurrencyName() {
		return currencyName;
	}


	public void setCurrencyName(String currencyName) {
		this.currencyName = currencyName;
	}


	public CountryCurrencies getCountryCurrencies() {
		return countryCurrencies;
	}


	public void setCountryCurrencies(CountryCurrencies countryCurrencies) {
		this.countryCurrencies = countryCurrencies;
	}


	@Override
	public int hashCode() {
		return Objects.hash(countryCurrencies, currencyId, currencyName);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Currency other = (Currency) obj;
		return Objects.equals(countryCurrencies, other.countryCurrencies)
				&& Objects.equals(currencyId, other.currencyId) && Objects.equals(currencyName, other.currencyName);
	}


	@Override
	public String toString() {
		return "Currency [currencyId=" + currencyId + ", currencyName=" + currencyName + ", countryCurrencies="
				+ countryCurrencies + "]";
	}

	
	
	
}
	


