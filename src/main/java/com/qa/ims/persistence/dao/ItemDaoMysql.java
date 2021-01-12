package com.qa.ims.persistence.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;


import com.qa.ims.persistence.domain.Item;

public class ItemDaoMysql implements Dao<Item> {
	
	public static final Logger LOGGER = Logger.getLogger(ItemDaoMysql.class);
    
	private String jdbcConnectionUrl;
	private String username;
	private String password;
	
	public ItemDaoMysql(String username, String password) {
		this.jdbcConnectionUrl = "jdbc:mysql://localhost:3306/ims";
		this.username = username;
		this.password = password;
	}
	
	public ItemDaoMysql(String jdbcConnectionUrl, String username, String password) {
		this.jdbcConnectionUrl = jdbcConnectionUrl;
		this.username = username;
		this.password = password;
	}
	
	Item itemFromResultSet(ResultSet resultSet) throws SQLException {
	Long itemId = resultSet.getLong("id");
	String itemName = resultSet.getString("item_name");
	int itemQuantity = resultSet.getInt("quantity");
	double price = resultSet.getDouble("price");
	return new Item(itemId, itemName, itemQuantity, price);
	}

	//Reads all the items within the database 
	//returns a list of items 
	
	@Override
	public List<Item> readAll() {
		try (Connection connection = DriverManager.getConnection(jdbcConnectionUrl, username, password);
				Statement stat = connection.createStatement();
				ResultSet resultSet = stat.executeQuery("select * from items");) {
			ArrayList<Item> items = new ArrayList<>();
			while (resultSet.next()) {
			items.add(itemFromResultSet(resultSet));
			}
			return items;
			
		} catch (SQLException e) {
			LOGGER.debug(e.getStackTrace());
			LOGGER.error(e.getMessage());
		}
		return new ArrayList<>();
		
	}
	
	public Item readLatest() {
			try (Connection connection = DriverManager.getConnection(jdbcConnectionUrl, username, password);
					Statement stat = connection.createStatement();
					ResultSet resultSet = stat.executeQuery("SELECT * FROM items ORDER BY id DESC LIMIT 1");) {
				resultSet.next();
				return itemFromResultSet(resultSet);
				
			} catch (Exception e) {
				LOGGER.debug(e.getStackTrace());
				LOGGER.error(e.getMessage());
			}
			return null;
	}
	
	//Creates an Item within the database
	
	@Override
	public Item create(Item item) {
		try (Connection connection = DriverManager.getConnection(jdbcConnectionUrl, username, password);
				Statement stat = connection.createStatement();) {
			stat.executeUpdate("INSERT into items(item_name, itemQuantity, price) values('" + item.getItemName()
					+ "','" + item.getItemQuantity() + "','" + item.getPrice() + "')");
			return readLatest();
			
		} catch (Exception e) {
			LOGGER.debug(e.getStackTrace());
			LOGGER.error(e.getMessage());
		}
		return null;
	}
	
	public Item readItem(Long id) {
		try (Connection connection = DriverManager.getConnection(jdbcConnectionUrl, username, password);
				Statement stat = connection.createStatement();
				ResultSet resultSet = stat.executeQuery("SELECT FROM items where id = " + id);) {
			resultSet.next();
			return itemFromResultSet(resultSet);
			
		} catch (Exception e) {
			LOGGER.debug(e.getStackTrace());
			LOGGER.error(e.getMessage());
		}
		return null;
		
	}
		
	//Updates an item/product in the database
	//@param item - takes in an item object, the id field will be used to
	 //update that item in the database

	@Override
	public Item update(Item item) {
		try (Connection connection = DriverManager.getConnection(jdbcConnectionUrl, username, password);
				Statement stat = connection.createStatement();) {
			stat.executeUpdate("UPDATE items set item_name ='" + item.getItemName() + "', price ='"
					+ item.getPrice() + "',itemQuantity='" + item.getItemQuantity() + "' where id =" + item.getItemId());
			return readItem(item.getItemId());
			
		} catch (Exception e) {
			LOGGER.debug(e.getStackTrace());
			LOGGER.error(e.getMessage());
		}	
		return null;
	}

	@Override
	public void delete(long id) {
		try (Connection connection = DriverManager.getConnection(jdbcConnectionUrl, username, password);
				Statement stat = connection.createStatement();) {
			stat.executeUpdate("DELETE from items where id = " + id);
			
		} catch (Exception e) {
			LOGGER.debug(e.getStackTrace());
			LOGGER.error(e.getMessage());
		}
		
		
	}
	
	
	
}

