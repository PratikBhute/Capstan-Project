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
@Table(name = "Reagion")
public class Region {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private String regiobId;
	
	@Column(name = "Region_Name")
	private String regionName;
	
	@OneToMany(cascade = CascadeType.ALL,mappedBy = "region")
	private List<Country> countries;

	public Region() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Region(String regiobId, String regionName, List<Country> countries) {
		super();
		this.regiobId = regiobId;
		this.regionName = regionName;
		this.countries = countries;
	}

	public String getRegiobId() {
		return regiobId;
	}

	public void setRegiobId(String regiobId) {
		this.regiobId = regiobId;
	}

	public String getRegionName() {
		return regionName;
	}

	public void setRegionName(String regionName) {
		this.regionName = regionName;
	}

	public List<Country> getCountries() {
		return countries;
	}

	public void setCountries(List<Country> countries) {
		this.countries = countries;
	}

	@Override
	public int hashCode() {
		return Objects.hash(countries, regiobId, regionName);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Region other = (Region) obj;
		return Objects.equals(countries, other.countries) && Objects.equals(regiobId, other.regiobId)
				&& Objects.equals(regionName, other.regionName);
	}

	@Override
	public String toString() {
		return "Region [regiobId=" + regiobId + ", regionName=" + regionName + ", countries=" + countries + "]";
	}

	
	
	}


