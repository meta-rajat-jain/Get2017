/**
 * @Date 02-October-2017
 * @author Rajat Jain
 * @version 1.0
 * @Project Shopping Cart implemented through Angular and Spring mvc

 */
package com.metacube.shoppingcart.dao;

import java.io.Serializable;

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
	 * @param entity
	 *            the entity
	 * @return true, if successful
	 */
	boolean delete(T entity);

	/**
	 * Exists.
	 *
	 * @param primaryKey
	 *            the primary key
	 * @return true, if successful
	 */
	boolean exists(ID primaryKey);

	/**
	 * Delete.
	 *
	 * @param primaryKey
	 *            the primary key
	 * @return true, if successful
	 */
	boolean delete(ID primaryKey);
}
