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
import com.qa.ims.persistence.domain.Orderline;

public class OrderlineDaoMysqlTest {
	
	public static final Logger LOGGER = Logger.getLogger(OrderlineDaoMysql.class);
	
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
			statement.executeUpdate("delete from orderline;");
		} catch (Exception e) {
			LOGGER.debug(e.getStackTrace());
			LOGGER.error(e.getMessage());
		}
		
	}
	
	@Test
	public void createTest() {
		OrderlineDaoMysql orderlineDaoMysql = new OrderlineDaoMysql(jdbcConnectionUrl, username, password);
		Long orderlineId = 1L;
		Long orderId = 1L;
		Long itemId = 1L;
		Long customerId = 1L;
		Orderline orderline = new Orderline(1L, 1L, 1L, 1L);
		Orderline savedOrderline = new Orderline(1L, 1L, 1L, 1L);
		orderline = orderlineDaoMysql.create(orderline);
		assertEquals(savedOrderline, orderline);
	}
	
	@Test
	public void readTest() {
		List<Orderline> orderlines = new ArrayList<>();
		OrderlineDaoMysql orderlineDaoMysql = new OrderlineDaoMysql(jdbcConnectionUrl, username, password);
		Long orderlineId = 1L;
		Long orderId = 1L;
		Long itemId = 1L;
		Long customerId = 1L;
		Orderline orderline = new Orderline(1L, 1L, 1L, 1L);
		Orderline savedOrderline = new Orderline(1L, 1L, 1L, 1L);
		orderlines = orderlineDaoMysql.readAll();
		assertEquals(savedOrderline, orderline);	
	}
	
	@Test
	public void readAllTest() {
		List<Orderline> orderlines = new ArrayList<>();
		OrderlineDaoMysql orderlineDaoMysql = new OrderlineDaoMysql(jdbcConnectionUrl, username, password);
		Long orderlineId = 1L;
		Long orderId = 1L;
		Long itemId = 1L;
		Long customerId = 1L;
		Orderline orderline = new Orderline(1L, 1L, 1L, 1L);
		Orderline savedOrderline = new Orderline(1L, 1L, 1L, 1L);
		orderlines = orderlineDaoMysql.readAll();
		assertEquals(savedOrderline, orderline);	
	}
	
	@Test
	public void updateTest() {
		OrderlineDaoMysql orderlineDaoMysql = new OrderlineDaoMysql(jdbcConnectionUrl, username, password);
		Long orderlineId = 1L;
		Long orderId = 1L;
		Long itemId = 1L;
		Long customerId = 1L;
		Orderline orderline = new Orderline(1L, 1L, 1L, 1L);
		Orderline savedOrderline = new Orderline(1L, 1L, 1L, 1L);
		orderline = orderlineDaoMysql.update(savedOrderline);
		assertEquals(savedOrderline, orderline);
	}
	
	@Test
	public void deleteTest() {
		OrderlineDaoMysql orderlineDaoMysql = new OrderlineDaoMysql(jdbcConnectionUrl, username, password);
		Long orderlineId = 1L;
		orderlineDaoMysql.delete(1L);
	}
	


}
