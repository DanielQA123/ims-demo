package com.qa.ims.services;

import java.util.List;

import com.qa.ims.persistence.dao.Dao;
import com.qa.ims.persistence.domain.Order;

public class OrderServices implements CrudServices<Order> {
	
	private Dao<Order> orderDao;
	
	
	public OrderServices(Dao<Order> orderDao) {
		this.orderDao = orderDao;

}
	@Override
	public List<Order> readAll() {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public Order create(Order t) {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public Order update(Order t) {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		
	}

}

