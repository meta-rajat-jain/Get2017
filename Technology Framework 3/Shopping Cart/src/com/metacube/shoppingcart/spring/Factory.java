/**
 * @Date 02-October-2017
 * @author Rajat Jain
 * @version 1.0
 * @Project Shopping Cart implemented through Angular and Spring mvc

 */
package com.metacube.shoppingcart.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * The Class Factory.
 *
 */
public class Factory {

	/** The application context. */
	static ApplicationContext applicationContext;

	static {
		applicationContext = new AnnotationConfigApplicationContext(
				MyConfiguration.class);;
	}

	/**
	 * Gets the application context.
	 *
	 * @return the application context
	 */
	static public ApplicationContext getApplicationContext() {
		return applicationContext;
	}
}
