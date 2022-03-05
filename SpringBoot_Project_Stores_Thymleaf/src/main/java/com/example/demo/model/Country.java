package com.example.demo.model;

import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class Country 
{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private String countryId;
	
	@Column(name = "Country_Name")
	private String CountryName;
	
	@Column(name = "Region_Id")
	private String  regionId;
	
	@OneToOne
	@JoinColumn(name = "countryId")
	private CountryCurrencies countryCurrencies;

	public Country() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Country(String countryId, String countryName, String regionId, CountryCurrencies countryCurrencies) {
		super();
		this.countryId = countryId;
		CountryName = countryName;
		this.regionId = regionId;
		this.countryCurrencies = countryCurrencies;
	}

	@Override
	public String toString() {
		return "Country [countryId=" + countryId + ", CountryName=" + CountryName + ", regionId=" + regionId
				+ ", countryCurrencies=" + countryCurrencies + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(CountryName, countryCurrencies, countryId, regionId);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Country other = (Country) obj;
		return Objects.equals(CountryName, other.CountryName)
				&& Objects.equals(countryCurrencies, other.countryCurrencies)
				&& Objects.equals(countryId, other.countryId) && Objects.equals(regionId, other.regionId);
	}

	public String getCountryId() {
		return countryId;
	}

	public void setCountryId(String countryId) {
		this.countryId = countryId;
	}

	public String getCountryName() {
		return CountryName;
	}

	public void setCountryName(String countryName) {
		CountryName = countryName;
	}

	public String getRegionId() {
		return regionId;
	}

	public void setRegionId(String regionId) {
		this.regionId = regionId;
	}

	public CountryCurrencies getCountryCurrencies() {
		return countryCurrencies;
	}

	public void setCountryCurrencies(CountryCurrencies countryCurrencies) {
		this.countryCurrencies = countryCurrencies;
	}
	
	
	
}
