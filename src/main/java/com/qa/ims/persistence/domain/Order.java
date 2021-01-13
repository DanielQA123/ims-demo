package com.qa.ims.persistence.domain;

public class Order {
	private Long orderId;
	private Long customerId;
	private String shippingAddress;
	
	
	public Order (String shippingAddress) {
		super();
		this.shippingAddress = shippingAddress;
	}

	public Order(Long orderId, Long customerId, String shippingAddress) {
		super();
		this.orderId = orderId;
		this.customerId = customerId;
		this.shippingAddress = shippingAddress;
	}
	
	
	

}
