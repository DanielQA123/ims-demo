package com.qa.ims.persistence.domain;

import org.junit.Before;
import org.junit.Test;

public class ItemTest {
	
	private Item item;
	private Item otherItem;
	
	@Before 
	public void setUpTest() {
		item = new Item();
		otherItem = new Item();
		
	}
	
	@Test
	public void settersTest() {
		assertNotNull();
		assertNotNull();
		assertNotNull();
		
		//The different setters
	}

	@Test
	public void equalsWithNull() {
		assertFalse(item.equals(null));
	}
	
	@Test
	public void equalsWithDifferentObject() {
		
	}
	
}
