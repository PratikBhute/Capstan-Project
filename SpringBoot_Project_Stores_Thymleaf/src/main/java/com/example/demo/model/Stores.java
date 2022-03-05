package com.example.demo.model;

import java.util.List;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.apache.catalina.Store;
@Entity
@Table(name = "STORES")
public class Stores {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "Currency_Id")
	private String currencyId;
	
	@Column(name = "First_Name")
	private String firstName;
	
	@Column(name = "Last_Name")
	private String lastname;
	
	@Column(name = "Email")
	private String email;
	
	@Column(name = "Phone")
	private String phone;
	
	@Column(name = "Country_Id")
	private String countryId;
	
	
	@ManyToMany(mappedBy = "stores")
	private List<Products> products;
	
	@OneToOne(mappedBy = "currencyId")
	private Sales sales;

	public Stores() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Stores(String currencyId, String firstName, String lastname, String email, String phone, String countryId,
			List<Products> products, Sales sales) {
		super();
		this.currencyId = currencyId;
		this.firstName = firstName;
		this.lastname = lastname;
		this.email = email;
		this.phone = phone;
		this.countryId = countryId;
		this.products = products;
		this.sales = sales;
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

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
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
		return countryId;
	}

	public void setCountryId(String countryId) {
		this.countryId = countryId;
	}

	public List<Products> getProducts() {
		return products;
	}

	public void setProducts(List<Products> products) {
		this.products = products;
	}

	public Sales getSales() {
		return sales;
	}

	public void setSales(Sales sales) {
		this.sales = sales;
	}

	@Override
	public String toString() {
		return "Stores [currencyId=" + currencyId + ", firstName=" + firstName + ", lastname=" + lastname + ", email="
				+ email + ", phone=" + phone + ", countryId=" + countryId + ", products=" + products + ", sales="
				+ sales + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(countryId, currencyId, email, firstName, lastname, phone, products, sales);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Stores other = (Stores) obj;
		return Objects.equals(countryId, other.countryId) && Objects.equals(currencyId, other.currencyId)
				&& Objects.equals(email, other.email) && Objects.equals(firstName, other.firstName)
				&& Objects.equals(lastname, other.lastname) && Objects.equals(phone, other.phone)
				&& Objects.equals(products, other.products) && Objects.equals(sales, other.sales);
	}
	
	
}
	
