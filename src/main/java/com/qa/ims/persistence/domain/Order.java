package com.qa.ims.persistence.domain;

import java.util.List;

public class Order {
	private Long orderId;
	private Long customerId;
	private String shippingAddress;
	private List<Item> purchasedItem;
	
	
	public Order( String shippingAddress, List<Item> purchasedItem) {
		super();
		this.shippingAddress = shippingAddress;
		this.purchasedItem = purchasedItem;
	}
	
	
	
	

}
