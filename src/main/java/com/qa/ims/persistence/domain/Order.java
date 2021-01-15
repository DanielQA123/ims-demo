package com.qa.ims.persistence.domain;

//import java.util.List;

public class Order {
	// attributes
	//private totalCost;
	//private List<orderline> orderlines;
	//private List<Item> purchasedItem;
	
	private Long orderId;
	private String shippingAddress;
	private Long customerId;
	private String itemName;
	
	public Order(Long orderId, Long customerId) {
		super();
		this.orderId = orderId;
		this.customerId = customerId;
	}

	public Order(String shippingAddress, Long customerId) {
		super();
		this.shippingAddress = shippingAddress;
		this.customerId = customerId;
	}

//	public Order(String shippingAddress, List<Item> purchasedItem) {
//		super();
//		this.shippingAddress = shippingAddress;
//		this.purchasedItem = purchasedItem;
//	}
	
//	public Order(String shippingAddress, Long customerId, List<Item> purchasedItem) {
//		super();
//		this.shippingAddress = shippingAddress;
//		this.customerId = customerId;
//		this.purchasedItem = purchasedItem;
//	}

	
	
	
	public Order(Long orderId, String shippingAddress, Long customerId) {
	super();
	this.orderId = orderId;
	this.shippingAddress = shippingAddress;
	this.customerId = customerId;
}


	public Order(String shippingAddress, Long customerId, String itemName) {
		super();
		this.shippingAddress = shippingAddress;
		this.customerId = customerId;
		this.itemName = itemName;
	}

	public Order(Long orderId, String shippingAddress, Long customerId, String itemName) {
	super();
	this.orderId = orderId;
	this.shippingAddress = shippingAddress;
	this.customerId = customerId;
	this.setItemName(itemName);
}

	public Long getOrderId() {
		return orderId;
	}

	public void setOrderId(Long orderId) {
		this.orderId = orderId;
	}

	public String getShippingAddress() {
		return shippingAddress;
	}

	public void setShippingAddress(String shippingAddress) {
		this.shippingAddress = shippingAddress;
	}

	public Long getCustomerId() {
		return customerId;
	}

	public void setCustomerId(Long customerId) {
		this.customerId = customerId;
	}
//	public List<Item> getPurchasedItem() {
//		return purchasedItem;
//	}
//
//	public void setPurchasedItem(List<Item> purchasedItem) {
//		this.purchasedItem = purchasedItem;
//	}

//	@Override
//	public String toString() {
//		return "Order [orderId=" + orderId + ", shippingAddress=" + shippingAddress + ", customerId=" + customerId
//				+ ", purchasedItem=" + purchasedItem + "]";
//	}

	@Override
	public String toString() {
		return "Order [orderId=" + orderId + ", shippingAddress=" + shippingAddress + ", customerId=" + customerId
				+ ", itemName=" + itemName + "]";
	}
	
//	@Override
//	public int hashCode() {
//		final int prime = 31;
//		int result = 1;
//		result = prime * result + ((customerId == null) ? 0 : customerId.hashCode());
//		result = prime * result + ((orderId == null) ? 0 : orderId.hashCode());
//		result = prime * result + ((shippingAddress == null) ? 0 : shippingAddress.hashCode());
//		return result;
//	}
//
//
//	@Override
//	public boolean equals(Object obj) {
//		if (this == obj)
//			return true;
//		if (obj == null)
//			return false;
//		if (getClass() != obj.getClass())
//			return false;
//		Order other = (Order) obj;
//		if (customerId == null) {
//			if (other.customerId != null)
//				return false;
//		} else if (!customerId.equals(other.customerId))
//			return false;
//		if (orderId == null) {
//			if (other.orderId != null)
//				return false;
//		} else if (!orderId.equals(other.orderId))
//			return false;
//		if (shippingAddress == null) {
//			if (other.shippingAddress != null)
//				return false;
//		} else if (!shippingAddress.equals(other.shippingAddress))
//			return false;
//		return true;
//	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((customerId == null) ? 0 : customerId.hashCode());
		result = prime * result + ((itemName == null) ? 0 : itemName.hashCode());
		result = prime * result + ((orderId == null) ? 0 : orderId.hashCode());
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
		if (itemName == null) {
			if (other.itemName != null)
				return false;
		} else if (!itemName.equals(other.itemName))
			return false;
		if (orderId == null) {
			if (other.orderId != null)
				return false;
		} else if (!orderId.equals(other.orderId))
			return false;
		if (shippingAddress == null) {
			if (other.shippingAddress != null)
				return false;
		} else if (!shippingAddress.equals(other.shippingAddress))
			return false;
		return true;
	}

	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

}