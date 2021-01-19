package com.qa.ims.persistence.domain;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

public class OrderTest {
	
	private Order order;
	private Order other;
	
	@Before
	public void setUpTest() {
		order = new Order(1L, "Help", 1L, 1L);
		other = new Order(1L, "Help", 1L, 1L);
	}
	
	@Test
	public void settersTest() {
		assertNotNull(order.getOrderId());
		assertNotNull(order.getShippingAddress());
		assertNotNull(order.getCustomerId());
		assertNotNull(order.getItemId());
		
		order.setOrderId(null);
		assertNull(order.getOrderId());
		order.setShippingAddress(null);
		assertNull(order.getShippingAddress());
		order.setCustomerId(null);
		assertNull(order.getCustomerId());
		order.setItemId(null);
		assertNull(order.getItemId());
	}
	
	@Test
	public void equalsWithNull() {
		assertFalse(order.equals(null));
	}
	
	@Test
	public void equalsWithDifferentObject() {
		assertFalse(order.equals(new Object()));
	}
	
	@Test
	public void createOrderWithId() {
		assertEquals(1L, order.getOrderId(), 0);
		assertEquals("help", order.getShippingAddress());
		assertEquals(1L, order.getCustomerId(), 0);
		assertEquals(1L, order.getItemId(), 0);
	}
	
	@Test
	public void checkEquality() {
		assertTrue(order.equals(order));
	}
	
	@Test
	public void checkEqualityBetweenDifferentObjects() {
		assertTrue(order.equals(other));
	}
}
