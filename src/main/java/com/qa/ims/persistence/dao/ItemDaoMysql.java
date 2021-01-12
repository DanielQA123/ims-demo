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
	public Item create(Item t) {
		try (Connection connection = DriverManager.getConnection(jdbcConnectionUrl, username, password);
				Statement stat = connection.createStatement();) {
			stat.executeUpdate("INSERT into items(item_name, itemQuantity, price) values('" + t.getItemName()
					+ "','" + t.getItemQuantity() + "','" + t.getPrice() + "')");
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
		
		

	@Override
	public Item update(Item t) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void delete(long id) {
		// TODO Auto-generated method stub
		
	}
	
	
	
}

