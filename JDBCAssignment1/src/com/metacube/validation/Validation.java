/**
 * @author Rajat Jain
 * @version 1.0
 * @Date 12-September-2017
 * @project Library Information System via Design Pattern
 */
package com.metacube.validation;
import java.util.Scanner;
/**
 * The Class Validation.
 */
public class Validation {
	/** The scanner. */
	static Scanner scanner = new Scanner(System.in);
	/**
	 * Integer validation.
	 *
	 * @param number
	 *            the number
	 * @return the int
	 */
	static public int integerValidation(int number) {
		boolean flag = true;
		while (flag) {
			try {
				number = Integer.parseInt(scanner.nextLine());
				if (String.class.isInstance(number) || (number < 0)) {
					throw new IllegalArgumentException();
				}
				flag = false;
			} catch (IllegalArgumentException e) {
				System.out.println("Please Enter Correct choice ");
			}
		}
		return number;
	}
	/**
	 * Integer array validation.
	 *
	 * @param input
	 *            the input
	 * @param number
	 *            the number
	 * @return the int[]
	 */
	static public int[] integerArrayValidation(int[] input, int number) {
		for (int index = 0; index < number; index++) {
			System.out.println("Enter the value");
			int number1 = 0;
			Boolean flag1 = true;
			while (flag1) {
				try {
					number1 = Integer.parseInt(scanner.nextLine());
					if (String.class.isInstance(number)) {
						throw new IllegalArgumentException();
					}
					flag1 = false;
				} catch (IllegalArgumentException e) {
					System.out.println("Please Enter the Correct value ");
				}
			}
			input[index] = number1;
		}
		return input;
	}
	/**
	 * Choice validation.
	 *
	 * @param choice
	 *            the choice
	 * @return the int
	 */
	static public int choiceValidation(int choice) {
		boolean flag2 = true;
		while (flag2) {
			try {
				choice = Integer.parseInt(scanner.nextLine());
				if ((choice < 1) || (choice > 4)) {
					throw new IllegalArgumentException();
				}
				flag2 = false;
			} catch (IllegalArgumentException e) {
				System.out.println("Please Enter Correct choice ");
			}
		}
		return choice;
	}
}
