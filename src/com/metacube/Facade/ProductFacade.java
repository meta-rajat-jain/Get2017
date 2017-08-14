package com.metacube.Facade;
/** 
 * @author Rajat Jain
 * @version 1.0
 * @Date 14-August-2017
 * @project shopping cart  via  Design Pattern
 */

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

import com.metacube.DAO.BaseDao;
import com.metacube.DAO.DAOFactory;
import com.metacube.entity.BaseEntity;
import com.metacube.entity.Product;
import com.metacube.entity.UserCart;
import com.metacube.enums.DBType;
import com.metacube.enums.Status;
/**
 * The Class ProductFacade.
 */
public class ProductFacade{

	/** The product map. */
	private Map<String,Product> productMap ;
	
	/** The product. */
	private Product product;
	
	/** The product details. */
	private List<Product> productDetails;

	
	/** The pf. */
	private static ProductFacade pf;
	
	/**
	 * Instantiates a new product facade.
	 */
	private ProductFacade() {
		productMap = new HashMap<>();
		
	}

	/**
	 * Gets the single instance of ProductFacade.
	 *
	 * @return single instance of ProductFacade
	 */
	public static ProductFacade getInstance(){
		
		 if(pf==null){
	       synchronized(ProductFacade.class){
	    	   if(pf==null){
	    		   pf = new ProductFacade();
	    	   }
	       }
		 }
		return pf;
	}
	
	/**
	 * Gets the all product.
	 *
	 * @return the all product
	 */
	public void getAllProduct() {
		
		BaseDao bd = DAOFactory.getInstance(DBType.FileDao);
		productDetails = bd.getAllProduct();
		Iterator<Product> itr = productDetails.iterator();
		while(itr.hasNext()){
			product = itr.next();
			System.out.println(product.toString());
			productMap.put(product.getId(),product);
		}
	
	}
	
	/**
	 * Searchproduct.
	 *
	 * @param id the id
	 * @return the status
	 */
	public Status searchproduct(String id) {
		if(productMap.containsKey(id)){
			return Status.Found;
		}
		return Status.NOT_Found;
		
	}
	
	/**
	 * Gets the product.
	 *
	 * @param id the id
	 * @return the product
	 */
	public Product getProduct(String id){
		return productMap.get(id);
	}
	

}
