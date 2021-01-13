package com.qa.ims.persistence.domain;

import java.util.List;

public class Order {
	private Long orderId;
	private Long customerId;
	private String shippingAddress;
	private List<Item> purchasedItem;
	
	//The constructors
	public Order( String shippingAddress, List<Item> purchasedItem) {
		super();
		this.shippingAddress = shippingAddress;
		this.purchasedItem = purchasedItem;
	}

	public Order(Long orderId, Long customerId, String shippingAddress, List<Item> purchasedItem) {
		super();
		this.orderId = orderId;
		this.customerId = customerId;
		this.shippingAddress = shippingAddress;
		this.purchasedItem = purchasedItem;
	}

	//getters and setters
	public Long getOrderId() {
		return orderId;
	}

	public void setOrderId(Long orderId) {
		this.orderId = orderId;
	}

	public Long getCustomerId() {
		return customerId;
	}

	public void setCustomerId(Long customerId) {
		this.customerId = customerId;
	}

	public String getShippingAddress() {
		return shippingAddress;
	}

	public void setShippingAddress(String shippingAddress) {
		this.shippingAddress = shippingAddress;
	}

	public List<Item> getPurchasedItem() {
		return purchasedItem;
	}

	public void setPurchasedItem(List<Item> purchasedItem) {
		this.purchasedItem = purchasedItem;
	}

	@Override
	public String toString() {
		return "Order [orderId=" + orderId + ", customerId=" + customerId + ", shippingAddress=" + shippingAddress
				+ ", purchasedItem=" + purchasedItem + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((customerId == null) ? 0 : customerId.hashCode());
		result = prime * result + ((orderId == null) ? 0 : orderId.hashCode());
		result = prime * result + ((purchasedItem == null) ? 0 : purchasedItem.hashCode());
		result = prime * result + ((shippingAddress == null) ? 0 : shippingAddress.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Order other = (Order) obj;
		if (customerId == null) {
			if (other.customerId != null)
				return false;
		} else if (!customerId.equals(other.customerId))
			return false;
		if (orderId == null) {
			if (other.orderId != null)
				return false;
		} else if (!orderId.equals(other.orderId))
			return false;
		if (purchasedItem == null) {
			if (other.purchasedItem != null)
				return false;
		} else if (!purchasedItem.equals(other.purchasedItem))
			return false;
		if (shippingAddress == null) {
			if (other.shippingAddress != null)
				return false;
		} else if (!shippingAddress.equals(other.shippingAddress))
			return false;
		return true;
	}
	
	
	
	
	
	
	
	
	

}
