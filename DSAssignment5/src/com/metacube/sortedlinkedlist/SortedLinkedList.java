/**
 * @author Rajat Jain
 * @version 1.0
 * @Date 26-August-2017
 * @project Add in Sorted Linked List
 * 
 */
package com.metacube.sortedlinkedlist;

import java.util.LinkedList;
import java.util.List;
/**
 * The Class SortedLinkedList.
 */
public class SortedLinkedList {
	
	/** The sorted list. */
	private List<Integer> sortedList ;
	
	/**
	 * Instantiates a new sorted linked list.
	 */
	public SortedLinkedList() {
		sortedList = new LinkedList<Integer>();
	}
	
	/**
	 * Adds the number.
	 *
	 * @param data the data
	 */
	public void addNumber(int data) {
		sortedList.add(data);
		sort(sortedList.size());
	}
	
	/**
	 * Sort.
	 *
	 * @param n the n
	 * @return the list
	 */
	private List<Integer> sort(int n)
	
	{	
		if (n == 1)
			return sortedList;
		for (int i=0; i<n-1; i++)
			if (sortedList.get(i) > sortedList.get(i+1))
			{
				// swap sortedList.get(i) with sortedList.get(i+1)
				int temp = sortedList.get(i);
				int temp1= sortedList.get(i+1);
				sortedList.set(i+1, temp);
				sortedList.set(i, temp1);
			}

		sort(n-1);
		return sortedList;
	}
	
	/**
	 * Gets the result.
	 *
	 * @return the result
	 */
	public List<Integer> getResult(){
		return sortedList;
	}
	
	

}
