package com.qa.ims.controller;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.Spy;
import org.mockito.junit.MockitoJUnitRunner;

import com.qa.ims.persistence.domain.Item;
import com.qa.ims.services.ItemServices;


@RunWith(MockitoJUnitRunner.class)
public class ItemControllerTest {
	
	//the fake/mock functionality
	
	@Mock
	private ItemServices itemServices;
	
	//Spy is used to mock some of my methods 
	
	@Spy
	@InjectMocks
	private ItemController itemController;
	
	@Test
	public void readAllTest() {
		ItemController itemController = new ItemController(itemServices);
		List<Item> items = new ArrayList<>();
		items.add(new Item("Toaster",24.00));
		Mockito.when(itemServices.readAll()).thenReturn(items);
		assertEquals(items, itemController.readAll());
	}
	
	@Test
	public void createTest() {
		String itemName ="Toaster";
		double price = 24.00;
		Mockito.doReturn(itemName).when(itemController).getInput();
		Mockito.doReturn(price).when(itemController).getDoubleInput();
		Item item = new Item(itemName, price);
		Item savedItem = new Item(1L,"Toaster", 24.00);
		Mockito.when(itemServices.create(item)).thenReturn(savedItem);
	    assertEquals(savedItem, itemController.create());
	}

	@Test
	public void updateTest() {
		String itemId = "1";
		String itemName ="Toaster";
		double price = 24.00;
		Mockito.doReturn(itemId, itemName).when(itemController).getInput();
		Mockito.doReturn(price).when(itemController).getDoubleInput();
		Item item = new Item(1L, itemName, price);
		Mockito.when(itemServices.update(item)).thenReturn(item);
		assertEquals(item, itemController.update());
	}
	
	@Test
	public void deleteTest() {
		String itemId = "1";
		Mockito.doReturn(itemId).when(itemController).getInput();
		itemController.delete();
		Mockito.verify(itemServices, Mockito.times(1)).delete(1L);
	}

}

