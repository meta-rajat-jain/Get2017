/**
 * @author Rajat Jain
 * @version 1.0
 * @Date 12-September-2017
 * @project Library Information System via Design Pattern
 */
package com.metacube.view;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

import com.metacube.entity.Titles;
import com.metacube.facade.Operations;
import com.metacube.validation.Validation;

/**
 * The Class main.
 */
public class main {

	/**
	 * The main method.
	 *
	 * @param args
	 *            the arguments
	 * @throws SQLException
	 * @throws ClassNotFoundException
	 */
	public static void main(String[] args) throws ClassNotFoundException,
			SQLException {
		List<Titles> resultList;
		Operations operationObject = Operations.getInstance();
		Scanner scanner = new Scanner(System.in);
		ResultSet resultSet;
		while (true) {
			System.out.println("\n1. Get all books by authors's name");
			System.out
					.println("2. Check if book has been issued based on book's name");
			System.out
					.println("3. Delete all boooks not issued in last 1 year");
			System.out.println("4. Exit");
			System.out.println("Enter your choice");
			int choice = 0;
			choice = Validation.choiceValidation(choice);
			try {
				switch (choice) {
					case 1 :
						System.out.println("Enter the author name");
						String name = scanner.nextLine();
						resultList = operationObject.getBooksPublished(name);
						if (resultList.isEmpty()) {
							System.out
									.println("This Author has no books in library !!");
						} else {
							for (Titles t : resultList) {
								System.out.println(t.toString());
							}
						}
						break;
					case 2 :
						String bookName = scanner.nextLine();
						int result = operationObject
								.checkAvailability(bookName);
						if (result == 0) {
							System.out.println("BOOK NOT PRESENT IN LIBRARY");
						} else if (result == 1) {
							System.out.println("BOOK CAN BE ISSUED");
						} else {
							System.out.println("BOOK CANNOT BE ISSUED");
						}

						break;
					case 3 :
						resultSet = operationObject.deleteBooks();
						System.out
						.println("THE FOLLOWING BOOK WILL BE DELETED");
						while (resultSet.next()) {
							System.out.println("Accession_no "
									+ resultSet.getString("accession_no")
									+ " Title Name "
									+ resultSet.getString("title_nm")
									+ " Number of days "
									+ resultSet.getString("NoOfDays"));
						}
						break;
					case 4 :
						scanner.close();
						System.exit(0);
				}
			} catch (Exception e) {
				System.out.println("Error " + e.getMessage() + e.getCause());
			}
		}

	}
}
