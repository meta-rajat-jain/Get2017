/**
 * @author Rajat Jain
 * @version 1.0
 * @Date 28-August-2017
 * @project Unit Test for Number of Unique Elements in a String 
 * 
 */

package com.metacube.test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.metacube.UniqueString.UniqueString;

/**
 * The Class UniqueStringTest.
 */
public class UniqueStringUnitTest {

	/** The string. */
	UniqueString string ;
	
	/**
	 * Sets the up.
	 */
	@Before
	public void setUp(){
		string  = new UniqueString();
		string.getUniqueElements("rajat");
		string.getUniqueElements("jain");
		string.getUniqueElements("raam");
	}
	
	
	/**
	 * Test check in cache positive.
	 */
	@Test
	public void testCheckInCachePositive() {
		String actual = string.getUniqueElements("rajat");
		String expected = "Using result in cache :4";
		assertEquals(expected,actual);
	}
	
	/**
	 * Test check in cache negative.
	 */
	@Test
	public void testCheckInCacheNegative() {
		String actual = string.getUniqueElements("rajat");
		String expected = "Using result in cache :5";
		assertFalse(expected==actual);
	}
	
	/**
	 * Test compute positive.
	 */
	@Test
	public void testComputePositive() {
		String actual = string.getUniqueElements("Vinayak");
		String expected = "Computing result :6";
		assertEquals(expected,actual);
	}
	
	/**
	 * Test compute negative.
	 */
	@Test
	public void testComputeNegative() {
		String actual = string.getUniqueElements("Vinayak");
		String expected = "Computing result :8";
		assertFalse(expected==actual);
	}

}
