public class Assignment2 {
	private static final String WHITESPACE = " ";

	/**
	 * This method draws the number of spaces required
	 */
	public static String spaces(int n, int row) {
		StringBuilder spaceString = new StringBuilder();
		for (int i = 0; i < row; i++) {
			spaceString.append(WHITESPACE).append(" ");
		}
		return spaceString.toString();
	}

	/**
	 * This method draws the number
	 */
	public static String number(int n, int row) {
		StringBuilder numString = new StringBuilder();
		for (int i = 1; i <= n - row; i++) {
			numString.append(i).append(" ");// to print number
		}
		return numString.toString();
	}

	/**
	 * This method draws a pyramid pattern using number. You can replace the
	 * number with any other character to draw a pyramid of that.
	 */
	public static String[] pyramid(int n) {
		String pyramidString[] = new String[n];
		for (int i = 0; i < n; i++) {
			pyramidString[i] = spaces(n, i) + number(n, i);
		}
		return pyramidString;
	}

	
}