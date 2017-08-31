/**
 * @Date 30-August-2017
 * @author Rajat Jain
 * @version 1.0
 * @Project The Input Class.
 */
package com.metacube.sortingsystem;
import java.util.Arrays;
/**
 * The Class Input.
 */
public class Input {
	/**
	 * Appropriate comparison sorting method.
	 * @param input the input array
	 * @param number the number
	 * @return the string
	 */
	static public String callCompariosnSortingMethod(int[] input, int number) {
		int[] result = null;
		if (number < 10) {
			BubbleSort objectBS = new BubbleSort();
			result = objectBS.addNumber(input);
			return "Sort used is: Bubble Sort and the Sorted Array is :"
					+ Arrays.toString(result);
		} else {
			QuickSort objectQS = new QuickSort();
			int start = 0;
			int end = input.length - 1;
			result = objectQS.sort(input, start, end);
			return "Sort used is: Quick Sort and the Sorted Array is :"
					+ Arrays.toString(result);
		}
	}
	/**
	 * Appropriate linear sorting method.
	 * @param input the input array
	 * @param number the number
	 * @return the string
	 */
	static public String callLinearSortingMethod(int[] input, int number) {
		int[] result = null;
		boolean isCheck = false;
		for (int element : input) {
			if ((element >= 100) || (element < (-100))) {
				isCheck = true;
				break;
			}
		}
		if (isCheck) {
			RadixSort objectRS = new RadixSort();
			try {
				result = objectRS.radixsort(input);
				return "Sort used is: Radix Sort and the Sorted Array is :"
						+ Arrays.toString(result);
			} catch (Exception e) {
				System.out.println("Error in Computation");
			}
			return "Input Array is:" + Arrays.toString(input);
		} else {
			NegativeCountingSort objectCS = new NegativeCountingSort();
			result = objectCS.sort(input);
			return "Sort used is: Counting Sort and the Sorted Array is :"
					+ Arrays.toString(result);
		}
	}
}
