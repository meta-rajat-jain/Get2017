package com.metacube.Webservice.EmpWebService;
/** 
 * @author Rajat Jain
 * @version 1.0
 * @Date 18-August-2017
 * @project Employee Managment Through REST
 */

import java.util.Arrays;
import java.util.List;

import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.metacube.Webservice.Entities.EmpDetail;
import com.metacube.Webservice.facade.EmployeeFacade;
 

 
// TODO: Auto-generated Javadoc
/**
 * The Class EmployeeService.
 */
@Path("/employees")
public class EmployeeService {
	
	
	
	
	/**
	 * Say hello.
	 *
	 * @return the string
	 */
	@GET
	@Path ("/display")
	@Produces(MediaType.TEXT_PLAIN)
	public String sayHello(){
		return "helo";
	}
	
	/** The ef. */
	EmployeeFacade ef= EmployeeFacade.getInstance();
	
	/** The employee. */
	private  List<EmpDetail> employee;
    // URI:
    /**
     * Gets the employees JSON.
     *
     * @return the employees JSON
     */
    // /contextPath/servletPath/employees
    @GET
    @Path("/getAll")
    @Produces({MediaType.TEXT_PLAIN })
    public String getEmployees_JSON() {
        employee = ef.getAllEmployee();
        String sar[] = new String[employee.size()];
        int index = 0;
        for(EmpDetail emp: employee){
        	sar[index] = emp.getEmpName() + emp.getEmpNo() + emp.getPosition();
        	index++;
        }
        return Arrays.toString(sar);
    }
 
    // URI:
    /**
     * Gets the employee.
     *
     * @param empNo the emp no
     * @return the employee
     */
    // /contextPath/servletPath/employees/{empNo}
    @GET
    @Path("/getEmp/{empNo}")
    @Produces({ MediaType.TEXT_PLAIN })
    public String getEmployee(@PathParam("empNo") String empNo) {
        EmpDetail emp = ef.getEmployee(empNo);
        String result = emp.getEmpName() + "\t" + emp.getEmpNo() + "\t" + emp.getPosition() ;
    	return result;
    }
 
//    // URI:
/**
 * Adds the employ.
 *
 * @param empNo the emp no
 * @param name the name
 * @param pos the pos
 * @return the string
 */
//    // /contextPath/servletPath/employees
    @POST
    @Path("/addEmp/{empNo},{name},{pos}")
    @Produces({ MediaType.APPLICATION_XML })
    public String addEmploy(@PathParam("empNo") String empNo,@PathParam("name") String name,@PathParam("pos") String pos) {
        EmpDetail emp = new EmpDetail();
        emp.setEmpName(name);
        emp.setEmpNo(empNo);
        emp.setPosition(pos);
    	ef.addEmployee(emp);
    	return emp.getEmpName();
    }
    
    /**
     * Delete employ.
     *
     * @param empNo the emp no
     */
    @DELETE
    @Path("/delEmp/{empNo}")
    @Produces({  MediaType.APPLICATION_XML })
    public void deleteEmploy(@PathParam("empNo") String empNo) {
       ef.deleteEmployee(empNo);
    }
 
}