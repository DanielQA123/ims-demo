package com.qa.ims.controller;


import java.util.List;

import org.apache.log4j.Logger;

import com.qa.ims.persistence.domain.Item;
import com.qa.ims.services.CrudServices;
import com.qa.ims.utils.Utils;


//Takes in the item details for CRUD functionallity


public class ItemController implements CrudController<Item>{
	
 public static final Logger LOGGER = Logger.getLogger(ItemController.class);
	
 private CrudServices<Item> itemService;
 
 public ItemController(CrudServices<Item> itemService) {
	 this.itemService = itemService;
 }

 String getInput() {
	 return Utils.getInput();
 }
 
//Trying to read all the info regarding to items in the logger
 
@Override
public List<Item> readAll() {
	List<Item> items = itemService.readAll();
	for(Item item: items) {
		LOGGER.info(item.toString());
	}
	return items;
}

//Creates an item by taking all the user input

@Override
public Item create() {
	LOGGER.info("May you please enter item name");
	String itemName = getInput();

	// TODO Auto-generated method stub
	return item;
}

@Override
public Item update() {
	// TODO Auto-generated method stub
	return null;
}

//Delete an existing item by the item id

@Override
public void delete() {
	LOGGER.info("Please enter the id of the item you would like to delete/remove");
	Long itemId = Long.valueOf(getInput());
	itemService.delete(itemId);

}
 
 
 
}
