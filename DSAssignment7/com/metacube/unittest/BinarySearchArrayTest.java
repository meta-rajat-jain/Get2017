/**
 * @author Rajat Jain
 * @version 1.0
 * @Date 29-August-2017
 * @project Binary Search
 *
 */
package com.metacube.unittest;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

import org.junit.Before;
import org.junit.Test;

import com.metacube.BinarySearchArray.BinarySearch;

/**
 * The Class BinarySearchArrayTest.
 */
public class BinarySearchArrayTest {

	/** The array. */
	int[] array;

	/** The object. */
	BinarySearch object;

	/**
	 * Sets the up.
	 */
	@Before
	public void setUp() {
		object = new BinarySearch();
		array = new int[]{5, 2, 2, 5, 10, 55, 77};
	}

	/**
	 * Binary search test 1.
	 */
	@Test
	public void BinarySearchTest1() {

		int element = 88;
		int locationOfElement = object.Utility(array, element);
		assertEquals(-1, locationOfElement);
	}

	/**
	 * Binary search test 2.
	 */
	@Test
	public void BinarySearchTest2() {

		int element = 5;
		int locationOfElement = object.Utility(array, element);
		assertEquals(2, locationOfElement);
	}

	/**
	 * Binary search test 3.
	 */
	@Test
	public void BinarySearchTest3() {

		int element = -4;
		int locationOfElement = object.Utility(array, element);
		assertEquals(-1, locationOfElement);
	}

	/**
	 * Binary search test 4.
	 */
	@Test
	public void BinarySearchTest4() {

		int element = 88;
		int locationOfElement = object.Utility(array, element);
		assertFalse(locationOfElement == 0);
	}

	/**
	 * Binary search test 5.
	 */
	@Test
	public void BinarySearchTest5() {

		int element = 77;
		int locationOfElement = object.Utility(array, element);
		assertFalse(locationOfElement == 4);
	}

}
