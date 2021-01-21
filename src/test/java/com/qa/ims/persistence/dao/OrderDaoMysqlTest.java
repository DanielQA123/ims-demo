package com.qa.ims.persistence.dao;

import static org.junit.Assert.assertEquals;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.qa.ims.Ims;
import com.qa.ims.persistence.domain.Order;

public class OrderDaoMysqlTest {
	public static final Logger LOGGER = Logger.getLogger(OrderDaoMysql.class);
	
	private static String jdbcConnectionUrl = "jdbc:mysql://localhost:3306/ims_test";
	private static String username = "root";
	private static String password = "root";
	
	@BeforeClass
	public static void init() {
		Ims ims = new Ims();
		ims.init(jdbcConnectionUrl, username, password, "src/test/resources/sql-schema.sql");
	}
	
	@Before
	public void setup() {
		try (Connection connection = DriverManager.getConnection(jdbcConnectionUrl, username, password);
				Statement statement = connection.createStatement();) {
			statement.executeUpdate("delete from orders;");
		} catch (Exception e) {
			LOGGER.debug(e.getStackTrace());
			LOGGER.error(e.getMessage());
		}
	}
	
//	@Test
//	public void createTest() {
//		OrderDaoMysql orderDaoMysql = new OrderDaoMysql(jdbcConnectionUrl, username, password);
//		Long orderId = 1L;
//		String shippingAddress = "Help";
//		Long customerId = 1L;
//		Long itemId = 1L;
//		Order order = new Order(orderId, shippingAddress, customerId, itemId);
//		Order savedOrder = new Order(orderId, shippingAddress, customerId, itemId);
//		order = orderDaoMysql.create(order);
//		assertEquals(savedOrder, order);
//	}
	
	@Test
	public void readTest() {
		OrderDaoMysql orderDaoMysql = new OrderDaoMysql(jdbcConnectionUrl, username, password);
		List<Order> orders = new ArrayList<>();
		Long orderId = 1L;
		String shippingAddress = "Help";
		Long customerId = 1L;
		Long itemId = 1L;
		Order order = new Order(orderId, shippingAddress, customerId, itemId);
		Order savedOrder = new Order(orderId, shippingAddress, customerId, itemId);
		orders = orderDaoMysql.readAll();
		assertEquals(savedOrder, order);
	}
	
	@Test
	public void readAllTest() {
		List<Order> orders = new ArrayList<>();
		OrderDaoMysql orderDaoMysql = new OrderDaoMysql(jdbcConnectionUrl, username, password);
		Long orderId = 1L;
		String shippingAddress = "Help";
		Long customerId = 1L;
		Long itemId = 1L;
		Order order = new Order(orderId, shippingAddress, customerId, itemId);
		Order savedOrder = new Order(orderId, shippingAddress, customerId, itemId);
		orders = orderDaoMysql.readAll();
		assertEquals(savedOrder, order);
	}
	
	@Test
	public void updateTest() {
		OrderDaoMysql orderDaoMysql = new OrderDaoMysql(jdbcConnectionUrl, username, password);
		Long orderId = 1L;
		String shippingAddress = "Help";
		Long customerId = 1L;
		Long itemId = 1L;
		Order order = new Order(orderId, shippingAddress, customerId, itemId);
		Order savedOrder = new Order(orderId, shippingAddress, customerId, itemId);
		order = orderDaoMysql.update(savedOrder);
	}
	
	@Test
	public void deleteTest() {
		OrderDaoMysql orderDaoMysql = new OrderDaoMysql(jdbcConnectionUrl, username, password);
		Long orderId = 1L;
		orderDaoMysql.delete(1L);
	}
	
	}


