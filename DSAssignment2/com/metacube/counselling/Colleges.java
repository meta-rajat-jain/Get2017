package com.metacube.counselling;

/** 
 * @author Rajat Jain
 * @version 1.0
 * @Date 22-August-2017
 * @project Counselling Process Through Queue
 */
import java.util.HashMap;
import java.util.Map;

/**
 * The Class Colleges.
 */
public class Colleges {

	/** The name. */
	String name;

	/** The seats. */
	int seats;

	/** The rank. */
	int rank;

	/** The college details. */
	static Map<Integer, Colleges> collegeDetails = new HashMap<>();

	/**
	 * Instantiates a new colleges.
	 */
	public Colleges() {

	}

	/**
	 * Instantiates a new colleges.
	 *
	 * @param name
	 *            the name
	 * @param seats
	 *            the seats
	 * @param rank
	 *            the rank
	 */
	public Colleges(String name, int seats, int rank) {
		this.setName(name);
		this.setRank(rank);
		this.setSeats(seats);
		collegeDetails.put(rank, this);
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
	 * Gets the seats.
	 *
	 * @return the seats
	 */
	public int getSeats() {
		return seats;
	}

	/**
	 * Sets the seats.
	 *
	 * @param seats
	 *            the new seats
	 */
	public void setSeats(int seats) {
		this.seats = seats;
	}

	/**
	 * Gets the college detail.
	 *
	 * @return the college detail
	 */
	public Map<Integer, Colleges> getCollegeDetail() {
		return collegeDetails;
	}
}
