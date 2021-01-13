package com.qa.ims.services;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;


@RunWith(MockitoJUnitRunner.class)
public class ItemServicesTest {

		  @Mock
		  private Dao<Item> ItemDao;
		  
		  @InjectMocks
		  private ItemServices itemServices;
		  
		  @Test
		  public void itemServicesCreate() {
			  Item item = new Item();
			  itemServices.create(item);
}
}