/**
 * @author Rajat Jain
 * @version 1.0
 * @Date 12-September-2017
 * @project Library Information System via Design Pattern
 */
package com.metacube.dao;

import java.sql.SQLException;

import com.metacube.enums.DBType;

/**
 * A factory for creating DAO objects.
 */
public class DAOFactory {

	/**
	 * Gets the single instance of DAOFactory.
	 *
	 * @return single instance of DAOFactory
	 */
	private static BaseDao dao;

	/**
	 * Gets the single instance of DAOFactory.
	 *
	 * @param dbType
	 *            the db type
	 * @return single instance of DAOFactory
	 * @throws ClassNotFoundException
	 *             the class not found exception
	 * @throws SQLException
	 *             the SQL exception
	 */
	public static BaseDao getInstance(DBType dbType)
			throws ClassNotFoundException, SQLException {
		if (dao == null) {
			synchronized (DAOFactory.class) {
				if (dao == null) {
					switch (dbType) {

						case MySQLDao :
							dao = new MySqlDao();
							break;
						default :
							dao = null;
					}
				}
			}
		}
		return dao;
	}
}
