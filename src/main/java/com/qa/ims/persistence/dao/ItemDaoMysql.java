package com.qa.ims.persistence.dao;

import org.apache.log4j.Logger;

public class ItemDaoMysql implements Dao<Item> {
	
	public static final Logger LOGGER = Logger.getLogger(ItemDaoMysql.class);
    
	private String jdbcConnectionUrl;
	private String username;
	private String password;
	
	public ItemDaoMysql()
	
}
