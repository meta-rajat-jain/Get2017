public class Assignment1 {
	private static final String WHITESPACE = " ";

	/**
	 * This method draws the number of spaces required
	 */
	public static String spaces(int n, int row) {
		/*
		 * length of spaces vary according to : y = |x-n| we multiply it by 2 to
		 * accommodate for extra space after each number
		 */
		int len = Math.abs((row + 1) - n) * 2;// *2 1 for number and space
		StringBuilder spaceString = new StringBuilder();
		for (int i = 0; i < len; i++) {
			spaceString.append(WHITESPACE);
		}
		return spaceString.toString();
	}
	/**
	 * This method draws the number required
	 */

	public static String number(int n, int row) {
		/*
		 * determine the maximum value in the row using function for values
		 * varying as : y = -|x-n|+n
		 */
		int k = -1 * Math.abs((row + 1) - n) + n;
		/*
		 * for row value of 0 (since i is intilizised with 0 Math.abs function
		 * will return (0+1)-5 = 4*-1= -4+5 = 1;{here n=5 hence row=11} this is
		 * the maximum value for row index 0 or row 1st; Reason for using abs is
		 * no other loop is needed to be created for printing lower half. Eg:for
		 * n=3 rows = 2*3-1=5;for row index 3rd or row 4th k= -1*abs((3+1)-3) +
		 * 3 = -1 + 3 = 2;which is same as for row 2nd or row with index 1st.
		 */
		StringBuilder numString = new StringBuilder();
		for (int i = 1; i <= 2 * k - 1; i++) {
			numString.append(k - Math.abs(i - k)).append(" ");// to print the
																// desired
																// number
			// for k=3 number appended will be 1 2 3 2 1
		}
		return numString.toString();
	}

	/**
	 * This method draws a pyramid pattern using number. You can replace the
	 * number with any other character to draw a pyramid of that.
	 */
	public static String[] pyramid(int n) {
		/*
		 * Calculates the number of Rows
		 */
		int rowCount = 2 * n - 1;
		String pyramidString[] = new String[rowCount];
		for (int i = 0; i < rowCount; i++) {
			pyramidString[i] = spaces(n, i) + number(n, i) + spaces(n, i);
		}
		return pyramidString;
	}

	
}