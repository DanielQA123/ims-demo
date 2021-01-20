package com.qa.ims.persistence.domain;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

public class OrderlineTest {
	
	private Orderline orderline;
	private Orderline other;
	
	@Before
	public void setUpTest() {
		orderline = new Orderline(1L, 1L, 1L, 1L);
		other = new Orderline(1L, 1L, 1L, 1L);
	}
	
	@Test
	public void settersTest() {
		assertNotNull(orderline.getOrderlineId());
		assertNotNull(orderline.getOrderId());
		assertNotNull(orderline.getItemId());
		assertNotNull(orderline.getCustomerId());
		
		orderline.setOrderlineId(null);
		assertNull(orderline.getOrderlineId());
		orderline.setOrderId(null);
		assertNull(orderline.getOrderId());
		orderline.setItemId(null);
		assertNull(orderline.getItemId());
		orderline.setCustomerId(null);
		assertNull(orderline.getCustomerId());
	}
	
	@Test
	public void equalsWithNull() {
		assertFalse(orderline.equals(null));
	}
	
	@Test
	public void equalsWithDifferentObject() {
		assertFalse(orderline.equals(new Object()));
	}
	
	@Test
	public void createOrderlineWithId() {
		assertEquals(1L, orderline.getOrderlineId(), 0);
		assertEquals(1L, orderline.getOrderId(), 0);
		assertEquals(1L, orderline.getItemId(), 0);
		assertEquals(1L, orderline.getCustomerId(), 0);
	}
	
	@Test
	public void checkEquality() {
		assertTrue(orderline.equals(orderline));
	}
	
	@Test
	public void checkEqualityBetweenDifferentObjects() {
		assertTrue(orderline.equals(other));
	}
	
	@Test
	public void nullOrderlineId() {
		orderline.setOrderlineId(null);
		assertFalse(orderline.equals(other));
	}
	
	@Test
	public void nullOrderlineIdOnBoth() {
		orderline.setOrderlineId(null);
		other.setOrderlineId(null);
		assertTrue(orderline.equals(other));
	}
	
	public void otherOrderlineIdDifferent() {
		other.setOrderlineId(2L);
		assertFalse(orderline.equals(other));
	}
	
	@Test
	public void nullOrderId() {
		orderline.setOrderId(null);
		assertFalse(orderline.equals(other));
	}
	
	@Test
	public void nullOrderIdOnBoth() {
		orderline.setOrderId(null);
		other.setOrderId(null);
		assertTrue(orderline.equals(other));
	}
	
	@Test
	public void otherOrderIdDifferent() {
		other.setOrderId(2L);
		assertFalse(orderline.equals(other));
	}
	
	@Test
	public void nullItemId() {
		orderline.setItemId(null);
		assertFalse(orderline.equals(other));
	}
	
	@Test
	public void nullItemIdOnBoth() {
		orderline.setItemId(null);
		other.setItemId(null);
		assertTrue(orderline.equals(other));
	}
	
	@Test
	public void otherItemIdDifferent() {
		other.setItemId(2L);
		assertFalse(orderline.equals(other));
	}
	
	@Test
	public void nullCustomerId() {
		orderline.setCustomerId(null);
		assertFalse(orderline.equals(other));
	}
	
	@Test
	public void nullCustomerIdOnBoth() {
		orderline.setCustomerId(null);
		other.setCustomerId(null);
		assertTrue(orderline.equals(other));
	}
	
	@Test
	public void otherCustomerIdDifferent() {
		other.setCustomerId(2L);
		assertFalse(orderline.equals(other));
	}
	
	@Test
	public void hashCodeTest() {
		assertEquals(orderline.hashCode(), other.hashCode());
	}
	
	@Test
	public void hasCodeTestWithNull() {
		Orderline orderline = new Orderline(null, null, null, null);
		Orderline other = new Orderline(null, null, null, null);
		assertEquals(orderline.hashCode(), other.hashCode());
	}
	
	@Test
	public void toStringTest() {
		String toString = "Orderline [orderlineId=1, orderId=1, customerId=1, itemId=1]";
		assertEquals(toString, orderline.toString());
	}

}
