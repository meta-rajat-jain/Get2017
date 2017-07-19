/**
 * The Class binarySearch.
 */
public class binarySearch {

	/**
	 * Binry search.
	 *
	 * @param input
	 *            the input array
	 * @param start
	 *            the start
	 * @param end
	 *            the end
	 * @param numToBeSearched
	 *            the num to be searched
	 * @return the int i.e index of the number
	 */
	static int binrySearch(int input[], int start, int end, int numToBeSearched) {
		int mid;
		mid = start + (end - start) / 2;
		if (end < start) {
			return -1;
		}
		if (input[mid] == numToBeSearched) {
			return mid;
		} else if (numToBeSearched < mid) {
			return binrySearch(input, 0, mid - 1, numToBeSearched);
		} else if (numToBeSearched > mid) {
			return binrySearch(input, mid + 1, end, numToBeSearched);
		} else {
			return -1;
		}
	}
}
