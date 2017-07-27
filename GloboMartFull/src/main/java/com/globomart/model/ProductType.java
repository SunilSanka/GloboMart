package com.globomart.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

@Entity(name="PRODUCT_TYPE")
public class ProductType {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long Id;

	private String name;

	@OneToMany(cascade=CascadeType.ALL)
	@JoinColumn(name="PRODUCT_TYPE_ID")
	private List<Product> products;

	public Long getId() {
		return Id;
	}

	public String getName() {
		return name;
	}

	public List<Product> getProducts() {
		return products;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setProducts(List<Product> products) {
		this.products = products;
	}


	

}
