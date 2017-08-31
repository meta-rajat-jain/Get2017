/**
 * @Date 30-August-2017
 * @author Rajat Jain
 * @version 1.0
 * @Project The Class Counting sort.
 */
package com.metacube.sortingsystem;
/**
 * The Class CountingSort.
 */
public class CountingSort {
	/**
	 * Sort.
	 * @param input the input
	 * @return the int[]
	 */
	public int[] sort(int[] input) {
		int max = input[0];
		for (int i = 1; i < input.length; i++) {
			if (input[i] > max) {
				max = input[i];
			}
		}
		int[] numArray = new int[max + 1];
		for (int element : input) {
			numArray[element]++;
		}
		int count = 0, i = 0;
		int[] result = new int[input.length];
		for (int index = 0; index < numArray.length; index++) {
			count = numArray[index];
			for (int jindex = 0; jindex < count; jindex++) {
				result[i] = index;
				i++;
			}
		}
		return result;
	}
}
