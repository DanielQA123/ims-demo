package com.qa.ims.persistence.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

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
}
