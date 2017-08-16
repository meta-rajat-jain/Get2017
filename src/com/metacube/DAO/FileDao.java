/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.metacube.DAO;
/** 
 * @author Rajat Jain
 * @version 1.0
 * @Date 14-August-2017
 * @project shopping cart  via  Design Pattern
 */
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

import com.metacube.entity.BaseEntity;
import com.metacube.entity.Product;
import com.metacube.helper.FileHelper;
/**
 * The Class FileDao.
 */
public class FileDao implements BaseDao{

	/** The file. */
	private File file;
	
	/** The products. */
	private List<Product> products;
	
	/**
	 * Instantiates a new file dao.
	 */
	public FileDao() {
	
		file= new FileHelper("products.txt").getFile();
	}
	
	
	


	/* (non-Javadoc)
	 * @see com.metacube.DAO.BaseDao#getAllProduct()
	 */
	@Override
	public List<Product> getAllProduct() {
		try{
			products = new ArrayList<Product>();
			FileInputStream  fstream = new FileInputStream(file);
			BufferedReader sc= new BufferedReader(new InputStreamReader(fstream));
			String[] itemDetail;
			Product product;
			String line;
			while((line = sc.readLine())!=null){
				itemDetail = line.split(",");
				product = new Product();
				product.setId(itemDetail[0]);
				product.setName(itemDetail[1]);
				product.setPrice(Double.parseDouble(itemDetail[2]));
				products.add(product);
			 }
			sc.close();
			}catch(NumberFormatException | IOException e ){
				System.out.println(e.getMessage());
			}
			
			return products;
	}





	/* (non-Javadoc)
	 * @see com.metacube.DAO.BaseDao#searchproduct(java.lang.String)
	 */
	@Override
	public BaseEntity searchproduct(String id) {
		// TODO Auto-generated method stub
		return null;
	}




	
	
}
