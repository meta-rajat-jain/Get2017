/** 
 * @author Rajat Jain
 * @version 1.0
 * @Date 24-August-2017
 * @project UnitTest for Job Printing
 *  
 */
package com.metacube.test;

import static org.junit.Assert.assertEquals;

import java.util.HashMap;
import java.util.Map;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.metacube.jobprinting.HeapSort;
import com.metacube.jobprinting.Task;


/**
 * The Class TestHeap.
 */
public class TestHeap {

	/** The heap. */
	@SuppressWarnings("rawtypes")
	
	static HeapSort heapsort;
	static Map<String, Integer> priorityMap; 
	/** The job queue. */
	static Task jobQueue[] = {};

	
	
	@SuppressWarnings({ "rawtypes", "unchecked" })
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		priorityMap = new HashMap<>();
		priorityMap.put("chairman", 4);
		priorityMap.put("professors", 3);
		priorityMap.put("graduate", 2);
		priorityMap.put("undergraduates", 1);
			jobQueue = new Task[2];
			Task job1 = new Task();
			String designation = "undergraduates";
			String message = "I am undergraduate";
			job1.setDesignation(designation);
			job1.setMesssage(message);
			job1.setPriority(priorityMap.get(designation));
			jobQueue[0] = job1;
			Task job2 = new Task();
			designation = "chairman";
			message = "I am chairperson";
			job2.setDesignation(designation);
			job2.setMesssage(message);
			job2.setPriority(priorityMap.get(designation));
			jobQueue[1] = job2;
			HeapSort.heapSort(jobQueue);
	}
	
	

	/**
	 * test priority of queue.
	 */
	@Test
	public void testPriority() {
		int actual = priorityMap.get("chairman");
		int expected = 4;
		assertEquals(expected,actual);
		actual = priorityMap.get("professors");
		expected = 3;
		assertEquals(expected,actual);
	}

	/**
	 * test sorting of queue using heap.
	 */
	@SuppressWarnings("unchecked")
	@Test
	public void testHeap() {
		HeapSort.heapSort(jobQueue);
		String actual="";
		for (int index = 0; index < 2; index++) {
			actual += jobQueue[index].getDesignation() + " ";
		}
		String  expected = "chairman undergraduates ";
		assertEquals(expected.toString() , actual);
	}
}
