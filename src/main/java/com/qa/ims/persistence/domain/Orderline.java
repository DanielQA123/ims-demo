
package com.qa.ims.persistence.domain;

public class Orderline {

	private Long orderlineId;
	private Long orderId;
	private Long customerId;
	private Long itemId;

	
	public Orderline(Long customerId) {
		super();
		this.customerId = customerId;
	}
//	public Orderline(Long orderlineId, Long customerId) {
//		super();
//		this.orderlineId = orderlineId;
//		this.customerId = customerId;
//	}

	public Orderline(Long orderId, Long customerId, Long itemId) {
		super();
		this.orderId = orderId;
		this.customerId = customerId;
		this.itemId = itemId;
	}

	public Orderline(Long orderlineId, Long orderId, Long customerId, Long itemId) {
		super();
		this.orderlineId = orderlineId;
		this.orderId = orderId;
		this.customerId = customerId;
		this.itemId = itemId;
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

	public Long getCustomerId() {
		return customerId;
	}

	public void setCustomerId(Long customerId) {
		this.customerId = customerId;
	}

	public Long getItemId() {
		return itemId;
	}

	public void setItemId(Long itemId) {
		this.itemId = itemId;
	}

	@Override
	public String toString() {
		return "Orderline [orderlineId=" + orderlineId + ", orderId=" + orderId + ", customerId=" + customerId
				+ ", itemId=" + itemId + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((customerId == null) ? 0 : customerId.hashCode());
		result = prime * result + ((itemId == null) ? 0 : itemId.hashCode());
		result = prime * result + ((orderId == null) ? 0 : orderId.hashCode());
		result = prime * result + ((orderlineId == null) ? 0 : orderlineId.hashCode());
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
		if (customerId == null) {
			if (other.customerId != null)
				return false;
		} else if (!customerId.equals(other.customerId))
			return false;
		if (itemId == null) {
			if (other.itemId != null)
				return false;
		} else if (!itemId.equals(other.itemId))
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
		return true;
	}


	
}


	
	
