package com.qa.ims.controller;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.Spy;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)

public class ItemControllerTest {

  @Mock
  private ItemServices itemServices; 
  
  @Spy
  @InjectMocks
  private ItemController itemController;
  
  @Test
  public void readAllTest() {
  }
  
  @Test
  public void createTest() {
	  String itemName = "";
	  int itemQuantity = ;
	  double price = ;
	  Mockito.doReturn(itemName, price).when(itemController).getInput();
	  
	  
  }
  
  
  }
  
  
  


