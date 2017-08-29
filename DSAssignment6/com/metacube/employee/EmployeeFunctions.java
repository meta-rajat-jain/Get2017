/**
 * @author Rajat Jain
 * @version 1.0
 * @Date 28-August-2017
 * @project Employee Sorting
 * 
 */
package com.metacube.employee;

import java.util.HashMap;
import java.util.Map;

/**
 * The Class EmployeeFunctions.
 */
public class EmployeeFunctions {
	
	/** The employee map. */
	Map<Integer,Employee> employeeMap = new HashMap<>();
	
	/** The employee. */
	Employee employee ;
	
	/**
	 * Adds the employee.
	 *
	 * @param name the name
	 * @param address the address
	 */
	public void addEmployee(String name,String address){
		employee = new Employee();
		employee.setEId();
		employee.setName(name);
		employee.setAddress(address);
		employeeMap.put(employee.getEId(), employee);
	}
	
	/**
	 * Gets the employee map.
	 *
	 * @return the employee map
	 */
	public Map<Integer, Employee> getEmployeeMap() {
		return employeeMap;
	}
	
	/**
	 * Sets the employee map.
	 *
	 * @param employeeMap the employee map
	 */
	public void setEmployeeMap(Map<Integer, Employee> employeeMap) {
		this.employeeMap = employeeMap;
	}

}
