package com.qa.ims.controller;

import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
@RunWith(MockitoJUnitRunner.class)

public class ItemControllerTest {

  @Mock
  private Dao<Item> ItemDao;
  
  @InjectMocks
  private ItemServices itemServices;
  
  @Test
  public void itemServicesCreate() {
	  Item item = new Item();
  }
  
  
  

}
