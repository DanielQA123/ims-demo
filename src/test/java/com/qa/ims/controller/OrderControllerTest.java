package com.qa.ims.controller;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Spy;
import org.mockito.junit.MockitoJUnitRunner;

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
		
	}
	
	

}
