package com.globomart.model.projections;

import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.data.rest.core.config.Projection;

import com.globomart.model.Delivery;
import com.globomart.model.Order;
import com.globomart.model.Product;

@Projection(name="orderDetailView", types={Order.class})
public interface OrderDetailsView {
	@Value("#{target.orderId}")
	String getCustomerOrderId();
	
	@Value("#{target.orderDate}")
	String getCustomerOrderDate();
	
	@Value("#{target.products}")
	List<Product> getOrderedProducts();
	
	@Value("#{target.totalPrice}")
	String getOrderTotalPrice();
	
	@Value("#{target.paymentMode}")
	String getOrderPaymentMode();
	
	@Value("#{target.paymentStatus}")
	String getOrderPaymentStatus();
	
	@Value("#{target.delivery.deliveryType}")
	String getOrderDeliveryType();
	
	@Value("#{target.delivery.deliveryStatus} on #{target.delivery.deliveryDate}")
	String getOrderDeliveryStatus();
	
	
}
