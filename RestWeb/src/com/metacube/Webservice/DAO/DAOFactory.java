package com.metacube.Webservice.DAO;
/** 
 * @author Rajat Jain
 * @version 1.0
 * @Date 18-August-2017
 * @project Employee Managment Through REST
 */


import com.metacube.Webservice.enums.Type;

/**
 * A factory for creating DAO objects.
 */
public class DAOFactory {
	
		
		/**
		 * Gets the single instance of DAOFactory.
		 *
		 * @param dbType the db type
		 * @return single instance of DAOFactory
		 */
		public static BaseDAO getInstance(Type type){
			
			switch(type){
			case EmployeeDAO:
				return new EmployeeDAO();
					
			default:
				return null;
			}
		}
}
