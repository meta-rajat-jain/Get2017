/**
 * @Date 02-October-2017
 * @author Rajat Jain
 * @version 1.0
 * @Project Product implementation using Spring MVC and hibernate
 */
package com.metacube.shoppingcart.spring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.metacube.shoppingcart.dao.product.HibernateProductDao;
import com.metacube.shoppingcart.dao.product.ProductDao;
import com.metacube.shoppingcart.facade.DefaultProductFacade;
import com.metacube.shoppingcart.facade.ProductFacade;
import com.metacube.shoppingcart.service.DefaultProductService;
import com.metacube.shoppingcart.service.ProductService;

/**
 * The Class MyConfiguration.
 */
@Configuration
@ComponentScan("com.metacube.shoppingcart.facade")
public class MyConfiguration {

	/**
	 * Gets the jdbc user dao.
	 *
	 * @return the jdbc user dao
	 */
	@Bean(name = "productDao")
	public ProductDao getJdbcUserDao() {
		HibernateProductDao productDao = new HibernateProductDao();
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