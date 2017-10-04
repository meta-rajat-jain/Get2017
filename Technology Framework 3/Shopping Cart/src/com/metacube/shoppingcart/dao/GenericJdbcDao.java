/**
 * @Date 02-October-2017
 * @author Rajat Jain
 * @version 1.0
 * @Project Shopping Cart implemented through Angular and Spring mvc

 */
package com.metacube.shoppingcart.dao;

import java.io.Serializable;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * The Class GenericJdbcDao.
 *
 * @param <T>
 *            the generic type
 * @param <ID>
 *            the generic type
 */
public abstract class GenericJdbcDao<T, ID extends Serializable>
implements
BaseDao<T, ID> {

	/** The connection factory. */
	JdbcConnectionFactory connectionFactory = new JdbcConnectionFactory();

	/**
	 * Gets the table name.
	 *
	 * @return the table name
	 */
	protected abstract String getTableName();

	/**
	 * Extract result set row.
	 *
	 * @param resultSet
	 *            the result set
	 * @return the t
	 */
	protected abstract T extractResultSetRow(ResultSet resultSet);

	/**
	 * Gets the primary key coloumn name.
	 *
	 * @return the primary key coloumn name
	 */
	protected abstract String getPrimaryKeyColoumnName();

	/*
	 * @see com.metacube.shoppingcart.dao.BaseDao#findOne(java.io.Serializable)
	 */
	@Override
	public T findOne(final ID primaryKey) {
		Connection connection;
		try {
			connection = connectionFactory.getConnection();
			Statement stmt = connection.createStatement();
			ResultSet resultSet = stmt.executeQuery("SELECT * FROM "
					+ getTableName() + " where " + getPrimaryKeyColoumnName()
					+ " = '" + primaryKey + "'");
			while (resultSet.next()) {
				return extractResultSetRow(resultSet);
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;

	}

	/*
	 * @see com.metacube.shoppingcart.dao.BaseDao#findAll()
	 */
	@Override
	public Iterable<T> findAll() {
		try {
			Connection connection = connectionFactory.getConnection();
			Statement stmt = connection.createStatement();
			ResultSet resultSet = stmt.executeQuery("SELECT * FROM "
					+ getTableName());
			List<T> productList = new ArrayList();
			while (resultSet.next()) {
				productList.add(extractResultSetRow(resultSet));
			}
			return productList;

		} catch (Exception e) {
			return Collections.emptyList();
		}

	}

	/*
	 * @see com.metacube.shoppingcart.dao.BaseDao#delete(java.io.Serializable)
	 */
	@Override
	public boolean delete(final ID primaryKey) {
		boolean result = true;
		try {
			Connection connection = connectionFactory.getConnection();
			Statement stmt = connection.createStatement();
			String query = "DELETE FROM " + getTableName() + " where "
					+ getPrimaryKeyColoumnName() + " = '" + primaryKey + "'";
			stmt.executeUpdate(query);

		} catch (Exception e) {
			e.printStackTrace();
			result = false;
		}
		return result;
	}

	/*
	 * @see com.metacube.shoppingcart.dao.BaseDao#exists(java.io.Serializable)
	 */
	@Override
	public boolean exists(final ID primaryKey) {

		return false;
	}
}
