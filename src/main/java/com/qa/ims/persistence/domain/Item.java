package com.qa.ims.persistence.domain;

public class Item {
	// The products attributes
	private Long itemId;
	private String itemName;
	private int itemQuantity;
	private double price;
	
	public Item(String itemName, int itemQuantity, double price ) {
		super();
		this.itemName = itemName;
		this.itemQuantity = itemQuantity;
		this.price = price;
	}
	public Item(Long itemId, String itemName, int itemQuantity, double price) {
		super();
		this.itemId = itemId;
		this.itemName = itemName;
		this.itemQuantity = itemQuantity;
		this.price = price;
	
	//Getters and Setters 
		
	}
	
	public Long getItemId() {
		return itemId;
	}
	public void setItemId(Long itemId) {
		this.itemId = itemId;
	}
	public String getItemName() {
		return itemName;
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	public int getItemQuantity() {
		return itemQuantity;
	}
	public void setItemQuantity(int itemQuantity) {
		this.itemQuantity = itemQuantity;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Customer other = (Customer) obj;
		if (itemName == null) {
			if (other.firstName != null)
				return false;
	

	
	
}
		}