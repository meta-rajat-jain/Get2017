package com.metacube.arraylist;
/** 
 * @author Rajat Jain
 * @version 1.0
 * @Date 14-August-2017
 * @project Data Structure  Assignment 1
 */
import static org.junit.Assert.*;

import org.junit.Test;

/**
 * The Class ArrayListTest.
 */
public class  ArrayListTest {


	
	/**
	 * Adds the element at last.
	 */
	@Test
	public void  addElementAtLast() {
		MyArrayList<Integer> arrayList = new MyArrayList<Integer>();	
		arrayList.addElement(4);
		assertEquals(1, arrayList.getElement(4));
	}
	
	/**
	 * Adds the element at pos.
	 */
	@Test
	public void  addElementAtPos() {
		MyArrayList<Integer> arrayList = new MyArrayList<Integer>();	
		arrayList.addElement(4);
		arrayList.addElement(5);
		arrayList.addElement(6);
		arrayList.setElement(2, 7);
		assertEquals(3, arrayList.getElement(7));
		
	}
	
	/**
	 * Gets the element at pos.
	 *
	 * @return the element at pos
	 */
	@Test
	public void  getElementAtPos() {
		MyArrayList<Integer> arrayList = new MyArrayList<Integer>();	
		arrayList.addElement(4);
		arrayList.addElement(5);
		arrayList.addElement(6);
		arrayList.setElement(2, 7);
		assertEquals(3, arrayList.getElement(7));
		
	}
	
	/**
	 * Test size.
	 */
	@Test
	public void testSize(){
		MyArrayList<Integer> obj = new MyArrayList<Integer>();
		obj.addElement(5);
		obj.addElement(6);
		obj.addElement(8);
		assertEquals(3, obj.getSize());
	}
	
	/**
	 * Test size negative.
	 */
	@Test
	public void testSizeNegative(){
		MyArrayList<Integer> obj = new MyArrayList<Integer>();
		obj.addElement(5);
		obj.addElement(6);
		obj.addElement(8);
		assertFalse(4 == obj.getSize());
	}
	
	/**
	 * Test remove element by position.
	 */
	@Test
	public void testRemoveElementByPosition(){
		MyArrayList<Integer> obj = new MyArrayList<Integer>();
		obj.addElement(5);
		obj.addElement(6);
		obj.addElement(8);
		obj.removeElementFromPosition(1);
		assertEquals(-1, obj.getElement(6));
	}
	
	/**
	 * Test remove element by position negative.
	 */
	@Test
	public void testRemoveElementByPositionNegative(){
		MyArrayList<Integer> obj = new MyArrayList<Integer>();
		obj.addElement(5);
		obj.addElement(6);
		obj.addElement(8);
		obj.removeElementFromPosition(1);
		assertFalse(1 == obj.getElement(6));
	}
	
	/**
	 * Test remove element.
	 */
	@Test
	public void testRemoveElement(){
		MyArrayList<Integer> obj = new MyArrayList<Integer>();
		obj.addElement(5);
		obj.addElement(6);
		obj.addElement(8);
		assertEquals(true, obj.removeElement(8));
	}
	
	/**
	 * Test remove element negative.
	 */
	@Test
	public void testRemoveElementNegative(){
		MyArrayList<Integer> obj = new MyArrayList<Integer>();
		obj.addElement(5);
		obj.addElement(6);
		obj.addElement(8);
		assertFalse(false == obj.removeElement(8));
	}
	
	/**
	 * Test clear.
	 */
	@Test
	public void testClear(){
		MyArrayList<Integer> obj = new MyArrayList<Integer>();
		obj.addElement(5);
		obj.addElement(6);
		obj.addElement(8);
		obj.clearArrayList();
		assertEquals(-1, obj.getElement(5));
	}
	
	/**
	 * Test clear negative.
	 */
	@Test
	public void testClearNegative(){
		MyArrayList<Integer> obj = new MyArrayList<Integer>();
		obj.addElement(5);
		obj.addElement(6);
		obj.addElement(8);
		obj.clearArrayList();
		assertFalse(1 == obj.getElement(5));
	}
	
	/**
	 * Test reverse array.
	 */
	@Test
	public void testReverseArray(){
		MyArrayList<Integer> obj = new MyArrayList<Integer>();
		obj.addElement(5);
		obj.addElement(6);
		obj.addElement(8);
		Object expected[] = obj.printArrayList();
		obj.reverseArrayList();
		Object actual[] = obj.printArrayList();
		assertFalse(actual == expected);
	}
}
