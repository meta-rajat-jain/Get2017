// TODO: Auto-generated Javadoc
/**
 * @Date 17-July-2017
 * @author Rajat Jain
 * @version 1.0 The Class Quicksort.
 */
public class Quicksort {

	/**
	 * Sort.
	 *
	 * @param input
	 *            the input
	 * @param start
	 *            the start
	 * @param end
	 *            the end
	 */
	static int[] sort(int input[], int start, int end)
			throws IllegalArgumentException {
		if (input.length == 0) {
			throw new IllegalArgumentException();
		}

		/*
		 * pi is partitioning index, input[pi] is now at right place
		 */

		if (start < end) {
			int pi = partition(input, start, end);
			// Recursively sort elements before
			// partition and after partition
			sort(input, start, pi - 1);
			sort(input, pi + 1, end);
		}
		return input;
	}

	/**
	 * Partition.
	 *
	 * @param input
	 *            the input
	 * @param start
	 *            the start
	 * @param end
	 *            the end
	 * @return the int
	 */
	/*
	 * This function takes last element as pivot, places the pivot element at
	 * its correct position in sorted array, and places all smaller (smaller
	 * than pivot) to left of pivot and all greater elements to right of pivot
	 */
	static int partition(int input[], int start, int end) {
		int pivot = input[end];
		int i = (start - 1); // index of smaller element
		for (int j = start; j < end; j++) {
			// If current element is smaller than or equal to pivot
			if (input[j] <= pivot) {
				i++;
				// swap input[i] and input[j]
				int temp = input[i];
				input[i] = input[j];
				input[j] = temp;
			}
		}

		// swap input[i+1] and input[end] (or pivot)
		int temp = input[i + 1];
		input[i + 1] = input[end];
		input[end] = temp;

		return i + 1;
	}

}
