/**
 * @author Rajat Jain
 * @version 1.0
 * @Date 28-August-2017
 * @project Employee Sorting
 * 
 */
package com.metacube.employee;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The Class SortingNatural.
 */
public class SortingNatural {

/**
 * The main method.
 *
 * @param args the arguments
 */
public static void main(String[] args) {
	
	EmployeeFunctions emp  =  new EmployeeFunctions();
	Map<Integer, Employee> resultMap;
	List<Employee> list  = new ArrayList<>();
	emp.addEmployee("rajat", "Jaipur");
	emp.addEmployee("Jain", "Jpr");
	emp.addEmployee("Aain", "Jpar");
	emp.addEmployee("Bain", "Japr");
	emp.addEmployee("Brain", "Jpaar");
	resultMap = emp.getEmployeeMap();
	
	Set<Integer> ids = resultMap.keySet();
	for (Integer id : ids) {
		list.add(resultMap.get(id));
		System.out.println(resultMap.get(id).getName());
	}
	Collections.sort(list);
	System.out.println(list.toString());
	
}
}
