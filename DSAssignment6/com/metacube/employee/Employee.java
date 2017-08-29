/**
 * @author Rajat Jain
 * @version 1.0
 * @Date 28-August-2017
 * @project Employee Sorting
 * 
 */
package com.metacube.employee;

/**
 * The Class Employee.
 */
public class Employee implements Comparable {
	
	/** The e id. */
	private static int eId = 0;
	
	/** The name. */
	private String name;
	
	/** The Address. */
	private String Address;

	/**
	 * Gets the e id.
	 *
	 * @return the e id
	 */
	public int getEId() {
		return eId;
	}

	/**
	 * Sets the E id.
	 */
	public void setEId() {
		this.eId = eId ;
		eId++;
	}

	/**
	 * Gets the name.
	 *
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * Sets the name.
	 *
	 * @param name the new name
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * Gets the address.
	 *
	 * @return the address
	 */
	public String getAddress() {
		return Address;
	}

	/**
	 * Sets the address.
	 *
	 * @param address the new address
	 */
	public void setAddress(String address) {
		Address = address;
	}

	/* (non-Javadoc)
	 * @see java.lang.Comparable#compareTo(java.lang.Object)
	 */
	@Override
	public int compareTo(Object employee) {

		return getName().compareTo(((Employee) employee).getName());

	}
	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Employee [name=" + name + ", Address=" + Address + "]";
	}

}
