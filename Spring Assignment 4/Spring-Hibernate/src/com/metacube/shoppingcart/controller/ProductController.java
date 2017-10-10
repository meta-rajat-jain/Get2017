/**
 * @Date 02-October-2017
 * @author Rajat Jain
 * @version 1.0
 * @Project Product implementation using Spring MVC and hibernate
 */
package com.metacube.shoppingcart.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.metacube.shoppingcart.dto.ProductDto;
import com.metacube.shoppingcart.facade.ProductFacade;

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
	 * Gets the products.
	 *
	 * @return the products
	 */
	@RequestMapping(value = "/getAll", method = RequestMethod.GET, produces = "application/json")
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
	@RequestMapping(value = "/getOne/{id}")
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
	@RequestMapping(value = "/delete/{id}")
	public @ResponseBody Boolean deleteById(@PathVariable("id") int id) {
		return productFacade.deleteById(id);
	}
	@RequestMapping(value = "/save", method = RequestMethod.POST)
	public @ResponseBody ProductDto save(@RequestBody ProductDto product) {
		return productFacade.save(product.getId(), product.getName(),
				product.getPrice());
	}

	@RequestMapping(value = "/update", method = RequestMethod.POST)
	public @ResponseBody ProductDto updateById(@RequestBody ProductDto product) {

		return productFacade.update(product.getId(), product.getName(),
				product.getPrice());
	}

}
