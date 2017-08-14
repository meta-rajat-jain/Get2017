package com.metacube.controller;
/** 
 * @author Rajat Jain
 * @version 1.0
 * @Date 14-August-2017
 * @project shopping cart  via  Design Pattern
 */

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import com.metacube.Facade.ProductFacade;
import com.metacube.entity.Product;
import com.metacube.entity.UserCart;

/**
 * The Class CartController.
 */
public class CartController {
	
	/** The product. */
	private Product product;
	
	/** The cart. */
	private UserCart cart;
	
	/** The user details. */
	private Map<String,Integer> userDetails;
	
	/** The pf. */
	ProductFacade pf=ProductFacade.getInstance();
	
	/**
	 * Instantiates a new cart controller.
	 */
	public CartController(){
		userDetails = new HashMap<>();
		cart = new UserCart();
	}
	
	/**
	 * Adds the cart.
	 *
	 * @param id the id
	 * @param quantity the quantity
	 */
	public void addCart(String id,int quantity){
		userDetails.put(id,quantity);
		cart.setOrderDetail(userDetails);
	}
	
	/**
	 * Prints the cart.
	 */
	public void printCart(){
		Set<String> keySet = userDetails.keySet();
		System.out.println("Product Name \t  Product Price \t Quantity");
		for(String id : keySet){
			product = pf.getProduct(id);
			System.out.println(product.getName() + "\t " + product.getPrice() + "\t \t" +userDetails.get(id));
		}
	}
	
	/**
	 * Del cart.
	 *
	 * @param id the id
	 * @param quantity the quantity
	 */
	public void delCart(String id,int quantity){
		int updatedQuantity = userDetails.get(id) - quantity;
		if(updatedQuantity<=0){
		  userDetails.remove(id);	
		}else{
		 userDetails.put(id,updatedQuantity);
		}
	}
	
	/**
	 * Prints the bill.
	 *
	 * @return the double
	 */
	public double printBill(){
		Set<String> keySet = userDetails.keySet();
		Double totalPrice = 0.00;
		for(String id : keySet){
			product = pf.getProduct(id);
			totalPrice += (product.getPrice() * userDetails.get(id));
		}
		return totalPrice;
	}
}
