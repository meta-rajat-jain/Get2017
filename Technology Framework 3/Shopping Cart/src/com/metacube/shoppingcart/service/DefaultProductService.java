/**
 * @Date 02-October-2017
 * @author Rajat Jain
 * @version 1.0
 * @Project Shopping Cart implemented through Angular and Spring mvc

 */
package com.metacube.shoppingcart.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.metacube.shoppingcart.dao.product.ProductDao;
import com.metacube.shoppingcart.model.Product;

/**
 * The Class DefaultProductService.
 */
@Component("productService")
public class DefaultProductService implements ProductService {

	/** The product dao. */
	@Autowired
	ProductDao productDao;

	/**
	 * Instantiates a new default product service.
	 */
	public DefaultProductService() {
	}

	/**
	 * Instantiates a new default product service.
	 *
	 * @param productDao
	 *            the product dao
	 */
	public DefaultProductService(ProductDao productDao) {
		this.productDao = productDao;
	}

	/*
	 * @see com.metacube.shoppingcart.service.ProductService#getAllProducts()
	 */
	@Override
	public Iterable<Product> getAllProducts() {
		return productDao.findAll();
	}

	/*
	 * @see com.metacube.shoppingcart.service.ProductService#getProductById(int)
	 */
	@Override
	public Product getProductById(int id) {
		return productDao.findOne(id);
	}

	/*
	 * @see com.metacube.shoppingcart.service.ProductService#deleteById(int)
	 */
	@Override
	public boolean deleteById(int id) {
		return productDao.delete(id);
	}

}
