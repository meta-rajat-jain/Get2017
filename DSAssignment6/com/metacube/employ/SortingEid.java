/**
 * @author Rajat Jain
 * @version 1.0
 * @Date 28-August-2017
 * @project Employee Sorting
 * 
 */
package com.metacube.employ;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

import com.metacube.enums.Status;

/**
 * The Class SortingEid.
 */
public class SortingEid {
	
	/**
	 * The main method.
	 *
	 * @param args the arguments
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		EmployeeFunctions emp  =  new EmployeeFunctions();
		Map<Integer, Employee> resultMap;
		Map<Integer, Employee> resultMap1;
		List<Employee> list  ;
		Status status;
		int eId=0;
		String name =null;
		String address =null;



		while(true){
			Boolean flag = true;
			System.out.println("\n1. Add an employee");
			System.out.println("2. Get employee details");
			System.out.println("3. Sort using id i.e Comaparator");
			System.out.println("4. Sort using name i.e Comaparable");
			System.out.println("4. Exit");
			System.out.println("Enter your choice");
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
			switch (choice) {
			case 1:
				Boolean flag1 = true;	
				System.out.println("Enter the Id");
				while (flag1) {

					try {
						eId = Integer.parseInt(scanner.nextLine());
						status = emp.CheckId(eId);
						if(status == Status.Exists) {
							throw new IllegalArgumentException();
						}
						flag1 = false;
					} catch (IllegalArgumentException e) {
						System.out.println("Please Enter Unique ID");
					}
				}
				System.out.println("Enter the Name");
				name = scanner.nextLine();
				System.out.println("Enter the address");
				address = scanner.nextLine();
				emp.addEmployee(eId, name, address);
				break;
			case 2:
				System.out.println("Enter user Id of employee");
				eId = scanner.nextInt();
				status = emp.CheckId(eId);
				if (status == Status.Exists) {
					Employee temp = emp.getDetail(eId);
					System.out.println("\nId : " + temp.getEId() + "\tName : "
							+ temp.getName() + "\tAddress : "
							+ temp.getAddress());
				} else {
					System.out.println("Id entered is invalid !!");
				}
				break;
			case 3:
				list  = new ArrayList<>();
				resultMap = emp.getEmployeeMap();
				Set<Integer> ids = resultMap.keySet();
				for (Integer id : ids) {
					list.add(resultMap.get(id));
				}
				Collections.sort(list,new EmployeeComparator());
				int y = list.size();
				for(Employee x : list){
					if(y!=1){
					System.out.print(x.getEId() + " " + x.getName() + ",");
					y--;
					}
					else{
						System.out.print(x.getEId() + " " + x.getName() );
					}
				}
				break;
			case 4:
				list  = new ArrayList<>();
				resultMap1 = emp.getEmployeeMap();
				Set<Integer> ids1 = resultMap1.keySet();
				for (Integer id : ids1) {
					list.add(resultMap1.get(id));
				}
				Collections.sort(list);
				int y1 = list.size();
				for(Employee x : list){
					if(y1!=1){
					System.out.print(x.getEId() + " " + x.getName() + ",");
					y1--;
					}
					else{
						System.out.print(x.getEId() + " " + x.getName() );
					}
				}
				break;
			case 5:
				System.exit(0);
			}

		}

	}
}
