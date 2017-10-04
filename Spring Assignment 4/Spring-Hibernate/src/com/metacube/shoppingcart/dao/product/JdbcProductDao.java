/**
 * @Date 02-October-2017
 * @author Rajat Jain
 * @version 1.0
 * @Project Product implementation using Spring MVC and hibernate
 */
package com.metacube.shoppingcart.dao.product;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.stereotype.Component;

import com.metacube.shoppingcart.dao.JdbcDao;
import com.metacube.shoppingcart.model.Product;

/**
 * The Class JdbcProductDao.
 */
@Component("productDao")
public class JdbcProductDao extends JdbcDao<Product, Integer>
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
	 * (non-Javadoc)
	 * 
	 * @see com.metacube.shoppingcart.dao.JdbcDao#getTableName()
	 */
	@Override
	protected String getTableName() {
		return tableName;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.metacube.shoppingcart.dao.JdbcDao#extractResultSetRow(java.sql.ResultSet
	 * )
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

	@Override
	public boolean delete(Integer primaryKey) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	protected String getPrimaryKeyColoumnName() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Product save(int id, String name, double price) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Product update(int id, String name, double price) {
		// TODO Auto-generated method stub
		return null;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.metacube.shoppingcart.dao.JdbcDao#getPrimaryKeyColoumnName()
	 */

}
