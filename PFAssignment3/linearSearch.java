// TODO: Auto-generated Javadoc
/**
 * The Class linearSearch.
 */
public class linearSearch {

	/**
	 * Rec search.
	 *
	 * @param input
	 *            the input array
	 * @param index
	 *            the index
	 * @param arrayLength
	 *            the array length
	 * @param numToBeSearched
	 *            the num to be searched
	 * @return the int i.e index of the number
	 */
	/* Recursive Method to search x in arr[l..r] */
	static int recSearch(int input[], int index, int arrayLength,
			int numToBeSearched) {
		if (arrayLength < index) {
			return -1;
		}
		if (input[index] == numToBeSearched) {
			return index;
		}
		return recSearch(input, index + 1, arrayLength, numToBeSearched);
	}

	/**
	 * The main method.
	 *
	 * @param args
	 *            the arguments
	 */
	public static void main(String args[]) {
		int input[] = { 1, 2, 3, 4, 5 };
		int output = recSearch(input, 0, input.length, 3);
		System.out.print(output + 1);
	}

}
