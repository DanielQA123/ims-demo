package com.qa.ims.persistence.dao;

import java.util.List;

import org.apache.log4j.Logger;

import com.qa.ims.persistence.domain.Order;

public class OrderlineDaoMysql implements Dao<Order> {
	
	public static final Logger LOGGER = Logger.getLogger(OrderlineDaoMysql.class);
	
	private String jdbcConnectionUrl;
	private String username;
	private String password;
	
	
	
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
	public void delete(long id) {
		// TODO Auto-generated method stub
		
	}

}
