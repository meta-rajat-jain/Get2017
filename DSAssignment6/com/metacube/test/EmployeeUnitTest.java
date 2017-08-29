/**
 * @author Rajat Jain
 * @version 1.0
 * @Date 28-August-2017
 * @project Unit Test for Employee Sorting
 * 
 */
package com.metacube.test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.junit.Before;
import org.junit.Test;

import com.metacube.employee.Employee;
import com.metacube.employee.EmployeeFunctions;

/**
 * The Class EmployeeUnitTest.
 */
public class EmployeeUnitTest {
	
	/** The result map. */
	Map<Integer, Employee> resultMap;
	
	/** The list. */
	List<Employee> list  = new ArrayList<>();
	
	/** The emp. */
	EmployeeFunctions emp;
	
	/**
	 * Sets the up.
	 */
	@Before
	public void setUp(){
		emp =  new EmployeeFunctions();
		emp.addEmployee("rajat", "Jaipur");
		emp.addEmployee("Jain", "Jpr");
		emp.addEmployee("Aain", "Jpar");
		emp.addEmployee("Bain", "Japr");
		emp.addEmployee("Brain", "Jpaar");
		resultMap = emp.getEmployeeMap();
	}
	
	/**
	 * Test natural sort.
	 */
	@Test
	public void testNaturalSort(){
		Set<Integer> ids = resultMap.keySet();
		for (Integer id : ids) {
			list.add(resultMap.get(id));
		}
		Collections.sort(list);
		String actual = list.toString();
		String expected = "[Employee [name=Aain, Address=Jpar], Employee [name=Bain, Address=Japr], Employee [name=Brain, Address=Jpaar], Employee [name=Jain, Address=Jpr], Employee [name=rajat, Address=Jaipur]]";		
		assertEquals(expected,actual);
	}

}
