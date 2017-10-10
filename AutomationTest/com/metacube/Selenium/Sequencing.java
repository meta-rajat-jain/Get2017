/**
 * @Date 09-October-2017
 * @author Rajat Jain
 * @version 1.0
 * @Project Selenium implementation using FireFox,Chrome and IEDriver
 */
package com.metacube.Selenium;

//import junit.framework.Assert;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

/**
 * The Class Sequencing.
 */
public class Sequencing {

	/**
	 * Test case 1.
	 */
	@Test
	public void testCase1() {
		System.out.println("This is the Test Case 1");
	}

	/**
	 * Test case 2.
	 */
	@Test
	public void testCase2() {
		System.out.println("This is the Test Case 2");
	}

	/**
	 * Before method.
	 */
	@BeforeMethod
	public void beforeMethod() {
		System.out.println("This will execute before every Method");
	}

	/**
	 * After method.
	 */
	@AfterMethod
	public void afterMethod() {
		System.out.println("This will execute after every Method");
	}

	/**
	 * Before class.
	 */
	@BeforeClass
	public void beforeClass() {
		System.out.println("This will execute before the Class");
	}

	/**
	 * After class.
	 */
	@AfterClass
	public void afterClass() {
		System.out.println("This will execute after the Class");
	}

	/**
	 * Before test.
	 */
	@BeforeTest
	public void beforeTest() {
		System.out.println("This will execute before the Test");
	}

	/**
	 * After test.
	 */
	@AfterTest
	public void afterTest() {
		System.out.println("This will execute after the Test");
	}

	/**
	 * Before suite.
	 */
	@BeforeSuite
	public void beforeSuite() {
		System.out.println("This will execute before the Test Suite");
	}

	/**
	 * After suite.
	 */
	@AfterSuite
	public void afterSuite() {
		System.out.println("This will execute after the Test Suite");
	}
}