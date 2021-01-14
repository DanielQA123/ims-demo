package com.qa.ims.controller;


import java.util.List;

import org.apache.log4j.Logger;

import com.qa.ims.persistence.domain.Item;
import com.qa.ims.services.CrudServices;
import com.qa.ims.utils.Utils;


//Takes in the item details for CRUD functionality


public class ItemController implements CrudController<Item>{
	
 public static final Logger LOGGER = Logger.getLogger(ItemController.class);
	
 private CrudServices<Item> itemService;
 
 public ItemController(CrudServices<Item> itemService) {
	 this.itemService = itemService;
 }

 String getInput() {
	 return Utils.getInput();
 }
 
 double getDouble() {
	 return Utils.getDoubleInput();
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
	LOGGER.info("May you please enter the item name");
	String itemName = getInput();
	LOGGER.info("May you enter the item price");
	double price = getDouble();
	Item item = itemService.create(new Item(itemName,price));
	LOGGER.info("Item Created");
	return item;
}

@Override
public Item update() {
	LOGGER.info("Please enter the id of the item you would like to update");
	Long itemId = Long.valueOf(getInput());
	LOGGER.info("Please enter the item name");
	String itemName = getInput();
	LOGGER.info("Please enter the price of the item");
	double price = getDouble();
	Item item = itemService.update(new Item(itemId, itemName, price));
	return item;
}

//Delete an existing item by the item id

@Override
public void delete() {
	LOGGER.info("Please enter the id of the item you would like to delete/remove");
	Long itemId = Long.valueOf(getInput());
	itemService.delete(itemId);

}
 
 
 
}
