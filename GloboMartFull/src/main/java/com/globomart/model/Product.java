package com.globomart.model;

import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity(name="PRODUCT")
public class Product {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	

	private String productCode;
	private String name;
	private String description;
	private String manufacturer;
	private String imageUrl;
	private Date manufactureDate;
	private String expiryDate;
	
	@ManyToMany(cascade=CascadeType.ALL)
	@JoinTable(name = "PRODUCT_ORDER",
	joinColumns = @JoinColumn(name = "PRODUCT_ID", referencedColumnName="Id"),
	inverseJoinColumns = @JoinColumn(name="ORDER_ID", referencedColumnName="Id"))
	private  List<Order> orders;
	
	@ManyToMany(cascade=CascadeType.ALL)
	@JoinTable(name = "PRODUCT_INVENTORY",
	joinColumns = @JoinColumn(name = "PRODUCT_ID", referencedColumnName="Id"),
	inverseJoinColumns = @JoinColumn(name="INVENTORY_ID", referencedColumnName="Id"))
	private List<Inventory> inventories;
	
	@ManyToOne
	private ProductType productType;
	
	private int price;

	public String getDescription() {
		return description;
	}

	public String getExpiryDate() {
		return expiryDate;
	}

	public long getId() {
		return id;
	}

	public String getImageUrl() {
		return imageUrl;
	}

	public List<Inventory> getInventories() {
		return inventories;
	}

	public Date getManufactureDate() {
		return manufactureDate;
	}

	public String getManufacturer() {
		return manufacturer;
	}

	public String getName() {
		return name;
	}

	public List<Order> getOrders() {
		return orders;
	}

	public int getPrice() {
		return price;
	}

	public String getProductCode() {
		return productCode;
	}

	public ProductType getProductType() {
		return productType;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public void setExpiryDate(String expiryDate) {
		this.expiryDate = expiryDate;
	}

	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}

	public void setInventories(List<Inventory> inventories) {
		this.inventories = inventories;
	}

	public void setManufactureDate(Date manufactureDate) {
		this.manufactureDate = manufactureDate;
	}

	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setOrders(List<Order> orders) {
		this.orders = orders;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}

	public void setProductType(ProductType productType) {
		this.productType = productType;
	}


}
