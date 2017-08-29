/** 
 * @author Rajat Jain
 * @version 1.0
 * @Date 22-August-2017
 * @project Binary Tree Traversal
 */
package com.metacube.postorder;

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
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		BinaryTreePostOrder bt = new BinaryTreePostOrder();
	while (true) {
			boolean flag = true;
			int choice = 0;
			System.out.println("\nBinary Tree Operations\n");
			System.out.println("1. Insert element in the Binary Tree ");
			System.out.println("2. PostOrder");
			System.out.println("3. Check empty");
			System.out.println("4. Exit");

			while (flag) {

				try {
					choice = Integer.parseInt(scan.next());
					if (choice < 1 || choice > 4) {
						throw new IllegalArgumentException();
					}
					flag = false;
				} catch (IllegalArgumentException e) {
					System.out.println("Please Enter vaild  Choice");
				}
			}
			switch (choice) {
			case 1:
				System.out.println("Enter integer element to insert");
				bt.insert(scan.nextInt());
				break;
			case 2:
				System.out.print("\nPost order : ");
				String result = bt.postorder();
				System.out.println(result);
				break;
			case 3:
				System.out.println("Empty status = " + bt.isEmpty());
				break;
			case 4:
				System.exit(0);
			default:
				System.out.println("Please enter the correct Value");
			}

		}
	}
}
