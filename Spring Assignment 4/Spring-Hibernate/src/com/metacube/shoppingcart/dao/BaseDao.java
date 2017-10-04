/**
 * @Date 02-October-2017
 * @author Rajat Jain
 * @version 1.0
 * @Project Product implementation using Spring MVC and hibernate
 */
package com.metacube.shoppingcart.dao;

import java.io.Serializable;

import com.metacube.shoppingcart.model.Product;

/**
 * The Interface BaseDao.
 *
 * @param <T>
 *            the generic type
 * @param <ID>
 *            the generic type
 */
public interface BaseDao<T, ID extends Serializable> {

	/**
	 * Find one.
	 *
	 * @param primaryKey
	 *            the primary key
	 * @return the t
	 */
	T findOne(ID primaryKey);

	/**
	 * Find all.
	 *
	 * @return the iterable
	 */
	Iterable<T> findAll();

	/**
	 * Delete.
	 *
	 * @return
	 */
	boolean delete(ID primaryKey);

	/**
	 * Exists.
	 *
	 * @param primaryKey
	 *            the primary key
	 * @return true, if successful
	 */
	boolean exists(ID primaryKey);

	Product update(int id, String name, double price);
	Product save(int id, String name, double price);

}
