/**
 * @Date 02-October-2017
 * @author Rajat Jain
 * @version 1.0
 * @Project Shopping Cart implemented through Angular and Spring mvc

 */
package com.metacube.shoppingcart.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.metacube.shoppingcart.dto.ProductDto;
import com.metacube.shoppingcart.facade.ProductFacade;
import com.metacube.shoppingcart.spring.Factory;

/**
 * The Class ProductController.
 */
@CrossOrigin
@Controller
@RequestMapping("/product")
public class ProductController {

	/** The product facade. */
	@Autowired
	ProductFacade productFacade;

	/**
	 * Instantiates a new product controller.
	 */
	public ProductController() {
		productFacade = Factory.getApplicationContext().getBean(
				"productFacade", ProductFacade.class);
	}

	/**
	 * Gets the products.
	 *
	 * @return the products
	 */
	@RequestMapping(value = "/list", method = RequestMethod.GET)
	public @ResponseBody Iterable<ProductDto> getProducts() {
		return productFacade.getAllProducts();
	}

	/**
	 * Gets the by id.
	 *
	 * @param id
	 *            the id
	 * @return the by id
	 */
	@RequestMapping(value = "/getId/{id}")
	public @ResponseBody ProductDto getById(@PathVariable("id") int id) {
		return productFacade.getProductById(id);
	}

	/**
	 * Delete by id.
	 *
	 * @param id
	 *            the id
	 * @return the product dto
	 */
	@RequestMapping(value = "/delById/{id}")
	public @ResponseBody ProductDto deleteById(@PathVariable("id") int id) {
		return productFacade.getProductById(id);
	}
}
