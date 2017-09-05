/**
 * @Date 30-August-2017
 * @author Rajat Jain
 * @version 1.0
 * @Project The Class Bubble sort.
 */
package com.metacube.sortingsystem;
/**
 * The Class BubbleSort.
 */
public class BubbleSort {
	/**
	 * Adds the number.
	 * @param data the data
	 * @return the int[]
	 */
	public int[] addNumber(int[] data) {
		int noOfElements = data.length;
		try {
			return sort(data, noOfElements);
		} catch (Exception e) {
			System.out.println("Error Caught " + e.getMessage());
		}
		return data;
	}
	/**
	 * Sort.
	 * @param data the data
	 * @param noOfElements the no of elements
	 * @return the int[]
	 * @throws Exception the exception
	 */
	private int[] sort(int[] data, int noOfElements) throws Exception {
		if (noOfElements == 1) {
			return data;
		}
		for (int i = 0; i < (noOfElements - 1); i++) {
			if (data[i] > data[i + 1]) {
				// swap data[i], data[i+1]
				int temp = data[i];
				data[i] = data[i + 1];
				data[i + 1] = temp;
			}
		}
		sort(data, noOfElements - 1);
		return data;
	}
}
