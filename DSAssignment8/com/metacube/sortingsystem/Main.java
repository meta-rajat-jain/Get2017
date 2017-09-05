/**
 * @Date 30-August-2017
 * @author Rajat Jain
 * @version 1.0
 * @Project The Main Class
 * .
 */
package com.metacube.sortingsystem;

import com.metacube.validation.Validation;

/**
 * The Class Main.
 */
public class Main {

	/**
	 * The main method.
	 *
	 * @param args
	 *            the arguments
	 */
	public static void main(String[] args) {
		int[] input;
		System.out.println("\n1. Enter number Of Element you want to insert");
		int number = 0;
		number = Validation.integerValidation(number);
		input = new int[number];
		input = Validation.integerArrayValidation(input, number);
		while (true) {
			System.out.println("1. Comparison Sorting");
			System.out.println("2. Linear Sorting");
			System.out.println("3. Exit");
			int choice = 0;
			choice = Validation.choiceValidation(choice);
			switch (choice) {
				case 1 :
					System.out.println(Input.callCompariosnSortingMethod(input,
							number));
					break;
				case 2 :
					System.out.println(Input.callLinearSortingMethod(input,
							number));
					break;
				case 3 :
					System.exit(0);
					break;

			}
		}

	}

}
