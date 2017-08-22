/*
 * 
 */
package com.metacube.linkedlist;
/** 
 * @author Rajat Jain
 * @version 1.0
 * @Date 14-August-2017
 * @project Data Structure  Assignment 1
 */
/**
 * The Class Node.
 *
 * @param <E> the element type
 */
public class Node<E> {

	/** The data. */
	E data;
	
	/** The next. */
	Node<E> next;

	/**
	 * Next.
	 *
	 * @return the node
	 */
	public Node<E> next() {
		return this.next;
	}

	/**
	 * Gets the node.
	 *
	 * @param data the data
	 * @return the node
	 */
	public Node<E> getNode(E data) {
		Node<E> node = new Node<E>();
		node.data = data;
		node.next = null;
		return node;
	}
}
