package com.metacube.DAO;
/** 
 * @author Rajat Jain
 * @version 1.0
 * @Date 14-August-2017
 * @project shopping cart  via  Design Pattern
 */
import com.metacube.enums.DBType;

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
		public static BaseDao getInstance(DBType dbType){
			
			switch(dbType){
			case FileDao:
				return new FileDao();
			case InMemoryDao:
				return new InMemoryDao();
			case MySQLDao:
				return new MySqlDao();
					
			default:
				return null;
			}
		}
}
