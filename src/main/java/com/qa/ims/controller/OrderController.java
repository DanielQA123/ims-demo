package com.qa.ims.controller;

import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;

import com.qa.ims.persistence.domain.Item;
import com.qa.ims.persistence.domain.Order;
import com.qa.ims.services.CrudServices;
import com.qa.ims.services.ItemServices;
import com.qa.ims.services.OrderServices;
import com.qa.ims.utils.Utils;

public class OrderController implements CrudController<Order> {
	
	public static final Logger LOGGER = Logger.getLogger(OrderController.class);

	private CrudServices<Order> orderService;
	
//	private CrudServices<Item> itemService;
	
//	public OrderController(CrudServices<Order> orderService, CrudServices<Item> itemService) {
//		super();
//		this.orderService = orderService;
//	    this.itemService = itemService;
//	}
//	

	public OrderController(CrudServices<Order> orderService) {
	this.orderService = orderService;
}

	List<Item> purchasedItem = new ArrayList<>();
	
	public void addItem(Item item) {
		purchasedItem.add(item);
	}
	
	String getInput() {
		return Utils.getInput();
	}
	
	double getDouble() {
		return Utils.getDouble();
	}
	
	Long getLongInput() {
		return Utils.getLongInput();
	}
	
	//reads all the info regarding orders to the logger
	
	@Override
	public List<Order> readAll() {
		List<Order> orders = orderService.readAll();
		for(Order order: orders) {
			LOGGER.info(order.toString());
		}
		return orders;
	}
//Creating a new order
	
	
	
	@Override
	public Order create() {
		LOGGER.info("May you enter the order address/ shipping address");
		String shippingAddress = getInput();
		LOGGER.info("May you enter your customerId");
		Long customerId = getLongInput();
		LOGGER.info("May you add the item to this order");
		String itemName = getInput();
		List<Order> item = new ArrayList<>();
		Order order = new Order(shippingAddress, customerId, itemName);
		item.add(order);
		order = orderService.create(order);
		LOGGER.info("Order Created");
		return order;
		
	}
		
//		
//	LOGGER.info("May you enter the address you want the order to be delivered to");
//	String shippingAddress = getInput();
//	LOGGER.info("May you enter the customer id");
//	Long customerId = getLongInput();
//	Order order = new Order(shippingAddress, customerId);
//	order = orderService.create(order);
//	LOGGER.info("Order created");		
//	return order;
//	}
//	
//	LOGGER.info("Add your purchased item that you want to create an order for ");
//	List<Item> purchasedItem = itemService.readAll();
//	for (Item item : purchasedItem) {
//		if (item instanceof Item) {	
//	Order order = orderService.create(new Order(orderId, shippingAddress, customerId, purchasedItem));
//	LOGGER.info("Order created");		
//	return order;
//	}

	@Override
	public Order update() {
		LOGGER.info("Please enter the order id you would like to update");
		Long orderId = Long.valueOf(getInput());
		LOGGER.info("Please enter your customer id to update your order");
		Long customerId = Long.valueOf(getInput());
		LOGGER.info("Re-enter Order or Shipping Address");
		String shippingAddress = getInput();
		Order order = new Order(orderId, shippingAddress, customerId);
		order = orderService.update(order);
		LOGGER.info("Order Updated");
			return order;
		}
		
//	@Override
//	public Order update() {
//		LOGGER.info("Please enter the id of the order you would like to update");
//		Long orderId = Long.valueOf(getInput());
//		LOGGER.info("Please confirm the address of the order");
//		String shippingAddress = getInput();
//		LOGGER.info("Add the item you want to the order to update");
//		List<Item> purchasedItem = getInput(;);
//		LOGGER.info("Please confirm your customer id");
//		Long customerId = getLongInput();
//		Order order = orderService.update(new Order(orderId, shippingAddress, customerId, purchasedItem));
//		return order;
//	}

	@Override
	public void delete() {
		LOGGER.info("Please enter the order id of the order you would like to delete");
		Long orderId = Long.valueOf(getInput());
		LOGGER.info("Please enter the customer id to confirm deletion of order");
		Long customerId = Long.valueOf(getInput());
		orderService.delete(orderId);
		orderService.delete(customerId);	
	}


}
