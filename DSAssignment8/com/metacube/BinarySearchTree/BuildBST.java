/**
 * @Date 30-August-2017
 * @author Rajat Jain
 * @version 1.0
 * @Project The Class Binary Search Tree.
 */
package com.metacube.BinarySearchTree;
/**
 * The Class BuildBST.
 */
public class BuildBST {
	/** The root. */
	BSTNode root;
	/** The size. */
	int size = 0;
	/** The index 1. */
	static int index = 0, index1 = 0;
	/** The array. */
	static int[] array;
	/**
	 * Instantiates a new builds the BST.
	 */
	public BuildBST() {
		root = null;
		index = 0;
		index1 = 0;
	}
	/**
	 * Insert.
	 * @param key the key
	 */
	public void insert(int key) {
		root = buildTree(root, key);
		index1++;
		size++;
	}
	/**
	 * Builds the tree.
	 * @param root the root
	 * @param data the data
	 * @return the BST node
	 */
	BSTNode buildTree(BSTNode root, int data) {
		if (root == null) {
			root = new BSTNode(data, index1);
			return root;
		}
		if (data < root.data) {
			root.left = buildTree(root.left, data);
		} else {
			root.right = buildTree(root.right, data);
		}
		return root;
	}
	/**
	 * Search.
	 * @param val the val
	 * @return the int
	 */
	public int search(int val) {
		int index = -1;
		while ((root != null)) {
			int rval = root.getData();
			if (val < rval) {
				root = root.getLeft();
			} else if (val > rval) {
				root = root.getRight();
			} else {
				index = root.getIndex();
				break;
			}
			index = search(val);
		}
		return index;
	}
	/**
	 * Builds the array.
	 * @return the int[]
	 */
	public int[] buildArray() {
		array = new int[size];
		return buildArray(root);
	}
	/**
	 * Builds the array.
	 * @param root the root
	 * @return the int[]
	 */
	private int[] buildArray(BSTNode root) {
		if (root != null) {
			buildArray(root.left);
			array[index++] = (root.data);
			buildArray(root.right);
		}
		return array;
	}
}
