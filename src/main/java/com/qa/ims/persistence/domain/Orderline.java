package com.qa.ims.persistence.domain;

public class Orderline {
	
	private Long orderlineId;
	private Long orderId;
	private String shippingAddress;
	private String itemName;
	
	public Orderline(Long orderlineId, Long orderId) {
		super();
		this.orderlineId = orderlineId;
		this.orderId = orderId;
	}

	public Orderline(Long orderId, String shippingAddress, String itemName) {
		super();
		this.orderId = orderId;
		this.shippingAddress = shippingAddress;
		this.itemName = itemName;
	}

	public Orderline(Long orderlineId, Long orderId, String shippingAddress, String itemName) {
		super();
		this.orderlineId = orderlineId;
		this.orderId = orderId;
		this.shippingAddress = shippingAddress;
		this.itemName = itemName;
	}

	public Long getOrderlineId() {
		return orderlineId;
	}

	public void setOrderlineId(Long orderlineId) {
		this.orderlineId = orderlineId;
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

	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	@Override
	public String toString() {
		return "Orderline [orderlineId=" + orderlineId + ", orderId=" + orderId + ", shippingAddress=" + shippingAddress
				+ ", itemName=" + itemName + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((itemName == null) ? 0 : itemName.hashCode());
		result = prime * result + ((orderId == null) ? 0 : orderId.hashCode());
		result = prime * result + ((orderlineId == null) ? 0 : orderlineId.hashCode());
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
		Orderline other = (Orderline) obj;
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
		if (orderlineId == null) {
			if (other.orderlineId != null)
				return false;
		} else if (!orderlineId.equals(other.orderlineId))
			return false;
		if (shippingAddress == null) {
			if (other.shippingAddress != null)
				return false;
		} else if (!shippingAddress.equals(other.shippingAddress))
			return false;
		return true;
	}
	
	
	
	
	

}
