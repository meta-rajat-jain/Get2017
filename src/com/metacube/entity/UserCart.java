/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.metacube.entity;
/** 
 * @author Rajat Jain
 * @version 1.0
 * @Date 14-August-2017
 * @project shopping cart  via  Design Pattern
 */
import java.util.ArrayList;
import java.util.Map;
/**
 * The Class UserCart.
 */
public class UserCart implements BaseEntity{
	
	/** The id. */
	private int id;
	
	/** The order detail. */
	private Map<String,Integer> orderDetail;

	/**
	 * Gets the id.
	 *
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * Gets the order detail.
	 *
	 * @return the order detail
	 */
	public Map<String,Integer> getOrderDetail() {
		return orderDetail;
	}

	/**
	 * Sets the order detail.
	 *
	 * @param orderDetail the order detail
	 */
	public void setOrderDetail(Map<String,Integer> orderDetail) {
		this.orderDetail = orderDetail;
	}

	/**
	 * Sets the id.
	 *
	 * @param id the new id
	 */
	public void setId(int id) {
		this.id = id;
	}
	
	
	
	
	
}
