package com.metacube.Webservice.filewriter;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Map;
import java.util.Set;

import org.codehaus.jackson.map.ObjectMapper;

import com.metacube.Webservice.Entities.EmpDetail;
// TODO: Auto-generated Javadoc
/** 
 * @author Rajat Jain
 * @version 1.0
 * @Date 18-August-2017
 * @project Employee Managment Through REST
 */

public class WriteToFile { 
	
	/** The employee. */
	private static EmpDetail employee;
	
	/**
	 * Write file.
	 *
	 * @param employeeDetail the employee detail
	 */
	public static void writeFile(Map<String,EmpDetail> employeeDetail){
		try (
				FileWriter fw = new FileWriter("C:\\Users\\User8\\workspace\\RestWeb\\Employees.JSON",false);
				BufferedWriter bw = new BufferedWriter(fw);
				PrintWriter out = new PrintWriter(bw))
				{
			ObjectMapper mapper = new ObjectMapper();
			Set<String> s = employeeDetail.keySet();
			for(String temp : s)
			{
			employee = employeeDetail.get(temp);
			String jsonInString = mapper.writeValueAsString(employee);
			out.println(jsonInString);
			}
			}catch (IOException e) {
			e.printStackTrace();

			}
			}
	
	/**
	 * Write file.
	 *
	 * @param employee the employee
	 */
	public static void writeFile(EmpDetail employee ){
		try(
				FileWriter fw = new FileWriter("C:\\Users\\User8\\workspace\\RestWeb\\Employees.JSON",true);
				BufferedWriter bw = new BufferedWriter(fw);
				PrintWriter out = new PrintWriter(bw)){
				ObjectMapper mapper = new ObjectMapper();
				String jsonInString = mapper.writeValueAsString(employee);
				out.println(jsonInString);
				}catch(Exception e){

				}

				}


}