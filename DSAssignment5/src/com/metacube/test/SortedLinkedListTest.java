/**
 * @author Rajat Jain
 * @version 1.0
 * @Date 26-August-2017
 * @project Add in Sorted Linked List
 * 
 */
package com.metacube.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

import org.junit.Before;
import org.junit.Test;

import com.metacube.sortedlinkedlist.addInSorted;


/**
 * The Class SortedLinkedListTest.
 */
public class SortedLinkedListTest {
	
	/** The ss. */
	addInSorted ss;
	
	/**
	 * Sets the up.
	 */
	@Before
	public  void setUp(){
		ss = new addInSorted();
	}
	
	/**
	 * Test sorting postive.
	 */
	@Test
	public void testSortingPostive() {
		ss.addNumber(12);
		ss.addNumber(6);
		ss.addNumber(8);
		ss.addNumber(16);
		ss.addNumber(3);
		String expected = ss.getResult().toString();
		String actual = "[3, 6, 8, 12, 16]";
		assertEquals(actual,expected);
	} 
	
	/**
	 * Test sorting negative.
	 */
	@Test
	public void testSortingNegative() {
		ss.addNumber(12);
		ss.addNumber(6);
		ss.addNumber(8);
		ss.addNumber(16);
		ss.addNumber(3);
		String expected = ss.getResult().toString();
		String actual = "[3, 8, 6, 12, 16]";
		assertFalse(expected == actual);
	} 
	
	/**
	 * Test sorting postive 2.
	 */
	@Test
	public void testSortingPostive2() {
		ss.addNumber(12);
		ss.addNumber(24);
		ss.addNumber(1);
		ss.addNumber(2);
		ss.addNumber(30);
		String expected = ss.getResult().toString();
		String actual = "[1, 2, 12, 24, 30]";
		assertEquals(actual,expected);
	} 
	
	/**
	 * Test sorting negative 2.
	 */
	@Test
	public void testSortingNegative2() {
		ss.addNumber(12);
		ss.addNumber(24);
		ss.addNumber(1);
		ss.addNumber(2);
		ss.addNumber(30);
		String expected = ss.getResult().toString();
		String actual = "[1, 12, 2, 24, 30]";
		assertFalse(expected == actual);
	}
	@Test
	public void testSortingWithNegativeNumberPoistive() {
		ss.addNumber(12);
		ss.addNumber(0);
		ss.addNumber(-1);
		ss.addNumber(-2);
		ss.addNumber(30);
		String expected = ss.getResult().toString();
		String actual = "[-2, -1, 0, 12, 30]";
		assertEquals(actual,expected);
	}
	
	/**
	 * Test sorting with negative number negative.
	 */
	@Test
	public void testSortingWithNegativeNumberNegative() {
		ss.addNumber(12);
		ss.addNumber(0);
		ss.addNumber(-1);
		ss.addNumber(-2);
		ss.addNumber(30);
		String expected = ss.getResult().toString();
		String actual = "[0, -1, 2, 12, 30]";
		assertFalse(expected == actual);
	}
}
