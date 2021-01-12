package com.qa.ims.persistence.domain;

public class Item {
	// The products attributes
	private Long ItemId;
	private String ItemName;
	private int ItemQuantity;
	private double price;
	
	public Item(String ItemName, int ItemQuantity, double price ) {
		super();
		this.ItemName = ItemName;
		this.ItemQuantity = ItemQuantity;
		this.price = price;
	}
	public Item(Long ItemId, String ItemName, int ItemQuantity, double price) {
		super();
		this.ItemId = ItemId;
		this.ItemName = ItemName;
		this.ItemQuantity = ItemQuantity;
		this.price = price;
	
	//Getters and Setters 
		
	}
	public Long getItemId() {
		return ItemId;
	}
	public void setItemId(Long itemId) {
		ItemId = itemId;
	}
	public String getItemName() {
		return ItemName;
	}
	public void setItemName(String itemName) {
		ItemName = itemName;
	}
	public int getItemQuantity() {
		return ItemQuantity;
	}
	public void setItemQuantity(int itemQuantity) {
		ItemQuantity = itemQuantity;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	

	
	
}