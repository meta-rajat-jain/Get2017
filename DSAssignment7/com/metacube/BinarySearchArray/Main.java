/**
 * @author Rajat Jain
 * @version 1.0
 * @Date 29-August-2017
 * @project Binary Search
 *
 */
package com.metacube.BinarySearchArray;

import java.util.Arrays;
import java.util.Scanner;

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
		BinarySearch object = new BinarySearch();
		Scanner scanner = new Scanner(System.in);
		int[] input = null;

		while (true) {
			System.out.println("\n1. Insert the number in the Array");
			System.out.println("2. Get the number");
			System.out.println("3. Print the Array");
			System.out.println("4. Exit");
			int choice = 0;
			boolean flag = true;
			while (flag) {

				try {
					choice = Integer.parseInt(scanner.nextLine());
					if ((choice < 1) || (choice > 4)) {
						throw new IllegalArgumentException();
					}
					flag = false;
				} catch (IllegalArgumentException e) {
					System.out.println("Please Enter Correct choice ");
				}
			}

			switch (choice) {
				case 1 :
					System.out
					.println("Enter the number of element you want to insert");
					int number = 0;
					Boolean flag1 = true;
					while (flag1) {
						try {
							number = Integer.parseInt(scanner.nextLine());
							if (String.class.isInstance(number)) {
								throw new IllegalArgumentException();
							}
							flag1 = false;
						} catch (IllegalArgumentException e) {
							System.out
							.println("Please Enter the Correct value ");
						}
					}
					input = new int[number];
					for (int index = 0; index < number; index++) {
						System.out.println("Enter the value");
						int number1 = 0;
						flag1 = true;
						while (flag1) {
							try {
								number1 = Integer.parseInt(scanner.nextLine());
								if (String.class.isInstance(number)) {
									throw new IllegalArgumentException();
								}
								flag1 = false;
							} catch (IllegalArgumentException e) {
								System.out
								.println("Please Enter the Correct value ");
							}
						}
						input[index] = number1;
					}
					break;
				case 2 :
					int value = 0;
					System.out.println("Enter the value");
					flag1 = true;
					while (flag1) {
						try {
							value = Integer.parseInt(scanner.nextLine());
							if (String.class.isInstance(value)) {
								throw new IllegalArgumentException();
							}
							flag1 = false;
						} catch (IllegalArgumentException e) {
							System.out
							.println("Please Enter the Correct value ");
						}
					}
					System.out.println("Object Found At: "
							+ (object.Utility(input, value) + 1));
					break;
				case 3 :
					System.out.println(Arrays.toString(input));
					break;
				case 4 :
					System.exit(0);
			}
		}
	}
}