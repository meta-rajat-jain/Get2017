/*
 * 
 */
package com.metacube.doublylinkedlist;
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
	
	/** The previous. */
	Node<E> next,previous;

	/**
	 * Next.
	 *
	 * @return the node
	 */
	public Node<E> next() {
		return this.next;
	}

	/**
	 * Previous.
	 *
	 * @return the node
	 */
	public Node<E> previous() {
		return this.previous;
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
		node.previous = null;
		return node;
	}

}
