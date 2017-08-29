package com.metacube.stacks;

/**
 * @author Rajat Jain
 * @version 1.0
 * @Date 22-August-2017
 * @project Stack
 */
public class Node<E> {

	E data;

	/** The previous. */
	Node<E> previous;

	/**
	 * 
	 * @param data
	 */

	public Node() {
	}

	public Node(E data) {
		this.data = data;
		this.previous = null;
	}

	/**
	 * 
	 * @return next
	 */
	public Node<E> previous() {
		return this.previous;
	}

	/**
	 * 
	 * @param data
	 * @return new node
	 */
	public Node<E> getNode(E data) {
		Node<E> node = new Node<E>(data);
		return node;
	}

}
