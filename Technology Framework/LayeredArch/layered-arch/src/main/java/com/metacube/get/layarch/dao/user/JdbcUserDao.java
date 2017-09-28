package com.metacube.get.layarch.dao.user;

import java.sql.ResultSet;
import java.sql.SQLException;

import com.metacube.get.layarch.dao.GenericJdbcDao;
import com.metacube.get.layarch.model.User;

public class JdbcUserDao extends GenericJdbcDao<User, Integer>
implements
UserDao {

	@Override
	protected String getTableName() {
		return "User";
	}

	@Override
	protected User extractResultSetRow(final ResultSet resultSet) {
		User user = new User();

		try {
			user.setSource(resultSet.getString("source"));
			user.setName(resultSet.getString("name"));
			user.setPrice(resultSet.getInt("price"));
			user.setId(resultSet.getInt("id"));
		} catch (SQLException e) {
			System.out.println("error getting here");
			e.printStackTrace();
		}

		return user;
	}

	@Override
	protected String getPrimaryKeyColoumnName() {
		return "id";
	}
}
