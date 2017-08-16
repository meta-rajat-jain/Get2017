package com.metacube.view;

/** 
 * @author Rajat Jain
 * @version 1.0
 * @Date 14-August-2017
 * @project shopping cart  via  Design Pattern
 */

import java.util.Scanner;
import com.metacube.controller.CartController;
import com.metacube.controller.ProductController;
import com.metacube.enums.Status;

/**
 * The Class DisplayInput.
 */
public class DisplayInput {	
	
	/** The ProductController's object. */
	ProductController pc = new ProductController();
	
	/** The CartController's object. */
	CartController cc = new CartController();

/** The scanner class object. */
Scanner scan = new Scanner(System.in);
	
	/**
	 * Display menu.
	 */
	public static void displayMenu(){
		System.out.println("Press 1 to see products");
		System.out.println("Press 2 to buy products");
		System.out.println("Press 3 to see cart");
		System.out.println("Press 4 to generate Bill");
		System.out.println("Press 5 to delete item in your cart");
		System.out.println("Press 6 to exit");
	}
	
	
	/**
	 * Prints the all products.
	 */
	public void printAllProducts(){
		pc.printProduct();
	}
	
	/**
	 * Gets the input.
	 *
	 * @return the input
	 */
	public void getInput(){
		boolean flag = true;
		
		System.out.println("Enter number of products you want to add to your cart :");
		int num = Integer.parseInt(scan.nextLine());
		
		//Taking user from user
		for(int index=0;index<num;index++){
		System.out.println("Enter code of product you want to add to your cart :");
		String code = scan.nextLine();
		while(flag){
		if(pc.searchProduct(code)==Status.Found){
			flag = false;
		}else{
			System.out.println("Please Enter The valid Code");
			code = scan.nextLine();
		 }
		}
		int quantity = 0;
		flag = true;
		System.out.println("Enter quantity of this product :");
		while(flag){
		 
		 try{
			 quantity = Integer.parseInt(scan.nextLine());
			 if(quantity<0){
				 throw new IllegalArgumentException();
			 }
			 flag = false;
		 }catch(IllegalArgumentException e){
			 System.out.println("Please Enter vaild  quantity");
		 }
		}
		cc.addCart(code, quantity);
		}
		
	}
	
	/**
	 * Prints the cart.
	 */
	public void printCart(){
		System.out.println("\n########################");
		System.out.println("YOUR CART");
		System.out.println("########################");
		System.out.println("Items in your cart is: ");
		cc.printCart();
	}
	
	/**
	 * Generate bill.
	 */
	public void generateBill(){
		System.out.println("\n########################");
		System.out.println("YOUR ORDER'S DETAIL");
		System.out.println("########################");
		printCart();
		System.out.println("\n########################");
		System.out.println("TOTAL BILL");
		System.out.println("########################");
		System.out.println("Your Total Bill is : " + cc.printBill());
		System.out.println("########################");
	}
	
	/**
	 * Delete item.
	 */
	public void deleteItem(){
		System.out.println("Enter the code of the product and its quantity");
		String code = scan.nextLine();
		int quantity = Integer.parseInt(scan.nextLine());
		cc.delCart(code, quantity);
	}
	
}
