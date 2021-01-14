package com.qa.ims.persistence.domain;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

public class ItemTest {
	
	private Item item;
	private Item other;
	
	@Before
	public void setUpTest() {
		item = new Item(1L, "Toaster", 24.00);
		other = new Item (1L, "Toaster", 24.00);
	}
	
	@Test
	public void settersTest() {
		assertNotNull(item.getItemId());
		assertNotNull(item.getItemName());
		assertNotNull(item.getPrice());
		
		item.setItemId(null);
		assertNull(item.getItemId());
		item.setItemName(null);
		assertNull(item.getItemName());
		item.setPrice(0);
		assertNull(item.getPrice());
		
	}
	
	@Test
	public void equalsWithNull() {
		assertFalse(item.equals(null));
	}
	
	@Test
	public void equalsWithDifferentObject() {
		assertFalse(item.equals(new Object()));
	}
	
	@Test
	public void createItemWithId() {
		assertEquals(1L, item.getItemId(), 0);
		assertEquals("Toaster", item.getItemName());
		assertEquals(24.00, 0, item.getPrice());
	}
	
	@Test
	public void checkEquality() {
		assertTrue(item.equals(item));
	}

}
