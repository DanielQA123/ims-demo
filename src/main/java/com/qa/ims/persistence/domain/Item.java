package com.qa.ims.persistence.domain;

public class Item {
	// The products attributes
	private Long ItemId;
	private String ItemName;
	private Long ItemQuantity;
	private double price;
	
	public Item(String ItemName, Long ItemQuantity) {
		super();
		this.ItemName = ItemName;
		this.ItemQuantity = ItemQuantity;
	}
	public Item(Long ItemId, String ItemName, Long ItemQuantity, double price) {
		super();
		this.ItemId = ItemId;
		this.ItemName = ItemName;
		this.ItemQuantity = ItemQuantity;
		this.price = price;
	}
}