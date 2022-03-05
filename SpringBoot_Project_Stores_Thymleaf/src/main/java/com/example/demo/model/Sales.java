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
import javax.persistence.OneToOne;
import javax.persistence.Table;
@Entity
@Table(name = "Salse")
public class Sales 
{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "Sale_Id")
	private String saleId;
	
	@Column(name = "Sale_Channel")
	private String saleChannel;
	
	@Column(name = "Order_Id")
	private String orderId;
	

	private String productId;
	
	
	private String costumerId;
	
	
	private String currencyId;
	
	@Column(name = "Net_Ammount")
	private String NetAmount;
	
	@Column(name = "Tex")
	private String tex;
	
	@Column(name = "Shiping_Cost")
	private String shipingCost;
	
	@Column(name = "Gross_Amount")
	private String grossAmount;
	
	@OneToOne
	private Stores stores;
	
	@OneToMany(cascade = CascadeType.ALL)
	private List<Products> products;
	
	@OneToMany(cascade = CascadeType.ALL)
	private List<Currency> currency;

	public Sales() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Sales(String saleId, String saleChannel, String orderId, String productId, String costumerId,
			String currencyId, String netAmount, String tex, String shipingCost, String grossAmount, Stores stores,
			List<Products> products, List<Currency> currency) {
		super();
		this.saleId = saleId;
		this.saleChannel = saleChannel;
		this.orderId = orderId;
		this.productId = productId;
		this.costumerId = costumerId;
		this.currencyId = currencyId;
		NetAmount = netAmount;
		this.tex = tex;
		this.shipingCost = shipingCost;
		this.grossAmount = grossAmount;
		this.stores = stores;
		this.products = products;
		this.currency = currency;
	}

	public String getSaleId() {
		return saleId;
	}

	public void setSaleId(String saleId) {
		this.saleId = saleId;
	}

	public String getSaleChannel() {
		return saleChannel;
	}

	public void setSaleChannel(String saleChannel) {
		this.saleChannel = saleChannel;
	}

	public String getOrderId() {
		return orderId;
	}

	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}

	public String getProductId() {
		return productId;
	}

	public void setProductId(String productId) {
		this.productId = productId;
	}

	public String getCostumerId() {
		return costumerId;
	}

	public void setCostumerId(String costumerId) {
		this.costumerId = costumerId;
	}

	public String getCurrencyId() {
		return currencyId;
	}

	public void setCurrencyId(String currencyId) {
		this.currencyId = currencyId;
	}

	public String getNetAmount() {
		return NetAmount;
	}

	public void setNetAmount(String netAmount) {
		NetAmount = netAmount;
	}

	public String getTex() {
		return tex;
	}

	public void setTex(String tex) {
		this.tex = tex;
	}

	public String getShipingCost() {
		return shipingCost;
	}

	public void setShipingCost(String shipingCost) {
		this.shipingCost = shipingCost;
	}

	public String getGrossAmount() {
		return grossAmount;
	}

	public void setGrossAmount(String grossAmount) {
		this.grossAmount = grossAmount;
	}

	public Stores getStores() {
		return stores;
	}

	public void setStores(Stores stores) {
		this.stores = stores;
	}

	public List<Products> getProducts() {
		return products;
	}

	public void setProducts(List<Products> products) {
		this.products = products;
	}

	public List<Currency> getCurrency() {
		return currency;
	}

	public void setCurrency(List<Currency> currency) {
		this.currency = currency;
	}

	@Override
	public int hashCode() {
		return Objects.hash(NetAmount, costumerId, currency, currencyId, grossAmount, orderId, productId, products,
				saleChannel, saleId, shipingCost, stores, tex);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Sales other = (Sales) obj;
		return Objects.equals(NetAmount, other.NetAmount) && Objects.equals(costumerId, other.costumerId)
				&& Objects.equals(currency, other.currency) && Objects.equals(currencyId, other.currencyId)
				&& Objects.equals(grossAmount, other.grossAmount) && Objects.equals(orderId, other.orderId)
				&& Objects.equals(productId, other.productId) && Objects.equals(products, other.products)
				&& Objects.equals(saleChannel, other.saleChannel) && Objects.equals(saleId, other.saleId)
				&& Objects.equals(shipingCost, other.shipingCost) && Objects.equals(stores, other.stores)
				&& Objects.equals(tex, other.tex);
	}

	@Override
	public String toString() {
		return "Sales [saleId=" + saleId + ", saleChannel=" + saleChannel + ", orderId=" + orderId + ", productId="
				+ productId + ", costumerId=" + costumerId + ", currencyId=" + currencyId + ", NetAmount=" + NetAmount
				+ ", tex=" + tex + ", shipingCost=" + shipingCost + ", grossAmount=" + grossAmount + ", stores="
				+ stores + ", products=" + products + ", currency=" + currency + "]";
	}
	
	
	
	}


