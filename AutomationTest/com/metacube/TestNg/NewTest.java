/**
 * @Date 09-October-2017
 * @author Rajat Jain
 * @version 1.0
 * @Project Selenium implementation using FireFox,Chrome and IEDriver
 */
package com.metacube.TestNg;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

/**
 * The Class NewTest.
 */
public class NewTest {

	/**
	 * F 2.
	 */
	@AfterTest
	public void f2() {
		System.out.println("In After Test");
	}

	/**
	 * F.
	 */
	@BeforeTest
	public void f() {
		System.out.println("In Before Test");
	}

	/**
	 * F 1.
	 */
	@Test
	public void f1() {
		System.out.println("In test");
	}
}
