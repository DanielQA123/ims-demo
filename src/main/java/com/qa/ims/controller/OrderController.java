package com.qa.ims.controller;

import java.util.List;

import org.apache.log4j.Logger;

import com.qa.ims.persistence.domain.Order;
import com.qa.ims.services.CrudServices;
import com.qa.ims.utils.Utils;

public class OrderController implements CrudController<Order> {
	
	public static final Logger LOGGER = Logger.getLogger(OrderController.class);

	private CrudServices<Order> orderService;
	
	
	public OrderController(CrudServices<Order> orderService) {
		this.orderService = orderService;
	}
	String getInput() {
		return Utils.getInput();
	}
	
	double getDouble() {
		return Utils.getDouble();
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
	LOGGER.info("May you enter the address you want the order to be delivered to");
	String shippingAddress = getInput();
	LOGGER.info("May you enter the item");
	String itemName = getInput();
	LOGGER.info("Please enter the item price ");
	double priceOfOrder = getDouble();
	LOGGER.info("Order created");		
	return order;
	}

	@Override
	public Order update() {
		LOGGER.info("Please enter the id of the order you would like to update");
		Long orderId = Long.valueOf(getInput());
		
		
		// TODO Auto-generated method stub
		return null;
	}

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
