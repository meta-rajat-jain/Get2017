/**
 * @author Rajat Jain
 * @version 1.0
 * @Date 26-August-2017
 * @project Queue
 * 
 */
package com.metacube.test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.metacube.queue.Queue;



/**
 * The Class QueueTest.
 */
public class QueueTest {
	
	/** The queue. */
	Queue<Integer> queue;
	
	/**
	 * Sets the up.
	 */
	@Before
	public void setUp(){
		queue = new Queue<Integer>();
	}

	/**
	 * Test enqueue positive.
	 */
	@Test
	public void testEnqueuePositive() {
		Boolean actual = queue.enqueue(5);
		Boolean expected = true;
		assertEquals(actual,expected);
	}
	
	/**
	 * Test enqueue negative.
	 */
	@Test
	public void testEnqueueNegative() {
		Boolean actual = queue.enqueue(5);
		Boolean expected = false;
		assertFalse(actual == expected);
	}
	
	/**
	 * Test dequeue positive.
	 */
	@Test
	public void testDequeuePositive() {
		queue.enqueue(5);
		queue.enqueue(6);
		queue.enqueue(7);
		queue.enqueue(8);
		int actual = queue.dequeue();
		int expected = 5;
		assertEquals(actual,expected);
	}
	
	/**
	 * Test dequeue negative.
	 */
	@Test
	public void testDequeueNegative() {
		queue.enqueue(5);
		queue.enqueue(6);
		queue.enqueue(7);
		queue.enqueue(8);
		int actual = queue.dequeue();
		int expected = 6;
		assertFalse(actual == expected);
	}
	
	/**
	 * Test peek positive.
	 */
	@Test
	public void testPeekPositive() {
		queue.enqueue(5);
		queue.enqueue(6);
		queue.enqueue(7);
		queue.enqueue(8);
		int actual = queue.peek();
		int expected = 5;
		assertEquals(actual,expected);
	}
	
	/**
	 * Test peek negative.
	 */
	@Test
	public void testPeekNegative() {
		queue.enqueue(5);
		queue.enqueue(6);
		queue.enqueue(7);
		queue.enqueue(8);
		int actual = queue.peek();
		int expected = 6;
		assertFalse(actual == expected);
	}
	@Test
	public void testPrintPositive() {
		queue.enqueue(5);
		queue.enqueue(6);
		queue.enqueue(7);
		queue.enqueue(8);
		String actual = queue.print();
		String expected = "[5, 6, 7, 8]";
		assertEquals(actual,expected);
	}
	
	/**
	 * Test print negative.
	 */
	@Test
	public void testPrintNegative() {
		queue.enqueue(5);
		queue.enqueue(6);
		queue.enqueue(7);
		queue.enqueue(8);
		String actual = queue.print();
		String expected = "[5, 7, 6, 8]";
		assertFalse(actual == expected);
	}
	
}
