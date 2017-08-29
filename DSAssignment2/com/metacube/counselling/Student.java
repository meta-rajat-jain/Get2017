package com.metacube.counselling;

/** 
 * @author Rajat Jain
 * @version 1.0
 * @Date 22-August-2017
 * @project Counselling Process Through Queue
 */

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * The Class Student.
 */
public class Student {

	/** The choice. */
	int choice[];

	/** The name. */
	String name;

	/** The rank. */
	int rank;

	/** The student. */
	private static Map<Integer, Student> student = new HashMap<Integer, Student>();

	/** The student detail. */
	Student studentDetail;

	/**
	 * Instantiates a new student.
	 */
	Student() {
		choice = new int[5];
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
	 * @param name
	 *            the new name
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * Gets the rank.
	 *
	 * @return the rank
	 */
	public int getRank() {
		return rank;
	}

	/**
	 * Sets the rank.
	 *
	 * @param rank
	 *            the new rank
	 */
	public void setRank(int rank) {
		this.rank = rank;
	}

	/**
	 * Gets the choice.
	 *
	 * @return the choice
	 */
	public int[] getChoice() {
		return choice;
	}

	/**
	 * Sets the choice.
	 *
	 * @param choice
	 *            the new choice
	 */
	public void setChoice(int[] choice) {
		this.choice = choice;
	}

	/**
	 * Adds the student detail.
	 *
	 * @param choice
	 *            the choice
	 * @param name
	 *            the name
	 * @param rank
	 *            the rank
	 */
	public void addStudentDetail(int choice[], String name, int rank) {
		studentDetail = new Student();
		studentDetail.setName(name);
		studentDetail.setRank(rank);
		studentDetail.setChoice(choice);
		student.put(rank, studentDetail);
	}

	/**
	 * Gets the details.
	 *
	 * @return the details
	 */
	public Map<Integer, Student> getDetails() {
		return student;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Student [choice=" + Arrays.toString(choice) + ", name=" + name
				+ ", rank=" + rank + "]";
	}

}
