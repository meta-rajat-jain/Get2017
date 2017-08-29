package com.metacube.sortedlinkedlist;

/**
 * @author Rajat Jain
 * @version 1.0
 * @Date 26-August-2017
 * @project Add in Sorted Linked List
 * 
 */

import java.util.LinkedList;
import java.util.List;

/**
 * The Class SortedLinkedList.
 */
public class addInSorted {

	/** The sorted list. */
	private List<Integer> sortedList;

	/**
	 * Instantiates a new sorted linked list.
	 */
	public addInSorted() {
		sortedList = new LinkedList<Integer>();
	}

	/**
	 * Adds the number.
	 *
	 * @param data
	 *            the data
	 */
	public void addNumber(int data) {
		int position = 0;
		try {
		sort(data, position);
		}catch(Exception e) {
			System.out.println("Error Caught " + e.getMessage());
		}
	}

	/**
	 * Sort.
	 *
	 * @param n
	 *            the n
	 * @return the list
	 */
	private List<Integer> sort(int data, int position) throws Exception

	{
		if (position == sortedList.size()) {
			sortedList.add(data);
			return sortedList;
		}
		if (data < sortedList.get(position)) {
			sortedList.add(position, data);
		} else {
			sort(data, position + 1);
		}
		return sortedList;
	}

	/**
	 * Gets the result.
	 *
	 * @return the result
	 */
	public List<Integer> getResult() {
		return sortedList;
	}


}
