/**
 * @author Rajat Jain
 * @version 1.0
 * @Date 12-September-2017
 * @project Library Information System via Design Pattern
 */
package com.metacube.entity;

import java.sql.ResultSet;

/**
 * The Class Titles.
 */
public class Titles implements BaseEntity {

	/** The author name. */
	private String authorName;

	/** The aunthor id. */
	private int aunthorId;

	/** The title id. */
	private int title_id;

	/** The title name. */
	private String titleName;

	/** The rs. */
	ResultSet rs;

	/**
	 * Gets the title name.
	 *
	 * @return the title name
	 */
	public String getTitleName() {
		return titleName;
	}

	/**
	 * Sets the title name.
	 *
	 * @param titleName
	 *            the new title name
	 */
	public void setTitleName(String titleName) {
		this.titleName = titleName;
	}

	/**
	 * Gets the author name.
	 *
	 * @return the author name
	 */
	public String getAuthorName() {
		return authorName;
	}

	/**
	 * Sets the author name.
	 *
	 * @param authorName
	 *            the new author name
	 */
	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}

	/**
	 * Gets the aunthor id.
	 *
	 * @return the aunthor id
	 */
	public int getAunthorId() {
		return aunthorId;
	}

	/**
	 * Sets the aunthor id.
	 *
	 * @param aunthorId
	 *            the new aunthor id
	 */
	public void setAunthorId(int aunthorId) {
		this.aunthorId = aunthorId;
	}

	/**
	 * Gets the title id.
	 *
	 * @return the title id
	 */
	public int getTitle_id() {
		return title_id;
	}

	/**
	 * Sets the title id.
	 *
	 * @param title_id
	 *            the new title id
	 */
	public void setTitle_id(int title_id) {
		this.title_id = title_id;
	}

	@Override
	public String toString() {
		return "Titles [authorName=" + authorName + ", aunthorId=" + aunthorId
				+ ", title_id=" + title_id + ", titleName=" + titleName + "]";
	}

}
