/**
 * @author Rajat Jain
 * @version 1.0
 * @Date 12-September-2017
 * @project Library Information System via Design Pattern
 */
package com.metacube.facade;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.metacube.dao.BaseDao;
import com.metacube.dao.DAOFactory;
import com.metacube.entity.Titles;
import com.metacube.enums.DBType;

/**
 * The Class Operations.
 */
public class Operations {

	/** The rs. */
	ResultSet resultSet;

	/** The t. */
	Titles titleObject;

	/** The titles. */
	List<Titles> titles;

	/** The query. */
	String query = new String();

	private static Operations operation;

	/**
	 * Gets the single instance of Operations.
	 *
	 * @return single instance of Operations
	 * @throws ClassNotFoundException
	 *             the class not found exception
	 * @throws SQLException
	 *             the SQL exception
	 */
	public static Operations getInstance() throws ClassNotFoundException,
	SQLException {
		if (operation == null) {
			synchronized (Operations.class) {
				if (operation == null) {
					operation = new Operations();
				}
			}
		}
		return operation;
	}

	/**
	 * Gets the books published.
	 *
	 * @param name
	 *            the name
	 * @return the books published
	 */
	public List<Titles> getBooksPublished(String name) {
		titles = new ArrayList<>();

		try {
			BaseDao dao = DAOFactory.getInstance(DBType.MySQLDao);
			titles = dao.getTitles(name);
		} catch (SQLException e) {
			System.out.println(" Connection failed" + "  " + e.getMessage());
		} catch (ClassNotFoundException e1) {
			System.out.println("ClassNotFoundException Connection failed"
					+ e1.getMessage());
		}
		return titles;
	}

	/**
	 * Check availability.
	 *
	 * @param bookName
	 *            the book name
	 * @return the int
	 */
	public int checkAvailability(String bookName) {
		int flag = -1;
		try {
			BaseDao dao = DAOFactory.getInstance(DBType.MySQLDao);
			flag = dao.check(bookName);
		} catch (SQLException e) {
			System.out.println(" Connection failed" + "  " + e.getMessage());
		} catch (ClassNotFoundException e1) {
			System.out.println("ClassNotFoundException Connection failed"
					+ e1.getMessage());
		}
		return flag;
	}

	/**
	 * Delete books.
	 *
	 * @return the result set
	 */
	public ResultSet deleteBooks() {
		ResultSet rs = null;
		try {
			BaseDao dao = DAOFactory.getInstance(DBType.MySQLDao);
			rs = dao.delete();
		} catch (SQLException e) {
			System.out.println(" Connection failed" + "  " + e.getMessage());
		} catch (ClassNotFoundException e1) {
			System.out.println("ClassNotFoundException Connection failed"
					+ e1.getMessage());
		}
		return rs;
	}
}