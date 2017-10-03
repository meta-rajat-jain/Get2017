/**
 * @Date 02-October-2017
 * @author Rajat Jain
 * @version 1.0
 * @Project Shopping Cart implemented through Angular and Spring mvc

 */
package com.metacube.shoppingcart.dao;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 * Returns Connection Object.
 */
public class JdbcConnectionFactory {

	/**
	 * Gets the connection.
	 *
	 * @return the connection
	 * @throws Exception
	 *             the exception
	 */
	Connection getConnection() throws Exception {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/get_testdb", "root", "rajat");
			return con;
		} catch (Exception e) {
			System.out.println(e);
			throw e;
		}
	}
}
