/*
 * 
 */
package com.metacube.stacks;

/** 
 * @author Rajat Jain
 * @version 1.0
 * @Date 22-August-2017
 * @project Stack
 */
import java.util.Scanner;

/**
 * The Class Main.
 */
public class Main {

	/**
	 * The main method.
	 *
	 * @param <E>
	 *            the element type
	 * @param args
	 *            the arguments
	 */
	@SuppressWarnings({ "resource", "unchecked" })
	public static <E> void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		StackClass<E> linkedList = new StackClass<E>();

		System.out.println("Stack Operation\n");
		int choice = 0;

		boolean flag;
		while (true) {
			System.out.println("\n1. Add item to push");
			System.out.println("2. Pop ");
			System.out.println("3. Peek ");
			System.out.println("4. Infix to Postfix ");
			System.out.println("5. Exit ");
			System.out.println("Enter your choice");
			flag = true;
			while (flag) {
				try {
					choice = Integer.parseInt(scanner.next());
					if (choice > 5 || choice < 1) {
						throw new Exception();
					}
					flag = false;
				} catch (Exception e) {
					System.out.println("Enter a valid choice" + e);
				}
			}
			switch (choice) {
			case 1:
				System.out.println("Enter element you want to add");
				E element = (E) scanner.next();
				linkedList.push(element);
				break;
			case 2:
				System.out
						.println("Element you poped is : " + linkedList.pop());
				break;
			case 3:
				System.out.println("Element you peeked is : "
						+ linkedList.peek());
				break;
			case 4:
				System.out.println("Enter the input String");
				String input = scanner.next();
				System.out.println("The expression in Postfix form is :"
						+ linkedList.convertInfixToPostfix(input));
				break;

			case 5:
				System.exit(0);
			}
		}
	}
}
