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

import com.qa.ims.persistence.domain.Orderline;
import com.qa.ims.services.OrderlineServices;

@RunWith(MockitoJUnitRunner.class)
public class OrderlineControllerTest {
	
	@Mock
	private OrderlineServices orderlineServices;
	
	@Spy
	@InjectMocks
	private OrderlineController orderlineController;
	
	@Test
	public void readAllTest() {
		OrderlineController orderlineController = new OrderlineController(orderlineServices);
		List<Orderline> orderlines = new ArrayList<>();
		orderlines.add(new Orderline(1L, 1L, 1L, 1L));
		Mockito.when(orderlineServices.readAll()).thenReturn(orderlines);
		assertEquals(orderlines, orderlineController.readAll());
	}
	
	@Test
	public void createTest() {
		
	}
	
	@Test
	public void updateTest() {
	Long orderlineId = 1L;
	Long orderId = 1L;
	Long itemId = 1L;
	Long customerId = 1L;
	Mockito.doReturn(orderlineId, orderId, itemId, customerId).when(orderlineController).getLongInput();
	Orderline orderline = new Orderline(1L, 1L, 1L, 1L);
	Mockito.when(orderlineServices.update(orderline)).thenReturn(orderline);
	
		
	}
	
	@Test
	public void deleteTest() {
		
	}

}
