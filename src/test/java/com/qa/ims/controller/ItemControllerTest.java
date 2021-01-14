package com.qa.ims.controller;

import static org.junit.Assert.assertEquals;

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
		Mockito.doReturn(itemName, price).when(itemController).getInput();
		
	}

}

