package com.metacube.shoppingcart.dao.product;

import java.sql.ResultSet;
import java.sql.SQLException;

import com.metacube.shoppingcart.dao.JdbcDao;
import com.metacube.shoppingcart.modal.Product;

public class JdbcProductDao extends JdbcDao<Product, Integer>
implements
ProductDao {

	private String tableName;

	public void setTableName(final String tableName) {
		this.tableName = tableName;
	}

	@Override
	public String getTableName() {
		return tableName;
	}
	@Override
	protected Product extractResultSetRow(ResultSet resultSet) {

		Product product = new Product();
		try {
			product.setName(resultSet.getString("name"));
			product.setId(resultSet.getInt("id"));
			product.setPrice(resultSet.getDouble("price"));
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return product;
	}

	@Override
	protected String getPrimaryKeyColoumnName() {

		return "id";
	}

}
