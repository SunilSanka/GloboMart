package com.globomart.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

@Entity(name="INVENTORY")
public class Inventory {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long Id;
	
	private boolean isActive;
	private String location;
	
	@ManyToMany(cascade=CascadeType.ALL)
	@JoinTable(name = "INVENTORY_PRODUCT",
	joinColumns = @JoinColumn(name="INVENTORY_ID", referencedColumnName="Id"),
	inverseJoinColumns = @JoinColumn(name = "PRODUCT_ID", referencedColumnName="Id"))
	private List<Product> products;

	public Long getId() {
		return Id;
	}

	public String getLocation() {
		return location;
	}

	public List<Product> getProducts() {
		return products;
	}

	public boolean isActive() {
		return isActive;
	}

	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public void setProducts(List<Product> products) {
		this.products = products;
	}

}
