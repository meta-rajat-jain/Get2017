package com.metacube.Webservice.Entities;
// TODO: Auto-generated Javadoc
/** 
 * @author Rajat Jain
 * @version 1.0
 * @Date 18-August-2017
 * @project Employee Managment Through REST
 */

public class EmpDetail implements BaseEntity{
	 
    /** The emp no. */
    private String empNo;
    
    /** The emp name. */
    private String empName;
    
    /** The position. */
    private String position;
 
    /**
     * Instantiates a new emp detail.
     */
    // This default constructor is required if there are other constructors.
    public EmpDetail() {
 
    }
 
    /**
     * Instantiates a new emp detail.
     *
     * @param empNo the emp no
     * @param empName the emp name
     * @param position the position
     */
    public EmpDetail(String empNo, String empName, String position) {
        this.empNo = empNo;
        this.empName = empName;
        this.position = position;
    }
 
    /**
     * Gets the emp no.
     *
     * @return the emp no
     */
    public String getEmpNo() {
        return empNo;
    }
 
    /**
     * Sets the emp no.
     *
     * @param empNo the new emp no
     */
    public void setEmpNo(String empNo) {
        this.empNo = empNo;
    }
 
    /**
     * Gets the emp name.
     *
     * @return the emp name
     */
    public String getEmpName() {
        return empName;
    }
 
    /**
     * Sets the emp name.
     *
     * @param empName the new emp name
     */
    public void setEmpName(String empName) {
        this.empName = empName;
    }
 
    /**
     * Gets the position.
     *
     * @return the position
     */
    public String getPosition() {
        return position;
    }
 
    /**
     * Sets the position.
     *
     * @param position the new position
     */
    public void setPosition(String position) {
        this.position = position;
    }
 
}
