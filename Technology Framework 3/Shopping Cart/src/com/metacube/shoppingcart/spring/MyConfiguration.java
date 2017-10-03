/**
 * @Date 02-October-2017
 * @author Rajat Jain
 * @version 1.0
 * @Project Shopping Cart implemented through Angular and Spring mvc

 */
package com.metacube.shoppingcart.spring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.metacube.shoppingcart.dao.product.JdbcProductDao;
import com.metacube.shoppingcart.dao.product.ProductDao;
import com.metacube.shoppingcart.facade.DefaultProductFacade;
import com.metacube.shoppingcart.facade.ProductFacade;
import com.metacube.shoppingcart.service.DefaultProductService;
import com.metacube.shoppingcart.service.ProductService;

/**
 * The Class MyConfiguration.
 */
@Configuration
public class MyConfiguration {

	/**
	 * Gets the jdbc user dao.
	 *
	 * @return the jdbc user dao
	 */
	@Bean(name = "productDao")
	public ProductDao getJdbcUserDao() {
		JdbcProductDao productDao = new JdbcProductDao();
		return productDao;
	}

	/**
	 * Gets the default user service.
	 *
	 * @return the default user service
	 */
	@Bean(name = "productService")
	public ProductService getDefaultUserService() {
		DefaultProductService productService = new DefaultProductService(
				getJdbcUserDao());

		return productService;
	}

	/**
	 * Gets the default product fascade.
	 *
	 * @return the default product fascade
	 */
	@Bean(name = "productFacade")
	public ProductFacade getDefaultProductFascade() {
		DefaultProductFacade productFacade = new DefaultProductFacade();

		return productFacade;
	}
}