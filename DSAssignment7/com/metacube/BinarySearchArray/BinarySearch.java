/**
 * @author Rajat Jain
 * @version 1.0
 * @Date 29-August-2017
 * @project Binary Search
 *
 */
package com.metacube.BinarySearchArray;

import java.util.Arrays;

/**
 * The Class BinarySearch.
 */
public class BinarySearch {

	/**
	 * Utility.
	 *
	 * @param array
	 *            the array
	 * @param value
	 *            the value
	 * @return the int
	 */
	public int Utility(int array[], int value) {
		Arrays.sort(array);
		int max = array.length - 1;
		int min = 0;
		return binarySearch(array, min, max, value);
	}

	/**
	 * Binary search.
	 *
	 * @param array
	 *            the array
	 * @param min
	 *            the min
	 * @param max
	 *            the max
	 * @param value
	 *            the value
	 * @return the int
	 */
	private int binarySearch(int array[], int min, int max, int value) {
		if (max >= min) {
			int mid = min + ((max - min) / 2);

			if (array[mid] == value) {
				if ((mid != 0) && (array[mid - 1] == value)) {
					return binarySearch(array, min, mid - 1, value);
				} else {
					return (mid);
				}

			}
			if (array[mid] > value) {
				return binarySearch(array, min, mid - 1, value);
			} else {
				return binarySearch(array, mid + 1, max, value);
			}
		}
		return -1;
	}
}
