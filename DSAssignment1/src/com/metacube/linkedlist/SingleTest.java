package com.metacube.linkedlist;
/** 
 * @author Rajat Jain
 * @version 1.0
 * @Date 14-August-2017
 * @project Data Structure  Assignment 1
 */
import static org.junit.Assert.*;

import java.util.Scanner;

import org.junit.BeforeClass;
import org.junit.Test;

/**
 * The Class SingleTest.
 */
public class SingleTest {

	/** The linked list. */
	static SinglyLinkedList<Integer> linkedList;
	
	/**
	 * Sets the up class.
	 */
	@BeforeClass
	public static void  setUpClass(){
		linkedList = new SinglyLinkedList<Integer>();
	}

	/**
	 * Adds the element at last.
	 */
	@Test
	public void  addElementAtLast() {
	   
		linkedList.addNode(12);
		int expected  = linkedList.getElementFromPosition(0);
		assertEquals(12,expected);
	}
	
	/**
	 * Adds the element at pos.
	 */
	@Test
	public void  addElementAtPos() {
		
		linkedList.addNode(12);
		linkedList.addNode(24);
		linkedList.addNode(36);
		linkedList.addNodeAtLocation(2, 30);
		System.out.println(linkedList.addNodeAtLocation(2, 30));
		boolean expected  = linkedList.addNodeAtLocation(2, 30);
		assertTrue( linkedList.addNodeAtLocation(2, 30));
		//assertEquals(true , expected);
	}
	
	/**
	 * Removes the element at pos.
	 */
	@Test
	public void  removeElementAtPos() {
		
		linkedList.addNode(12);
		linkedList.addNode(24);
		linkedList.addNode(36);
		boolean expected = linkedList.removeItem(24);
		System.out.println(expected);
		assertEquals(true , expected);
	}
	
	/**
	 * Removes the element by pos.
	 */
	@Test
	public void  removeElementByPos() {
		
		linkedList.addNode(12);
		linkedList.addNode(24);
		linkedList.addNode(36);
		boolean expected = linkedList.removeItemFromPosition(2);
		System.out.println(expected);
		assertEquals(true , expected);
	}
	
	/**
	 * Gets the element by pos.
	 *
	 * @return the element by pos
	 */
	@Test
	public void  getElementByPos() {
		linkedList.addNode(12);
		linkedList.addNode(24);
		linkedList.addNode(36);
		int expected = linkedList.getElementFromPosition(1);
		assertEquals(12 , expected);
	}
	
	/**
	 * Gets the size.
	 *
	 * @return the size
	 */
	@Test
	public void  getSize() {
		linkedList.addNode(12);
		linkedList.addNode(24);
		linkedList.addNode(36);
		int expected = linkedList.getSize() - 1;
		assertEquals(3 , expected);
	}
	
	/**
	 * Gets the sort.
	 *
	 * @return the sort
	 */
	@Test
	public void  getSort() {
	 SinglyLinkedList<Integer> SortedList  = new SinglyLinkedList<Integer>();
	 SinglyLinkedList<Integer> linkeList  = new SinglyLinkedList<Integer>();
		linkeList.addNode(12);
		linkeList.addNode(38);
		linkeList.addNode(24);
		linkeList.sort();
		    Integer[] arry = new Integer[linkeList.getSize()];
			for (int i =0; i < linkeList.getSize(); i++){
	            arry[i] = linkeList.getElementFromPosition(i);
		 	System.out.println("arry" + arry[i]);
			}
		
		
		
		SortedList.addNode(12);
	    SortedList.addNode(24);
	    SortedList.addNode(38); 
	    Integer[] array = new Integer[SortedList.getSize()];
		for (int i =0; i < SortedList.getSize(); i++){
            array[i] = SortedList.getElementFromPosition(i); 
		System.out.println("array" + array[i]);
		}
		assertArrayEquals(array ,arry);
	}
	
	/**
	 * Gets the reverse.
	 *
	 * @return the reverse
	 */
	@Test
	public void  getReverse() {
	SinglyLinkedList<Integer> reverseList = new SinglyLinkedList<Integer>();
	SinglyLinkedList<Integer> linkList = new SinglyLinkedList<Integer>();
		linkList.addNode(12);
		linkList.addNode(24);
		linkList.addNode(38);
		 
		reverseList.addNode(38);
	    reverseList.addNode(24);
	    reverseList.addNode(12);
	    
	    linkList.reverseLinkedList();
	    Integer[] arry = new Integer[linkList.getSize()];
		for (int i =0; i < linkList.getSize(); i++){
            arry[i] = linkList.getElementFromPosition(i);
	 	}
	    
	    Integer[] array = new Integer[reverseList.getSize()];
		for (int i =0; i < reverseList.getSize(); i++){
            array[i] = reverseList.getElementFromPosition(i); 
		}
		assertArrayEquals(array ,arry);
	}
	
}
