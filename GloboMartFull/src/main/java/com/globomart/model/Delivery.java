package com.globomart.model;

import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

import org.hibernate.annotations.Cascade;

@Entity(name="DELIVERY")
public class Delivery {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long Id;
	
	@OneToMany(cascade=CascadeType.ALL)
	@JoinColumn(name="DELIVERY_ID")
	private List<Order> orders;
	
	private Date deliveryDate;
	private String address;
	private String deliveryStatus;
	private String deliveryType;
	
	public String getAddress() {
		return address;
	}
	public Date getDeliveryDate() {
		return deliveryDate;
	}
	public String getDeliveryStatus() {
		return deliveryStatus;
	}
	public String getDeliveryType() {
		return deliveryType;
	}
	public Long getId() {
		return Id;
	}
	public List<Order> getOrders() {
		return orders;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public void setDeliveryDate(Date deliveryDate) {
		this.deliveryDate = deliveryDate;
	}
	public void setDeliveryStatus(String deliveryStatus) {
		this.deliveryStatus = deliveryStatus;
	}
	public void setDeliveryType(String deliveryType) {
		this.deliveryType = deliveryType;
	}
	public void setOrders(List<Order> orders) {
		this.orders = orders;
	}
	



}
