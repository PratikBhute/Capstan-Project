package com.example.demo.model;

import java.util.List;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "PRODUCT")
public class Products {
		
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "Product_Id")
	private String productId;
	
	@Column(name = "Product_Name")
	private String productName;
	
	@Column(name = "Short_Discription")
	private String shortDiscription;
	
	@Column(name = "Full_Discription")
	private String fullDiscription;
	
	@Column(name = "Size")
	private String size;
	
	@Column(name = "Colour")
	private String colour;
	
	@ManyToMany
	
	@JoinTable(name="PRODUCT_STORES",
    joinColumns=
        @JoinColumn(name="PRODUCT_ID", referencedColumnName="ID"),
    inverseJoinColumns=
        @JoinColumn(name="STORES_ID", referencedColumnName="ID")
    )
	private List<Stores> stores;

	public Products() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Products(String productId, String productName, String shortDiscription, String fullDiscription, String size,
			String colour, List<Stores> stores) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.shortDiscription = shortDiscription;
		this.fullDiscription = fullDiscription;
		this.size = size;
		this.colour = colour;
		this.stores = stores;
	}

	public String getProductId() {
		return productId;
	}

	public void setProductId(String productId) {
		this.productId = productId;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getShortDiscription() {
		return shortDiscription;
	}

	public void setShortDiscription(String shortDiscription) {
		this.shortDiscription = shortDiscription;
	}

	public String getFullDiscription() {
		return fullDiscription;
	}

	public void setFullDiscription(String fullDiscription) {
		this.fullDiscription = fullDiscription;
	}

	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}

	public String getColour() {
		return colour;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}

	public List<Stores> getStores() {
		return stores;
	}

	public void setStores(List<Stores> stores) {
		this.stores = stores;
	}

	@Override
	public int hashCode() {
		return Objects.hash(colour, fullDiscription, productId, productName, shortDiscription, size, stores);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Products other = (Products) obj;
		return Objects.equals(colour, other.colour) && Objects.equals(fullDiscription, other.fullDiscription)
				&& Objects.equals(productId, other.productId) && Objects.equals(productName, other.productName)
				&& Objects.equals(shortDiscription, other.shortDiscription) && Objects.equals(size, other.size)
				&& Objects.equals(stores, other.stores);
	}

	@Override
	public String toString() {
		return "Products [productId=" + productId + ", productName=" + productName + ", shortDiscription="
				+ shortDiscription + ", fullDiscription=" + fullDiscription + ", size=" + size + ", colour=" + colour
				+ ", stores=" + stores + "]";
	}
	
	
	
	
	
	
	}


