package com.metacube.Webservice.facade;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

import com.metacube.Webservice.DAO.EmployeeDAO;
import com.metacube.Webservice.Entities.EmpDetail;
import com.metacube.Webservice.filewriter.WriteToFile;
// TODO: Auto-generated Javadoc
/** 
 * @author Rajat Jain
 * @version 1.0
 * @Date 18-August-2017
 * @project Employee Managment Through REST
 */

public class EmployeeFacade {


	/** The ef. */
	private static EmployeeFacade ef;
	
	/** The employee list. */
	private List<EmpDetail> employeeList = new ArrayList<EmpDetail>();
	
	/** The employee. */
	private EmpDetail employee;
	
	/** The employee map. */
	private Map<String,EmpDetail> employeeMap = new HashMap<>(); 
	
	/** The base. */
	private EmployeeDAO base = new EmployeeDAO();

	/**
	 * Instantiates a new employee facade.
	 */
	private EmployeeFacade(){
		employeeMap = base.getAll();
	}
	
	/**
	 * Gets the single instance of EmployeeFacade.
	 *
	 * @return single instance of EmployeeFacade
	 */
	public static EmployeeFacade getInstance(){
			if(ef==null){
			synchronized(EmployeeFacade.class){
				if(ef==null){
					ef = new EmployeeFacade();
				}
			}
		}
		return ef;
	}
	
	/**
	 * Gets the all employee.
	 *
	 * @return the all employee
	 */
	public List<EmpDetail> getAllEmployee() {
		Set<String> ids = employeeMap.keySet();
		for(String id :ids){
			employee = employeeMap.get(id);
			employeeList.add(employee);
			System.out.println(employee.getEmpName() + "," + employee.getEmpNo() + "," + employee.getPosition());
		}
		return employeeList;
	}
	
	/**
	 * Write into file.
	 *
	 * @param employee the employee
	 */
	public void writeIntoFile(EmpDetail employee){
		WriteToFile.writeFile(employee);
	}
	
	/**
	 * Write into file.
	 */
	public void writeIntoFile(){
		WriteToFile.writeFile(employeeMap);
	}
	 
 	/**
 	 * Adds the employee.
 	 *
 	 * @param employee the employee
 	 */
 	public  void addEmployee(EmpDetail employee ) {
	        employeeMap.put(employee.getEmpNo(), employee);
	        writeIntoFile(employee);
	       }
	 
	    /**
    	 * Gets the employee.
    	 *
    	 * @param empNo the emp no
    	 * @return the employee
    	 */
    	public  EmpDetail getEmployee(String empNo) {
	    	
	        return employeeMap.get(empNo);
	    }
	    
    	/**
    	 * Delete employee.
    	 *
    	 * @param empNo the emp no
    	 */
    	public  void deleteEmployee(String empNo) {
	    	employeeMap.remove(empNo);
	    	writeIntoFile();
	    }

}