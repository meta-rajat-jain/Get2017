/**
 * @Date 30-August-2017
 * @author Rajat Jain
 * @version 1.0
 * @Project The Negative Counting sort class.
 */
package com.metacube.sortingsystem;
/**
 * The Class CountingSort.
 */
public class NegativeCountingSort {
	/**
	 * Sort.
	 * @param input the input
	 * @return the int[]
	 */
	public int[] sort(int[] input) {
		int max = (Math.abs(input[0]));
		for (int i = 1; i < input.length; i++) {
			if ((Math.abs(input[i])) > max) {
				max = (Math.abs(input[i]));
			}
		}
		int[] numArray = new int[max + 1];
		int[] negativeNumArray = new int[max + 1];
		for (int element : input) {
			if (element > 0) {
				numArray[element]++;
			} else {
				negativeNumArray[Math.abs(element)]++;
			}
		}
		int count = 0, i = 0;
		int[] result = new int[input.length];
		for (int index = negativeNumArray.length - 1; index >= 0; index--) {
			count = negativeNumArray[index];
			for (int jindex = 0; jindex < count; jindex++) {
				result[i] = (index * -1);
				i++;
			}
		}
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
