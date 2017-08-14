/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.metacube.controller;
/** 
 * @author Rajat Jain
 * @version 1.0
 * @Date 14-August-2017
 * @project shopping cart  via  Design Pattern
 */
import com.metacube.Facade.ProductFacade;
import com.metacube.enums.Status;


/**
 * The Class ProductController.
 *
 */

public class ProductController {
	
	
	/** The pf. */
	ProductFacade pf;
	
	
	/**
	 * Instantiates a new product controller.
	 */
	public ProductController() {
		pf = ProductFacade.getInstance();
	}


	/**
	 * Search product.
	 *
	 * @param id the id
	 * @return the status
	 */
	public Status searchProduct(String id){
		return pf.searchproduct(id);
	}
	
	
	/**
	 * Prints the product.
	 */
	public void printProduct(){
			pf.getAllProduct();
			
	}
	
	
		
}


