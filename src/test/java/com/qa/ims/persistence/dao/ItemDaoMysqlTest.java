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
import com.qa.ims.persistence.domain.Item;

public class ItemDaoMysqlTest {

	public static final Logger LOGGER = Logger.getLogger(ItemDaoMysql.class);

	private static String jdbcConnectionUrl = "jdbc:mysql://localhost:3306/ims_test";
	private static String username = "root";
	private static String password = "root";

	@BeforeClass
	public static void init() {
		Ims ims = new Ims();
		ims.init(jdbcConnectionUrl, username, password, "src/test/resources/sql-schema.sql");
	}

	@Before
	public void setUp() {
		try (Connection connection = DriverManager.getConnection(jdbcConnectionUrl, username, password);
				Statement stat = connection.createStatement();) {
			stat.executeUpdate("DELETE from items;");

		} catch (Exception e) {
			LOGGER.debug(e.getStackTrace());
			LOGGER.error(e.getMessage());
		}
	}

	@Test
	public void createTest() {
		ItemDaoMysql itemDaoMysql = new ItemDaoMysql(jdbcConnectionUrl, username, password);
		Long itemId = 1L;
		String itemName = "Toaster";
		double price = 24.00;
		Item item = new Item(1L, itemName, price);
		Item savedItem = new Item(1L, itemName, price);
		item = itemDaoMysql.create(item);
		assertEquals(savedItem, item);
	}

	@Test
	public void readTest() {
		ItemDaoMysql itemDaoMysql = new ItemDaoMysql(jdbcConnectionUrl, username, password);
		List<Item> items = new ArrayList<>();
		Long itemId = 1L;
		String itemName = "Toaster";
		double price = 24.00;
		Item item = new Item(1L, itemName, price);
		Item savedItem = new Item(1L, itemName, price);
		items = itemDaoMysql.readAll();
		assertEquals(savedItem, item);
	}

	@Test
	public void readAllTest() {
		List<Item> items = new ArrayList<>();
		ItemDaoMysql itemDaoMysql = new ItemDaoMysql(jdbcConnectionUrl, username, password);
		Long itemId = 1L;
		String itemName = "Toaster";
		double price = 24.00;
		Item item = new Item(1L, itemName, price);
		Item savedItem = new Item(1L, itemName, price);
		items = itemDaoMysql.readAll();
		assertEquals(savedItem, item);
	}

	@Test
	public void updateTest() {
		ItemDaoMysql itemDaoMysql = new ItemDaoMysql(jdbcConnectionUrl, username, password);
		Long itemId = 1L;
		String itemName = "Toaster";
		double price = 24.00;
		Item item = itemDaoMysql.create(new Item(itemName,price));
		item.setItemName("Kettle");
		Item update = itemDaoMysql.update(item);
		assertEquals(item, update);
	}

	@Test
	public void deleteTest() {
		ItemDaoMysql itemDaoMysql = new ItemDaoMysql(jdbcConnectionUrl, username, password);
		Long itemId = 1L;
		itemDaoMysql.delete(1L);
	}

}
