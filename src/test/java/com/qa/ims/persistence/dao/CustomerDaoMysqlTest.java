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
import com.qa.ims.persistence.domain.Customer;

public class CustomerDaoMysqlTest {

	public static final Logger LOGGER = Logger.getLogger(CustomerDaoMysql.class);

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
//		try (Connection connection = DriverManager.getConnection(jdbcConnectionUrl, username, password);
//				Statement statement = connection.createStatement();) {
////			statement.executeUpdate("delete from customers;");
//		} catch (Exception e) {
//			LOGGER.debug(e.getStackTrace());
//			LOGGER.error(e.getMessage());
//		}
	}
	
	@Test
	public void createTest() {
		CustomerDaoMysql customerDaoMysql = new CustomerDaoMysql(jdbcConnectionUrl, username, password);
		String firstName ="help";
		String surname = "man";
//		Customer customer = new Customer(firstName, surname);
		Customer customer = customerDaoMysql.create( new Customer(firstName, surname));
		Customer savedCustomer = new Customer(1L,firstName, surname);
		Customer create = customerDaoMysql.create(customer);
		assertEquals(savedCustomer, customer);	
	}
	@Test
	public void readTest() {
		CustomerDaoMysql customerDaoMysql = new CustomerDaoMysql(jdbcConnectionUrl, username, password);
		List<Customer> customers = new ArrayList<>();
		String firstName = "chris";
		String surname = "perrins";
		Customer customer = new Customer(1L,firstName, surname);
		Customer savedCustomer = new Customer(1L, firstName, surname);
		customers = customerDaoMysql.readAll();
		assertEquals(savedCustomer, customer);
	}
	
	@Test
	public void readAllTest() {
		List<Customer> customers = new ArrayList<>();
		CustomerDaoMysql customerDaoMysql = new CustomerDaoMysql(jdbcConnectionUrl, username, password);
		String firstName ="rhys";
		String surname = "thompson";
		Customer customer = new Customer(1L, firstName, surname);
		Customer savedCustomer = new Customer(1L, firstName, surname);
		customers = customerDaoMysql.readAll();
		assertEquals(savedCustomer, customer);
	}
	@Test
	public void updateTest() {
		CustomerDaoMysql customerDaoMysql = new CustomerDaoMysql(jdbcConnectionUrl, username, password);
		String firstName = "chris";
		String surname = "perrins";
		Customer customer = customerDaoMysql.create( new Customer(firstName, surname));
		customer.setFirstName("james");
		Customer update = customerDaoMysql.update(customer);
		assertEquals(customer, update);
	}
	
	@Test
	public void deleteTest() {
		CustomerDaoMysql customerDaoMysql = new CustomerDaoMysql(jdbcConnectionUrl, username, password);
		Long id = 1L;
		customerDaoMysql.delete(1L);
	}
	
	
}
