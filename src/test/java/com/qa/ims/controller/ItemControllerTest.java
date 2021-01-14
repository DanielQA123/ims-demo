package com.qa.ims.controller;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Spy;
import org.mockito.junit.MockitoJUnitRunner;

import com.qa.ims.persistence.domain.Item;
import com.qa.ims.services.ItemServices;
import com.sun.tools.javac.util.List;

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
		items.add(new Item());
		
		
	}

}

