/**
 * @author Rajat Jain
 * @version 1.0
 * @Date 28-August-2017
 * @project Employee Sorting
 * 
 */
package com.metacube.test;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.junit.Before;
import org.junit.Test;

import com.metacube.employ.Employee;
import com.metacube.employ.EmployeeComparator;
import com.metacube.employ.EmployeeFunctions;
import com.metacube.enums.Status;



/**
 * The Class EmployUnitTest.
 */
public class EmployUnitTest {
	
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
		emp.addEmployee(1,"rajat", "Jaipur");
		emp.addEmployee(4,"Jain", "Jpr");
		emp.addEmployee(5,"Aain", "Jpar");
		emp.addEmployee(2,"Bain", "Japr");
		emp.addEmployee(3,"Brain", "Jpaar");
		resultMap = emp.getEmployeeMap();
	}
	
	/**
	 * Test check id exists.
	 */
	@Test
	public void testCheckIdExists(){
		
		Status expected = emp.CheckId(3);
		Status actual = Status.Exists;
		assertEquals(expected,actual);
	}
	
	/**
	 * Test check id unique.
	 */
	@Test
	public void testCheckIdUnique(){
		
		Status expected = emp.CheckId(10);
		Status actual = Status.Success;
		assertEquals(expected,actual);
	}
	
	/**
	 * Test natural sort.
	 */
	@Test
	public void testNaturalSort(){
		String actual = "";
		Set<Integer> ids = resultMap.keySet();
		for (Integer id : ids) {
			list.add(resultMap.get(id));
		}
		Collections.sort(list,new EmployeeComparator());
		for(Employee x : list){
			actual += x.getEId() + " " + x.getName() + ",";
		
		}
		
		String expected = "1 rajat,2 bain,3 brain,4 jain,5 aain,";		
		assertEquals(expected,actual);
	}

}
