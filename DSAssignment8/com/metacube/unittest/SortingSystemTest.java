/**
 * @Date 30-August-2017
 * @author Rajat Jain
 * @version 1.0
 * @Project The Sorting System Test.
 */
package com.metacube.unittest;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.metacube.sortingsystem.Input;
/**
 * The Class SortingSystemTest.
 */
public class SortingSystemTest {
	/**
	 * Bubble and counting sort test.
	 */
	@Test
	public void bubbleAndCountingSortTest() {
		int[] input = {1, 2, 3, 4, 3, 2, 1};
		int number = input.length;
		String actuals = Input.callCompariosnSortingMethod(input, number);
		String expecteds = "Sort used is: Bubble Sort and the Sorted Array is :[1, 1, 2, 2, 3, 3, 4]";
		assertEquals(expecteds, actuals);
		String actual = Input.callLinearSortingMethod(input, number);
		String expected = "Sort used is: Counting Sort and the Sorted Array is :[1, 1, 2, 2, 3, 3, 4]";
		assertEquals(expected, actual);
	}
	/**
	 * Bubble and radix sort test.
	 */
	@Test
	public void bubbleAndRadixSortTest() {
		int[] input = {101, 202, 3, 4, 3, 2, 1};
		int number = input.length;
		String actuals = Input.callCompariosnSortingMethod(input, number);
		String expecteds = "Sort used is: Bubble Sort and the Sorted Array is :[1, 2, 3, 3, 4, 101, 202]";
		assertEquals(expecteds, actuals);
		String actual = Input.callLinearSortingMethod(input, number);
		String expected = "Sort used is: Radix Sort and the Sorted Array is :[1, 2, 3, 3, 4, 101, 202]";
		assertEquals(expected, actual);
	}
	/**
	 * Quick and radix sort test.
	 */
	@Test
	public void quickAndRadixSortTest() {
		int[] input = {101, 202, 3, 4, 3, 2, 1, 56, 66, 100, 200};
		int number = input.length;
		String actuals = Input.callCompariosnSortingMethod(input, number);
		String expecteds = "Sort used is: Quick Sort and the Sorted Array is :[1, 2, 3, 3, 4, 56, 66, 100, 101, 200, 202]";
		assertEquals(expecteds, actuals);
		String actual = Input.callLinearSortingMethod(input, number);
		String expected = "Sort used is: Radix Sort and the Sorted Array is :[1, 2, 3, 3, 4, 56, 66, 100, 101, 200, 202]";
		assertEquals(expected, actual);
	}
	/**
	 * Quick and counting sort test.
	 */
	@Test
	public void quickAndCountingSortTest() {
		int[] input = {1, 20, 3, 4, 3, 2, 1, 56, 66, 1, 20};
		int number = input.length;
		String actuals = Input.callCompariosnSortingMethod(input, number);
		String expecteds = "Sort used is: Quick Sort and the Sorted Array is :[1, 1, 1, 2, 3, 3, 4, 20, 20, 56, 66]";
		assertEquals(expecteds, actuals);
		String actual = Input.callLinearSortingMethod(input, number);
		String expected = "Sort used is: Counting Sort and the Sorted Array is :[1, 1, 1, 2, 3, 3, 4, 20, 20, 56, 66]";
		assertEquals(expected, actual);
	}
	/**
	 * Quick and negative counting sort test.
	 */
	@Test
	public void quickAndNegativeCountingSortTest() {
		int[] input = {-1, 20, 3, 4, 3, 2, -1, 56, 66, 1, 20};
		int number = input.length;
		String actuals = Input.callCompariosnSortingMethod(input, number);
		String expecteds = "Sort used is: Quick Sort and the Sorted Array is :[-1, -1, 1, 2, 3, 3, 4, 20, 20, 56, 66]";
		assertEquals(expecteds, actuals);
		String actual = Input.callLinearSortingMethod(input, number);
		String expected = "Sort used is: Counting Sort and the Sorted Array is :[-1, -1, 1, 2, 3, 3, 4, 20, 20, 56, 66]";
		assertEquals(expected, actual);
	}
}
