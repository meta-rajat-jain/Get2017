package com.metacube.get.layarch.dao;

import java.sql.Connection;
import java.sql.DriverManager;

public class JdbcConnectionFactory {
	Connection getConnection() throws Exception {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection(
					"jdbc:mysql://127.0.0.1:3306/get_testdb", "root", "rajat");
			System.out.println(con);
			return con;
		} catch (Exception e) {
			System.out.println("error in SQL" + e);
			throw e;
		}
	}
}
