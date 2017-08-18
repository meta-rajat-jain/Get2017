package com.metacube.Webservice.DAO;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import com.metacube.Webservice.Entities.BaseEntity;
import com.metacube.Webservice.Entities.EmpDetail;
// TODO: Auto-generated Javadoc
/** 
 * @author Rajat Jain
 * @version 1.0
 * @Date 18-August-2017
 * @project Employee Managment Through REST
 */

public class EmployeeDAO implements BaseDAO{

	/** The emp map. */
	private static Map<String, EmpDetail> empMap = new HashMap<String, EmpDetail>();
	
	/** The employee list. */
	private static List<EmpDetail> employeeList = new ArrayList<>();
	
	/** The file. */
	private File file;
	
	/** The employee. */
	private EmpDetail employee;
	



	/* (non-Javadoc)
	 * @see com.metacube.Webservice.DAO.BaseDAO#getAll()
	 */
	@Override
	public Map<String, EmpDetail> getAll() {
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(new File ("C:\\Users\\User8\\workspace\\RestWeb\\Employees.txt"))));
			JSONParser parser = new JSONParser();
			String line;
			 
	           while ((line = br.readLine()) != null) {
	               /**
	                * splicing the detail using , as a delimiter*
	                */
	               JSONObject js = (JSONObject)parser.parse(line);
	               employee = new EmpDetail();
	               employee.setEmpName((String)js.get("empName"));
	               employee.setEmpNo((String)js.get("empNo"));
	               employee.setPosition((String)js.get("position"));
	               empMap.put(employee.getEmpNo(), employee);
	           }
			/*while((line = br.readLine())!=null){
				System.out.println("Here it is");
				String sar[] = line.split(",");
				emp = new EmpDetail();
				emp.setEmpName(sar[1]);
				emp.setEmpNo(sar[0]);
				emp.setPosition(sar[2]);
				empMap.put(sar[0],emp);
				employeeList.add(emp);
			}*/
			System.out.println(employeeList.toString());
		}catch (FileNotFoundException e) {
			
			e.printStackTrace();
		} catch (IOException e) {
			
			e.printStackTrace();
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return empMap;
	}
	
	/* (non-Javadoc)
	 * @see com.metacube.Webservice.DAO.BaseDAO#search(java.lang.String)
	 */
	@Override
	public BaseEntity search(String id) {
		// TODO Auto-generated method stub
		return null;
	}


}





