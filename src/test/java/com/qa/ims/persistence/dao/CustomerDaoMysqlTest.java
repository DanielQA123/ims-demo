package com.qa.ims.persistence.dao;

import org.apache.log4j.Logger;
import org.junit.BeforeClass;

import com.qa.ims.Ims;

public class CustomerDaoMysqlTest {

	public static final Logger LOGGER = Logger.getLogger(CustomerDaoMysql.class);

	private static String jdbcConnectionUrl="jdbc:mysql://localhost:3306/ims_test";
	private static String username ="root";
	private static String password ="root";
	
	@BeforeClass
	public static void init() {
	//intialize the ims object 
		
		Ims ims = new Ims();
		ims.init(jdbcConnectionUrl, username, password,"src/test/resources/sql-schema.sql");
		
	}
	
}
