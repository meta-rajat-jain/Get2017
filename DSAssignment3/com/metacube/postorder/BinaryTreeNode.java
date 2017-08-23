/** 
 * @author Rajat Jain
 * @version 1.0
 * @Date 22-August-2017
 * @project Binary Tree Traversal
 */
package com.metacube.postorder;

/**
 * The Class BinaryTreeNode.
 */
public class BinaryTreeNode {

	/** The right. */
	BinaryTreeNode left, right;

	/** The data. */
	int data;

	/**
	 * Instantiates a new binary tree node.
	 */
	public BinaryTreeNode() {
		left = null;
		right = null;
		data = 0;
	}

	/**
	 * Instantiates a new binary tree node.
	 *
	 * @param n
	 *            the n
	 */
	public BinaryTreeNode(int n) {
		left = null;
		right = null;
		data = n;
	}

	/**
	 * Sets the left.
	 *
	 * @param n
	 *            the new left
	 */
	public void setLeft(BinaryTreeNode n) {
		left = n;
	}

	/**
	 * Sets the right.
	 *
	 * @param n
	 *            the new right
	 */
	public void setRight(BinaryTreeNode n) {
		right = n;
	}

	/**
	 * Gets the left.
	 *
	 * @return the left
	 */
	public BinaryTreeNode getLeft() {
		return left;
	}

	/**
	 * Gets the right.
	 *
	 * @return the right
	 */
	public BinaryTreeNode getRight() {
		return right;
	}

	/**
	 * Sets the data.
	 *
	 * @param d
	 *            the new data
	 */
	public void setData(int d) {
		data = d;
	}

	/**
	 * Gets the data.
	 *
	 * @return the data
	 */
	public int getData() {
		return data;
	}
}
