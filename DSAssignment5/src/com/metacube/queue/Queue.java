/**
 * @author Rajat Jain
 * @version 1.0
 * @Date 27-August-2017
 * @project Queue
 * 
 */
package com.metacube.queue;

import java.util.LinkedList;

// TODO: Auto-generated Javadoc
/**
 * The Class Queue.
 *
 * @param <E> the element type
 */
public class Queue<E> {
	
	/** The queue. */
	LinkedList<E> queue ;
	
	/**
	 * Instantiates a new queue.
	 */
	public Queue() {
		queue = new LinkedList<E>();
	}
	
	/**
	 * Enqueue.
	 *
	 * @param data the data
	 * @return true, if successful
	 */
	public boolean enqueue(E data){
		queue.addLast(data);
		return true;
	}
	
	/**
	 * Dequeue.
	 *
	 * @return the e
	 */
	public E dequeue(){
		E dequeued = queue.getFirst();
			queue.removeFirst();
			return dequeued;
		}
	
	/**
	 * Peek.
	 *
	 * @return the e
	 */
	public E peek(){
			E peeked = queue.getFirst();
			return peeked;
		}
	
	/**
	 * Prints the.
	 *
	 * @return the string
	 */
	public String print(){
		System.out.println(queue.toString());
		return queue.toString();
		
	}
	
	/**
	 * Clear queue.
	 */
	public void clearQueue(){
		queue.clear();
	}

}
