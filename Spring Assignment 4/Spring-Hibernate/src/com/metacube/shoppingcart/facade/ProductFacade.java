/**
 * @Date 02-October-2017
 * @author Rajat Jain
 * @version 1.0
 * @Project Product implementation using Spring MVC and hibernate
 */
package com.metacube.shoppingcart.facade;

import com.metacube.shoppingcart.dto.ProductDto;

/**
 * The Interface ProductFacade.
 */
public interface ProductFacade {

	/**
	 * Gets the all products.
	 *
	 * @return the all products
	 */
	Iterable<ProductDto> getAllProducts();

	/**
	 * Gets the product by id.
	 *
	 * @param id
	 *            the id
	 * @return the product by id
	 */
	ProductDto getProductById(int id);

	Boolean deleteById(int id);

	ProductDto save(int id, String name, double price);

	ProductDto update(int id, String name, double price);
}
