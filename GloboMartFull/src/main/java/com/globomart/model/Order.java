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

@Entity(name="CUSTOMER_ORDER")
public class Order {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long Id;
	
	@ManyToOne
	private Delivery delivery;
	
	@ManyToMany(cascade=CascadeType.ALL)
	@JoinTable(name = "ORDER_PRODUCT",
	joinColumns = @JoinColumn(name = "ORDER_ID", referencedColumnName="Id"),
	inverseJoinColumns = @JoinColumn(name="PRODUCT_ID", referencedColumnName="Id"))
	private List<Product> products;
	
	
	private Long orderId;
	private Date orderDate;
	private String totalPrice;
	private String status;
	private String paymentMode;
	private String paymentStatus;
	
	public Delivery getDelivery() {
		return delivery;
	}
	public Long getId() {
		return Id;
	}
	public Date getOrderDate() {
		return orderDate;
	}
	public Long getOrderId() {
		return orderId;
	}
	public String getPaymentMode() {
		return paymentMode;
	}
	public String getPaymentStatus() {
		return paymentStatus;
	}
	public List<Product> getProducts() {
		return products;
	}
	public String getStatus() {
		return status;
	}
	public String getTotalPrice() {
		return totalPrice;
	}
	public void setDelivery(Delivery delivery) {
		this.delivery = delivery;
	}
	public void setOrderDate(Date orderDate) {
		this.orderDate = orderDate;
	}
	public void setOrderId(Long orderId) {
		this.orderId = orderId;
	}
	public void setPaymentMode(String paymentMode) {
		this.paymentMode = paymentMode;
	}
	public void setPaymentStatus(String paymentStatus) {
		this.paymentStatus = paymentStatus;
	}
	public void setProducts(List<Product> products) {
		this.products = products;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public void setTotalPrice(String totalPrice) {
		this.totalPrice = totalPrice;
	}

	
}
