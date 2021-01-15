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
		assertNotNull(item.getPrice());	
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
	
	@Test
	public void checkEqualityBetweenDifferentObjects() {
		assertTrue(item.equals(other));
	}
	
	@Test
	public void itemNameNullButOtherNameNotNull() {
		item.setItemName(null);
		assertFalse(item.equals(other));
	}
	
	@Test
	public void itemNamesNotEqual() {
		other.setItemName("Kettle");
		assertFalse(item.equals(other));
	}
	
	@Test
	public void checkEqualityBetweenDifferentObjectsNullName() {
		item.setItemName(null);
		other.setItemName(null);
		assertTrue(item.equals(other));
	}
	
	@Test
	public void nullItemId() {
		item.setItemId(null);
		assertFalse(item.equals(other));
	}
	
	@Test
	public void nullItemIdOnBoth() {
		item.setItemId(null);
		other.setItemId(null);
		assertTrue(item.equals(other));
	}
	
	@Test
	public void otherItemIdDifferent() {
		other.setItemId(2L);
		assertFalse(item.equals(other));
	}
	
	@Test
	public void nullPrice() {
		item.setPrice(0);
		assertFalse(item.equals(other));
	}
	
	@Test
	public void nullPriceOnBoth() {
		item.setPrice(0);
		other.setPrice(0);
		assertTrue(item.equals(other));
	}
	
	@Test
	public void otherPriceDifferent() {
		other.setPrice(25.00);
		assertNotNull(item.equals(other));
	}
	
	@Test
	public void constructorWithoutId() {
		Item item = new Item("Toaster", 24.00);
		assertNull(item.getItemId());
		assertNotNull(item.getItemName());
		assertNotNull(item.getPrice());
	}
	
	@Test
	public void hashCodeTest() {
		assertEquals(item.hashCode(), other.hashCode());
	}
	
	@Test
	public void hashCodeTestWithNull() {
		Item item = new Item(null, null, 0);
		Item other = new Item(null, null, 0);
		assertEquals(item.hashCode(), other.hashCode());
	}
	
	@Test
	public void toStringTest() {
		String toString = "ItemId:1 item name:Toaster price:24.00";
		assertEquals(toString, item.toString());
	}
	


}
