/**
 * @author Rajat Jain
 * @version 1.0
 * @Date 28-August-2017
 * @project Number of Unique Elements in a String 
 * 
 */
package com.metacube.UniqueString;

import java.util.Scanner;

/**
 * The Class Main.
 */
public class Main {
	
	/**
	 * The main method.
	 *
	 * @param args the arguments
	 */
	public static void main(String[] args) {
		String result = "";
		Scanner scanner = new Scanner(System.in);
		UniqueString object = new UniqueString();
		while(true) {
		
			System.out.println("\n1. Input the String");
			System.out.println("2. Exit");
			Boolean flag=true;
			int choice = 0;
			while (flag) {

				try {
					choice = Integer.parseInt(scanner.nextLine());
					if(choice < 1 || choice > 4) {
						throw new IllegalArgumentException();
					}
					flag = false;
				} catch (IllegalArgumentException e) {
					System.out.println("Please Enter Correct choice ");
				}
			}
		switch(choice) {
		case 1:
			System.out.println("Enter The String");
			String input = scanner.nextLine();
			result = object.getUniqueElements(input);
		System.out.println(result);
		break;
		case 2:
		System.exit(0);
		break;
		
		}
		}
		}

}
