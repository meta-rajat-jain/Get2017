/**
 * @Date 09-October-2017
 * @author Rajat Jain
 * @version 1.0
 * @Project Selenium implementation using FireFox,Chrome and IEDriver
 */
package com.metacube.TestNg;

import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * The Class HardAssertions.
 */
public class HardAssertions {
	
	/**
	 * Test 1.
	 */
	@Test
	public void test1() {
		try {
			Assert.assertTrue(2 < 1);
			System.out.println("Assertion Failed in Test 1");
			Assert.assertFalse(1 > 0);
			System.out.println("Assertion Failed in Test 1");
			Assert.assertEquals("Sample", "Sample");
			System.out.println("Assertion Passed in Test 1");
		} catch (AssertionError ae) {
			ae.printStackTrace();
		}
	}

	/**
	 * Test 2.
	 */
	@Test
	public void test2() {
		try {
			Assert.assertTrue(2 > 1);
			System.out.println("Assertion passed in Test 2");
			Assert.assertFalse(1 < 0);
			System.out.println("Assertion passed in Test 2");
			Assert.assertEquals("Sample", "Sample");
			System.out.println("Assertion Passed in Test 2");
		} catch (AssertionError ae) {
			ae.printStackTrace();
		}
	}
}