/**
 * @author Rajat Jain
 * @version 1.0
 * @Date 12-September-2017
 * @project Library Information System via Design Pattern
 */
package com.metacube.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import com.metacube.entity.BaseEntity;
import com.metacube.entity.Titles;

/**
 * The Interface BaseDao.
 *
 * @param <T>
 *            the generic type
 */
public interface BaseDao<T extends BaseEntity> {

	/**
	 * Sets the data.
	 *
	 *
	 * @param s
	 *            the new data
	 * @throws SQLException
	 *             the SQL exception
	 * @throws ClassNotFoundException
	 *             the class not found exception
	 */
	public void setdata(String s) throws SQLException, ClassNotFoundException;

	/**
	 * Gets the data.
	 *
	 * @param s
	 *            the s
	 * @return the data
	 * @throws SQLException
	 *             the SQL exception
	 * @throws ClassNotFoundException
	 *             the class not found exception
	 */
	public ResultSet getdata(String s) throws SQLException,
			ClassNotFoundException;

	public List<Titles> getTitles(String name) throws ClassNotFoundException,
			SQLException;
	public int check(String bookName) throws ClassNotFoundException,
	SQLException;
	public ResultSet delete() throws ClassNotFoundException, SQLException;

}
