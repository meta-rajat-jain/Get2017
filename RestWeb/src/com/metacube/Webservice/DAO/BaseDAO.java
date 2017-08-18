/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.metacube.Webservice.DAO;
/** 
 * @author Rajat Jain
 * @version 1.0
 * @Date 18-August-2017
 * @project Employee Managment Through REST
 */


import java.util.List;
import java.util.Map;

import com.metacube.Webservice.Entities.BaseEntity;
import com.metacube.Webservice.Entities.EmpDetail;


/**
 * The Interface BaseDao.
 *
 * @param <T> the generic type
 */
public interface BaseDAO < T extends BaseEntity> {
    
    /**
     * Gets the all product.
     *
     * @param <Product> the generic type
     * @return the all product
     */
    public Map<String, EmpDetail> getAll();
   
   /**
    * Searchproduct.
    *
    * @param <Product> the generic type
    * @param id the id
    * @return the t
    */
   public <Employee> T search(String id);
}
