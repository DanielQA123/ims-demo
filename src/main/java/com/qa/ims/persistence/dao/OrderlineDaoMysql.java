package com.qa.ims.persistence.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;

import com.qa.ims.persistence.domain.Order;

public class OrderlineDaoMysql implements Dao<Order> {
	
	public static final Logger LOGGER = Logger.getLogger(OrderlineDaoMysql.class);
	
	private String jdbcConnectionUrl;
	private String username;
	private String password;
	
	public OrderlineDaoMysql(String username, String password ) {
		this.jdbcConnectionUrl = "jdbc:mysql://localhost:3306/ims";
		this.username = username;
		this.password = password;
	}
	public OrderlineDaoMysql(String jdbcConnectionUrl, String username, String password) {
		super();
		this.jdbcConnectionUrl = jdbcConnectionUrl;
		this.username = username;
		this.password = password;
	}
	
	Order orderlineFromResultSet(ResultSet resultSet) throws SQLException {
		Long orderId = resultSet.getLong("id");
		String shippingAddress = resultSet.getString("shippingAddress");
		Long customerId = resultSet.getLong("customer_id");
		String itemName = resultSet.getString("item_name");
		return new Order(orderId, shippingAddress, customerId, itemName);
	}

	@Override
	public List<Order> readAll() {
		try (Connection connection = DriverManager.getConnection(jdbcConnectionUrl, username, password);
				Statement stat = connection.createStatement();
				ResultSet resultSet = stat.executeQuery("SELECT * from orderline");) {
			ArrayList<Order> orderlines = new ArrayList<>();
			while (resultSet.next()) {
				orderlines.add(orderlineFromResultSet(resultSet));
			}
			return orderlines;
		} catch (SQLException e) {
			LOGGER.debug(e.getStackTrace());
			LOGGER.error(e.getMessage());
		}
		return new ArrayList<>();
	}
	
	public Order 
	

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
