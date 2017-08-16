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
import com.metacube.enums.Status;

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
	 * @return 
	 */
	public Status addCart(String id,int quantity){
		Status result = Status.Added;
		if(pf.searchproduct(id)==Status.NOT_Found){
		result = Status.NOT_Found;
		}else{
		if(userDetails.containsKey(id)){
		quantity += userDetails.get(id);
		userDetails.put(id,quantity);
		}else{
		userDetails.put(id,quantity);
		}
		 cart.setOrderDetail(userDetails);
		}
		return result;
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
	 * @return 
	 */
	public Status delCart(String id,int quantity){
		Status result=Status.Success;
		if(!userDetails.containsKey(id)){
		result = Status.NOT_Found;
		}else {
		if(quantity<0){
		/**If quantity becomes less than zero than it's a error**/
		result = Status.Error_Occured;	
		}
		/**Getting the quantity related to item**/
		int updatedQuantity = userDetails.get(id) - quantity;
		if(updatedQuantity<0){
		/**If quantity becomes less than zero than it's a error**/
		result = Status.Error_Occured;	
		}else{	
		userDetails.put(id,updatedQuantity);
		}
		}
		return result;
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
