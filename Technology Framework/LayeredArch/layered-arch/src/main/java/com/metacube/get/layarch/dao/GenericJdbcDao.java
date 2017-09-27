package com.metacube.get.layarch.dao;

import java.io.Serializable;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public abstract class GenericJdbcDao<T, ID extends Serializable>
implements
AbstractDao<T, ID> {
	JdbcConnectionFactory connectionFactory = new JdbcConnectionFactory();

	protected abstract String getTableName();
	protected abstract T extractResultSetRow(ResultSet resultSet);
	protected abstract String getPrimaryKeyColoumnName();

	@Override
	public <S extends T> S save(final S entity) {
		return null;
	}

	@Override
	public T findOne(final ID primaryKey) {
		try {
			Connection connection = connectionFactory.getConnection();
			Statement stmt = connection.createStatement();
			ResultSet resultSet = stmt.executeQuery("SELECT * FROM "
					+ getTableName() + " where " + getPrimaryKeyColoumnName()
					+ " = '" + primaryKey + "'");
			System.out.println("in find one " + resultSet.getFetchSize());
			while (resultSet.next()) {
				return extractResultSetRow(resultSet);
			}
			return null;
		} catch (Exception e) {
			// TODO - Logging
			return null;
		}
	}

	@Override
	public Iterable<T> findAll() {
		try {
			Connection connection = connectionFactory.getConnection();
			Statement stmt = connection.createStatement();
			ResultSet resultSet = stmt.executeQuery("SELECT * FROM "
					+ getTableName());
			List<T> userList = new ArrayList<>();
			System.out.println("in find all " + resultSet.getFetchSize());

			while (resultSet.next()) {
				userList.add(extractResultSetRow(resultSet));
			}
			return userList;

		} catch (Exception e) {
			// TODO - Logging
			return Collections.emptyList();
		}

	}

	@Override
	public Long count() {
		return null;
	}

	@Override
	public void delete(final T entity) {

	}

	@Override
	public boolean exists(final ID primaryKey) {
		return false;
	}
}
