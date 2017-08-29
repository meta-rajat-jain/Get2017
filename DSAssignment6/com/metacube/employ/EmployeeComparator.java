/**
 * @author Rajat Jain
 * @version 1.0
 * @Date 28-August-2017
 * @project Employee Sorting
 * 
 */
package com.metacube.employ;

import java.util.Comparator;

/**
 * The Class EmployeeComparator.
 */
public class EmployeeComparator implements Comparator {
	
	/* (non-Javadoc)
	 * @see java.util.Comparator#compare(java.lang.Object, java.lang.Object)
	 */
	@Override
	public int compare(Object arg0, Object arg1) {
	    Employee e1 = (Employee) arg0;
	    Employee e2 = (Employee) arg1;
		return (e1.getEId() -  (e2.getEId()));
	}
}
