/**
 * @Date 09-October-2017
 * @author Rajat Jain
 * @version 1.0
 * @Project Selenium implementation using FireFox,Chrome and IEDriver
 */
package com.metacube.TestNg;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

/**
 * The Class SoftAssertions.
 */
public class SoftAssertions {
	
	/**
	 * Test 1.
	 */
	@Test
	public void test1() {
		SoftAssert sa = new SoftAssert();
		sa.assertTrue(2 < 1);
		System.out.println("Assertion Failed");
		sa.assertFalse(1 < 2);
		System.out.println("Assertion Failed");
		sa.assertEquals("Sample", "Sample");
		System.out.println("Assertion Failed");
		sa.assertAll();
	}
}
