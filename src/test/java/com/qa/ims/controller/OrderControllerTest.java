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
	}
	
	@Test
	public void UpdateTest() {
		String orderId = "1";
		String shippingAddress ="Help";
		String itemId = "1";
		String customerId ="1";
		Mockito.doReturn(shippingAddress).when(orderController).getInput();
		Mockito.doReturn(orderId, itemId, customerId).when(orderController).getLongInput();
		Order order = new Order(1L, shippingAddress, 1L, 1L);
		Mockito.when(orderServices.update(order)).thenReturn(order);
		assertEquals(order, orderController.update());
	}
	
	@Test
	public void deleteTest() {
		String orderId = "1";
		Mockito.doReturn(orderId).when(orderController).getLongInput();
		orderController.delete();
		Mockito.verify(orderServices, Mockito.times(1)).delete(1L);
	}

}
