/**
 * @author Rajat Jain
 * @version 1.0
 * @Date 28-August-2017
 * @project Employee Sorting
 * 
 */
package com.metacube.employ;

import java.util.HashMap;
import java.util.Map;

import com.metacube.enums.Status;

/**
 * The Class EmployeeFunctions.
 */
public class EmployeeFunctions {
	
	/** The employee map. */
	Map<Integer,Employee> employeeMap = new HashMap<>();
	
	/** The employee. */
	Employee employee ;
	
	/**
	 * Check id.
	 *
	 * @param eId the e id
	 * @return the status
	 */
	public Status CheckId(int eId){
		if(employeeMap.containsKey(eId)){
			return Status.Exists;
		}
		else{
			return Status.Success;
		}
	}
	
	/**
	 * Adds the employee.
	 *
	 * @param eId the e id
	 * @param name the name
	 * @param address the address
	 * @return the status
	 */
	public Status addEmployee(Integer eId,String name,String address){
		employee = new Employee();
		employee.setEId(eId);
		employee.setName(name);
		employee.setAddress(address);
		employeeMap.put(employee.getEId(), employee);
		return Status.Added;
	}
	
	/**
	 * Gets the detail.
	 *
	 * @param eid the eid
	 * @return the detail
	 */
	public Employee getDetail(int eid){
		
		if(employeeMap.containsKey(eid)){
			return employeeMap.get(eid);
		}
		else{
		return null;
		}
		
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
