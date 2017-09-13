/**
 * @author Rajat Jain
 * @version 1.0
 * @Date 12-September-2017
 * @project Library Information System via Design Pattern
 */
package com.metacube.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.metacube.constants.Constants;
import com.metacube.entity.Titles;

/**
 * The Class MySqlDao.
 */
public class MySqlDao implements BaseDao {

	/** The connection object. */
	Connection con;

	/** The statment object. */
	Statement st;

	/** The result set. */
	ResultSet resultSet;

	/** The t. */
	Titles titleObject;

	/** The titles. */
	List<Titles> titles;

	MySqlDao dao;

	/** The query. */
	String query = new String();

	/**
	 * Instantiates a new my sql dao.
	 *
	 * @throws SQLException
	 *             the SQL exception
	 * @throws ClassNotFoundException
	 *             the class not found exception
	 */
	public MySqlDao() throws SQLException, ClassNotFoundException {

		Class.forName(Constants.driver);
		con = DriverManager.getConnection(Constants.mysqlURL, Constants.userId,
				Constants.password);
		st = con.createStatement();
	}

	@Override
	public void setdata(String s) throws SQLException, ClassNotFoundException {
		st.executeUpdate(s);
	}

	@Override
	public ResultSet getdata(String s) throws SQLException,
	ClassNotFoundException {
		ResultSet rs = st.executeQuery(s);
		return rs;
	}
	@Override
	public List<Titles> getTitles(String name) throws ClassNotFoundException,
	SQLException {
		dao = new MySqlDao();
		titles = new ArrayList<>();
		System.out.println("name = " + name);
		String query = "SELECT a.author_id,a.author_nm,t.title_id,x.title_nm "
				+ "FROM authors a " + "JOIN title_author t "
				+ "on t.author_id = a.author_id AND author_nm = '" + name + "'"
				+ "JOIN titles x " + "on t.title_id = x.title_id;";
		resultSet = dao.getdata(query);
		while (resultSet.next()) {
			titleObject = new Titles();
			titleObject.setAunthorId(Integer.parseInt(resultSet
					.getString("author_id")));
			titleObject.setAuthorName(resultSet.getString("author_nm"));
			titleObject.setTitle_id(Integer.parseInt(resultSet
					.getString("title_id")));
			titleObject.setTitleName(resultSet.getString("title_nm"));
			titles.add(titleObject);
		}
		return titles;
	}
	@Override
	public int check(String bookName) throws ClassNotFoundException,
	SQLException {
		dao = new MySqlDao();
		int flag = -1;
		query = "select b.accession_no from books b join titles t on b.title_id = t.title_id and title_nm = '"
				+ bookName + "'";
		ResultSet rs = dao.getdata(query);
		if (!rs.next()) {
			flag = 0;
		} else {
			query = "select count(accession_no) "
					+ "from book_issue "
					+ " where accession_no in (select b.accession_no from books b join titles t on b.title_id = t.title_id and title_nm = '"
					+ bookName + "')";
			rs = dao.getdata(query);
			rs.absolute(1);
			int count1 = rs.getInt(1);
			if (count1 == 0) {
				flag = 1;
			} else {
				query = "select count(1) "
						+ " from book_return r "
						+ " where return_dt is not null and accession_no in (select b.accession_no from books b join titles t on b.title_id = t.title_id and title_nm = '"
						+ bookName + "')";
				rs = dao.getdata(query);
				rs.absolute(1);
				int count2 = rs.getInt(1);
				if (count1 == count2) {
					flag = 1;
				}
			}
		}
		return flag;
	}
	@Override
	public ResultSet delete() throws ClassNotFoundException, SQLException {
		dao = new MySqlDao();
		query = "select distinct b.accession_no,t.title_nm,DATEDIFF(now(),issue_dt) as NoOfDays "
				+ " from books b "
				+ " join book_issue bi "
				+ " on bi.accession_no = b.accession_no AND DATEDIFF(NOW(),bi.issue_dt) > 5 or "
				+ " (b.accession_no NOT IN (select bi.accession_no from book_issue bi where b.accession_no = bi.accession_no) "
				+ " and DATEDIFF(NOW(), b.purchase_dt) > 5) "
				+ " JOIN titles t "
				+ " on b.title_id = t.title_id "
				+ " ORDER BY b.accession_no DESC;";
		resultSet = dao.getdata(query);

		query = "delete distinct b.accession_no,t.title_nm,DATEDIFF(now(),issue_dt) as NoOfDays "
				+ " from books b "
				+ " join book_issue bi "
				+ " on bi.accession_no = b.accession_no AND DATEDIFF(NOW(),bi.issue_dt) > 365 or "
				+ " (b.accession_no NOT IN (select bi.accession_no from book_issue bi where b.accession_no = bi.accession_no) "
				+ " and DATEDIFF(NOW(), b.purchase_dt) > 365) "
				+ " JOIN titles t " + " on b.title_id = t.title_id ;";

		dao.setdata(query);

		return resultSet;
	}

}
