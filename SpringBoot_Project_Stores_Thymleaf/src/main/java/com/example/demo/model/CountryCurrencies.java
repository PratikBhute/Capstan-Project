package com.example.demo.model;

import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Country_CURRENCIES")
public class CountryCurrencies {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private String countryId;
	
	@Column(name = "Currency_Id")
	private String currencyId;
	
	@OneToOne(mappedBy = "countryId")
	private Country country;
	
	@OneToOne
	@JoinColumn(name = "countryId")
	private Currency currency;

	public CountryCurrencies() {
		super();
		// TODO Auto-generated constructor stub
	}

	public CountryCurrencies(String countryId, String currencyId, Country country, Currency currency) {
		super();
		this.countryId = countryId;
		this.currencyId = currencyId;
		this.country = country;
		this.currency = currency;
	}

	@Override
	public String toString() {
		return "CountryCurrencies [countryId=" + countryId + ", currencyId=" + currencyId + ", country=" + country
				+ ", currency=" + currency + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(country, countryId, currency, currencyId);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		CountryCurrencies other = (CountryCurrencies) obj;
		return Objects.equals(country, other.country) && Objects.equals(countryId, other.countryId)
				&& Objects.equals(currency, other.currency) && Objects.equals(currencyId, other.currencyId);
	}

	public String getCountryId() {
		return countryId;
	}

	public void setCountryId(String countryId) {
		this.countryId = countryId;
	}

	public String getCurrencyId() {
		return currencyId;
	}

	public void setCurrencyId(String currencyId) {
		this.currencyId = currencyId;
	}

	public Country getCountry() {
		return country;
	}

	public void setCountry(Country country) {
		this.country = country;
	}

	public Currency getCurrency() {
		return currency;
	}

	public void setCurrency(Currency currency) {
		this.currency = currency;
	}
	
	
	}


