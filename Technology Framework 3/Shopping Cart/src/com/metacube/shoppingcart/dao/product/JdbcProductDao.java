/**
 * @Date 02-October-2017
 * @author Rajat Jain
 * @version 1.0
 * @Project Shopping Cart implemented through Angular and Spring mvc

 */
package com.metacube.shoppingcart.dao.product;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.stereotype.Component;

import com.metacube.shoppingcart.dao.GenericJdbcDao;
import com.metacube.shoppingcart.model.Product;

/**
 * The Class JdbcProductDao.
 */
@Component("productDao")
public class JdbcProductDao extends GenericJdbcDao<Product, Integer>
implements
ProductDao {

	/** The table name. */
	private String tableName = "product";

	/**
	 * Sets the table name.
	 *
	 * @param tableName
	 *            the new table name
	 */
	public void setTableName(String tableName) {
		this.tableName = tableName;
	}

	/*
	 * @see com.metacube.shoppingcart.dao.GenericJdbcDao#getTableName()
	 */
	@Override
	protected String getTableName() {
		return tableName;
	}

	/*
	 * @see
	 * com.metacube.shoppingcart.dao.GenericJdbcDao#extractResultSetRow(java
	 * .sql.ResultSet)
	 */
	@Override
	protected Product extractResultSetRow(final ResultSet resultSet) {
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

	/*
	 * @see
	 * com.metacube.shoppingcart.dao.GenericJdbcDao#getPrimaryKeyColoumnName()
	 */
	@Override
	protected String getPrimaryKeyColoumnName() {
		return "id";
	}

	/*
	 * @see com.metacube.shoppingcart.dao.BaseDao#delete(java.lang.Object)
	 */
	@Override
	public boolean delete(Product entity) {

		return false;
	}
}
