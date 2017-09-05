/**
 * @Date 30-August-2017
 * @author Rajat Jain
 * @version 1.0
 * @Project The Main class.
 */
package com.metacube.BinarySearchTree;
import java.util.Arrays;
import java.util.Scanner;

import com.metacube.validation.Validation;
/**
 * The Class Main.
 */
public class Main {
	/**
	 * The main method.
	 * @param args * the arguments
	 */
	public static void main(String[] args) {
		BuildBST tree = new BuildBST();
		Scanner scanner = new Scanner(System.in);
		System.out.println("\n1. Enter number Of Students you want to insert");
		int number = 0;
		number = Validation.integerValidation(number);
		for (int index = 0; index < number; index++) {
			System.out.println("Enter the roll number of the Student");
			int number1 = 0;
			Boolean flag1 = true;
			while (flag1) {
				try {
					number1 = Integer.parseInt(scanner.nextLine());
					if (String.class.isInstance(number) || (number1 < 0)) {
						throw new IllegalArgumentException();
					}
					flag1 = false;
				} catch (IllegalArgumentException e) {
					System.out
							.println("Please Enter the Correct value in the number format ");
				}
			}
			tree.insert(number1);
		}
		int[] result = tree.buildArray();
		System.out.println("Students entered with roll number are : "
				+ Arrays.toString(result));
	}
}
