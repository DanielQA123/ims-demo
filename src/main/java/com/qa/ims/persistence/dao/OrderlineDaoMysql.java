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
	import com.qa.ims.persistence.domain.Orderline;

	public class OrderlineDaoMysql implements Dao<Order> {

		public static final Logger LOGGER = Logger.getLogger(OrderlineDaoMysql.class);

		private String jdbcConnectionUrl;
		private String username;
		private String password;

		public OrderlineDaoMysql(String username, String password) {
			this.jdbcConnectionUrl = "jdbc:mysql://localhost:3306/ims";
			this.username = username;
			this.password = password;
		}

		public OrderlineDaoMysql(String jdbcConnectionUrl, String username, String password) {
			this.jdbcConnectionUrl = jdbcConnectionUrl;
			this.username = username;
			this.password = password;
		}

		Orderline orderlineFromResultSet(ResultSet resultSet) throws SQLException {
			Long orderlineId = resultSet.getLong("id");
			Long itemId = resultSet.getLong("item_id");
			Long customerId = resultSet.getLong("customer_id");
			return new Orderline(orderlineId, itemId, customerId);
		}

		@Override
		public List<Orderline> readAll() {
			try (Connection connection = DriverManager.getConnection(jdbcConnectionUrl, username, password);
					Statement stat = connection.createStatement();
					ResultSet resultSet = stat.executeQuery("SELECT * from orderline");) {
				ArrayList<Orderline> orderlines = new ArrayList<>();
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

		public Orderline readLatest() {
			try (Connection connection = DriverManager.getConnection(jdbcConnectionUrl, username, password);
					Statement stat = connection.createStatement();
					ResultSet resultSet = stat.executeQuery("SELECT * FROM orderline ORDER BY id DESC LIMIT 1");) {
				resultSet.next();
				return orderlineFromResultSet(resultSet);

			} catch (Exception e) {
				LOGGER.debug(e.getStackTrace());
				LOGGER.error(e.getMessage());
			}
			return null;
		}

		@Override
		public Orderline create(Orderline orderline) {
			try (Connection connection = DriverManager.getConnection(jdbcConnectionUrl, username, password);
					Statement stat = connection.createStatement();) {
				stat.executeUpdate("INSERT into orderline (customer_id, item_id, order_id) values('" + orderline.getCustomerId() + "'," 
						+ orderline.getItemId() + "," + orderline.getOrderId() + ")");
				return readLatest();
			} catch (Exception e) {
				LOGGER.debug(e.getStackTrace());
				LOGGER.error(e.getMessage());
			}
			return null;
		}

		@Override
		public Orderline update(Orderline orderline) {
			try (Connection connection = DriverManager.getConnection(jdbcConnectionUrl, username, password);
					Statement stat = connection.createStatement();) {
				stat.executeUpdate("UPDATE orderline set customerId ='" + orderline.getCustomerId() + "', item_id ='"
						+ orderline.getItemId() + "' where orderId=" + orderline.getOrderId());
				return readOrderline(orderline.getOrderId());
			} catch (Exception e) {
				LOGGER.debug(e.getStackTrace());
				LOGGER.error(e.getMessage());
			}
			return null;
		}

		public Orderline readOrderline(Long id) {
			try (Connection connection = DriverManager.getConnection(jdbcConnectionUrl, username, password);
					Statement stat = connection.createStatement();
					ResultSet resultSet = stat.executeQuery("SELECT * FROM orderline where id = " + id);) {
				resultSet.next();
				return orderlineFromResultSet(resultSet);
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
				stat.executeUpdate("DELETE from orderline where id = " + id);
			} catch (Exception e) {
				LOGGER.debug(e.getStackTrace());
				LOGGER.error(e.getMessage());
			}

		}
		
	}