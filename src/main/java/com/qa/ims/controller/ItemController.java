package com.qa.ims.controller;

import java.lang.System.Logger;
import java.util.List;

import com.qa.ims.persistence.domain.Item;
import com.qa.ims.services.CrudServices;
import com.qa.ims.utils.Utils;


//Takes in the item details for CRUD functionallity


public class ItemController implements CrudController<Item>{
	
 public static final Logger LOGGER = Logger.getLogger(ItemConItemler.class);
	
 private CrudServices<Item> itemService;
 
 public ItemController(CrudService<Item> itemService) {
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

@Override
public Item create() {
	// TODO Auto-generated method stub
	return null;
}

@Override
public Item update() {
	// TODO Auto-generated method stub
	return null;
}

@Override
public void delete() {
	// TODO Auto-generated method stub
	
}
 
 
 
}
