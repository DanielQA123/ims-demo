package com.qa.ims.persistence.domain;

import org.junit.Before;

public class OrderTest {
	
	private Order order;
	private Order other;
	
	@Before
	public void setUpTest() {
		order = new Order(1L, "Help", 1L, 1L);
		other = new Order(1L, "Help", 1L, 1L);
	}

}
