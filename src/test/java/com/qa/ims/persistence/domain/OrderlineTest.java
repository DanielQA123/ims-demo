package com.qa.ims.persistence.domain;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

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
		
	}
	
	
	
	
	
	

}
