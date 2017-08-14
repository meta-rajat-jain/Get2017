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
import com.metacube.entity.BaseEntity;
import java.util.List;


/**
 * The Interface BaseDao.
 *
 * @param <T> the generic type
 */
public interface BaseDao<T extends BaseEntity> {
    
    /**
     * Gets the all product.
     *
     * @param <Product> the generic type
     * @return the all product
     */
    public <Product> List<T> getAllProduct();
   
   /**
    * Searchproduct.
    *
    * @param <Product> the generic type
    * @param id the id
    * @return the t
    */
   public <Product> T searchproduct(String id);
}
