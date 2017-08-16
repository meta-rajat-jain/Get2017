package com.metacube.UnitTest;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;

import com.metacube.DAO.BaseDao;
import com.metacube.DAO.DAOFactory;
import com.metacube.Facade.ProductFacade;
import com.metacube.controller.CartController;
import com.metacube.controller.ProductController;
import com.metacube.enums.DBType;
import com.metacube.enums.Status;

public class CartControllerTest {

	static ProductFacade productFacade;
	static ProductController productController;
	static CartController cartController;
	static BaseDao dao;
	
	//This method setUpClass will initialize the object
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		productFacade = ProductFacade.getInstance();
		dao = DAOFactory.getInstance(DBType.FileDao);
		productController = new ProductController();
		cartController = new CartController();
		productFacade.getAllProduct();
	}

	/*
	 * Method testAddToCart1
	 * 
	 * This method will test if the id and quantity is right and product is successfully added to cart
	 */
	@Test
	public void testAddToCart1() {
		String id = "1001";
		int quantity = 5;
		Status actual = cartController.addCart(id, quantity);
		Status expected = Status.Added;
		assertEquals(expected, actual);
	}
	
	/*
	 * Method testAddToCart2
	 * 
	 * This method will test if the product is not in product list 
	 */
	@Test
	public void testAddToCart2() {
		String id = "abc";
		int quantity = 5;
		Status actual = cartController.addCart(id, quantity);
		Status expected =  Status.NOT_Found;
		assertEquals(expected, actual);
	}
	
	/*
	 * Method testDelFromCart1
	 * 
	 * This method will test if the id is not in cart
	 */
	
	@Test
	public void testDelFromCart1() {
		String id = "abc";
		int quantity = 5;
		Status actual = cartController.delCart(id, quantity);
		Status expected =  Status.NOT_Found;
		assertEquals(expected, actual);
	}
	
	/*
	 * Method testDelFromCart2
	 * 
	 * This method will test if the id is not in cart
	 */
	@Test
	public void testDelFromCart2() {
		cartController.addCart("1001",3);
		String id = "1001";
		int quantity = 2;
		Status actual = cartController.delCart(id, quantity);
		Status expected =  Status.Success;
		assertEquals(expected, actual);
	}
	
	/*
	 * Method testDelFromCart3
	 * 
	 * This method will test if the quantity is negative
	 */
	
	@Test
	public void testDelFromCart3() {
		String id = "1001";
		int quantity = -2;
		Status actual = cartController.delCart(id, quantity);
		Status expected =  Status.Error_Occured;
		assertEquals(expected, actual);	
	}

}
