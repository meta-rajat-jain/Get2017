/**
 * @Date 30-August-2017
 * @author Rajat Jain
 * @version 1.0
 * @Project The Class Radix sort.
 */
package com.metacube.sortingsystem;
import java.util.ArrayList;
import java.util.List;
/**
 * The Class RadixSort.
 */
public class RadixSort {
	/**
	 * Radix Sort.
	 *
	 * @param input
	 *            the input
	 * @return the int[]
	 */
	public int[] radixsort(int[] input) throws Exception {
		List<Integer>[] buckets = new ArrayList[10];
		for (int i = 0; i < buckets.length; i++) {
			buckets[i] = new ArrayList<Integer>();
		}
		// sort
		boolean flag = false;
		int temp = -1, divisor = 1;
		while (!flag) {
			flag = true;
			// split input between lists
			for (Integer i : input) {
				temp = i / divisor;
				buckets[temp % 10].add(i);
				if (flag && (temp > 0)) {
					flag = false;
				}
			}
			// empty lists into input array
			int a = 0;
			for (int b = 0; b < 10; b++) {
				for (Integer i : buckets[b]) {
					input[a++] = i;
				}
				buckets[b].clear();
			}
			// move to next digit
			divisor *= 10;
		}
		return input;
	}
}
