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

import com.qa.ims.persistence.domain.Order;
import com.qa.ims.services.OrderServices;

@RunWith(MockitoJUnitRunner.class)
public class OrderControllerTest {
	
	@Mock
	private OrderServices orderServices;
	
	@Spy
	@InjectMocks
	private OrderController orderController;
	
	@Test
	public void readAllTest() {
		OrderController orderController = new OrderController(orderServices);
		List<Order> orders = new ArrayList<>();
		orders.add(new Order("Help",1L,1L));
		Mockito.when(orderServices.readAll()).thenReturn(orders);
		assertEquals(orders, orderController.readAll());
	}
	
	@Test
	public void createTest() {
		List<Order> item = new ArrayList<>();
		Long customerId = 1L;
		Long orderId = 1L;
		Long itemId = 1L;
		String shippingAddress ="Help";
		Mockito.doReturn(customerId, orderId, itemId).when(orderController).getLongInput();
		Mockito.doReturn(shippingAddress).when(orderController).getInput();
		Order order = new Order(orderId, shippingAddress, customerId);
		Order savedOrder = new Order(1L, "Help", 1L, 1L);
		Mockito.when(orderServices.create(order)).thenReturn(savedOrder);
		assertEquals(order, orderController.create());
	}
	
	@Test
	public void UpdateTest() {
		Long orderId = 1L;
		String shippingAddress ="Help";
		Long itemId = 1L;
		Long customerId = 1L;
		Mockito.doReturn(shippingAddress).when(orderController).getInput();
		Mockito.doReturn(orderId, itemId, customerId).when(orderController).getLongInput();
		Order order = new Order(1L, shippingAddress, 1L, 1L);
		Mockito.when(orderServices.update(order)).thenReturn(order);
		assertEquals(order, orderController.update());
	}
	
	@Test
	public void deleteTest() {
		String orderId = "1";
		String customerId = "1";
		Mockito.doReturn(orderId, customerId).when(orderController).getInput();
		orderController.delete();
		Mockito.verify(orderServices, Mockito.times(2)).delete(1L);
	} 
	

}
