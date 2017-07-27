package com.globomart.model.projections;

import java.util.List;

import org.springframework.data.rest.core.config.Projection;

import com.globomart.model.Delivery;
import com.globomart.model.Order;
import com.globomart.model.Product;

@Projection(name="orderDetails", types={Order.class})
public interface OrderDetails {
	String getOrderId();
	String getOrderDate();
	List<Product> getProducts();
	String getTotalPrice();
	String getPaymentMode();
	String getPaymentStatus();
	Delivery getDelivery();
}
