/**
 * @Date 30-August-2017
 * @author Rajat Jain
 * @version 1.0
 * @Project The Class Binary Search Tree Node.
 */
package com.metacube.BinarySearchTree;
/**
 * The Class BSTNode.
 */
public class BSTNode {
	/** The index. */
	int data, index;
	/** The left. */
	BSTNode left;
	/** The right. */
	BSTNode right;
	/**
	 * Instantiates a new BST node.
	 * @param data the data
	 * @param index the index
	 */
	public BSTNode(int data, int index) {
		this.data = data;
		this.index = index;
		left = null;
		right = null;
	}
	/**
	 * Gets the data.
	 * @return the data
	 */
	public int getData() {
		return data;
	}
	/*
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "data=" + data;
	}
	/**
	 * Gets the index.
	 * @return the index
	 */
	public int getIndex() {
		return index;
	}
	/**
	 * Sets the index.
	 * @param index the new index
	 */
	public void setIndex(int index) {
		this.index = index;
	}
	/**
	 * Sets the data.
	 * @param data the new data
	 */
	public void setData(int data) {
		this.data = data;
	}
	/**
	 * Gets the left.
	 * @return the left
	 */
	public BSTNode getLeft() {
		return left;
	}
	/**
	 * Sets the left.
	 * @param left the new left
	 */
	public void setLeft(BSTNode left) {
		this.left = left;
	}
	/**
	 * Gets the right.
	 * @return the right
	 */
	public BSTNode getRight() {
		return right;
	}
	/**
	 * Sets the right.
	 * @param right the new right
	 */
	public void setRight(BSTNode right) {
		this.right = right;
	}
}
