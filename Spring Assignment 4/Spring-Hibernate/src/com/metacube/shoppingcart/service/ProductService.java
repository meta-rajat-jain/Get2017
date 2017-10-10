/**
 * @Date 02-October-2017
 * @author Rajat Jain
 * @version 1.0
 * @Project Product implementation using Spring MVC and hibernate
 */
package com.metacube.shoppingcart.service;

import com.metacube.shoppingcart.model.Product;

/**
 * The Interface ProductService.
 */
public interface ProductService {

	/**
	 * Gets the all products.
	 *
	 * @return the all products
	 */
	Iterable<Product> getAllProducts();

	/**
	 * Gets the product by id.
	 *
	 * @param id
	 *            the id
	 * @return the product by id
	 */
	Product getProductById(int id);

	Boolean deletetById(int id);

	Product save(int id, String name, double price);

	Product update(int id, String name, double price);
}
