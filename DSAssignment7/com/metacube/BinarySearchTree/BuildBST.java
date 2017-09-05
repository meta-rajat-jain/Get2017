/**
 * @author Rajat Jain
 * @version 1.0
 * @Date 29-August-2017
 * @project Binary Search
 *
 */
package com.metacube.BinarySearchTree;

/**
 * The Class BuildBST.
 */
public class BuildBST {

	/** The root. */
	BSTNode root;

	/** The size. */
	static int size = 0;

	/** The index 1. */
	static int index1 = 0;

	/** The index. */
	int index = -1;

	/** The array. */
	static int[] array;

	/**
	 * Instantiates a new builds the BST.
	 */
	public BuildBST() {
		root = null;
	}

	/**
	 * Insert.
	 *
	 * @param key
	 *            the key
	 */
	public void insert(int key) {

		root = buildTree(root, key);
		index1++;
		size++;
	}

	/**
	 * Builds the tree.
	 *
	 * @param root
	 *            the root
	 * @param data
	 *            the data
	 * @return the BST node
	 */
	BSTNode buildTree(BSTNode root, int data) {

		if (root == null) {
			root = new BSTNode(data, index1);
			return root;
		}

		if (data < root.data) {
			root.left = buildTree(root.left, data);
		} else if (data > root.data) {
			root.right = buildTree(root.right, data);
		}
		return root;
	}

	/**
	 * Search element.
	 *
	 * @param value
	 *            the value
	 * @return the the result as index
	 */
	public int searchElement(int value) {
		BSTNode node = root;
		return search(node, value);
	}

	/**
	 * Search.
	 *
	 * @param root
	 *            the root
	 * @param val
	 *            the value
	 * @return the result as index
	 */
	private int search(BSTNode root, int val) {
		while ((root != null)) {
			int rval = root.getData();
			if (val < rval) {
				root = root.getLeft();
			} else if (val > rval) {
				root = root.getRight();
			} else {
				index = root.getIndex();
				return index + 1;
			}
			index = search(root, val);
		}
		return -1;
	}

}
