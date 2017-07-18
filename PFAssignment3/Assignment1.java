// TODO: Auto-generated Javadoc
/**
 * The Class Assignment1.
 */
public class Assignment1 {

	/**
	 * Rem.
	 *
	 * @param x
	 *            the number
	 * @param y
	 *            the divisor
	 * @return the int i.e the reminder
	 */
	static int rem(int x, int y) throws IllegalArgumentException {
		if (y == 0) {
			throw new IllegalArgumentException();
		}
		if (x < y)
			return x;
		else
			return rem(x - y, y);
	}

	/**
	 * Gcd.
	 *
	 * @param a
	 *            the first number
	 * @param b
	 *            the second number
	 * @return the int i.e the gcd
	 */
	static int gcd(int a, int b) {

		if (a < b) {
			return gcd(b, a);
		}
		if (b == 0)
			return a;
		else
			return gcd(b, a % b);

	}

	/**
	 * Largest digit.
	 *
	 * @param num
	 *            the number
	 * @return the int i.e the largest digit
	 */
	static int largestDigit(int num) {
		if (num > 0)
			return Math.max(num % 10, largestDigit(num / 10));
		else
			return num;
	}

	/**
	 * The main method.
	 *
	 * @param args
	 *            the arguments
	 */
	public static void main(String[] args) {
		System.out.println(largestDigit(173672));
		System.out.println(gcd(2, 1));
		System.out.println(rem(100, 3));
	}
}
