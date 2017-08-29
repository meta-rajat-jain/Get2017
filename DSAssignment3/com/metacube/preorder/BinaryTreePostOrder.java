/** 
 * @author Rajat Jain
 * @version 1.0
 * @Date 22-August-2017
 * @project Binary Tree Traversal
 */
package com.metacube.preorder;

/**
 * The Class BinaryTreePreOrder.
 */
public class BinaryTreePostOrder {

	/** The root. */
	private BinaryTreeNode root;
	public String preOrder = "";
	/**
	 * Instantiates a new binary tree pre order.
	 */
	public BinaryTreePostOrder() {
		root = null;
	}

	/**
	 * Insert.
	 *
	 * @param data
	 *            the data
	 */
	public void insert(int data) {
		root = insert(root, data);
	}

	/**
	 * Insert.
	 *
	 * @param node
	 *            the node
	 * @param data
	 *            the data
	 * @return the binary tree node
	 */
	private BinaryTreeNode insert(BinaryTreeNode node, int data) {
		if (node == null)
			node = new BinaryTreeNode(data);
		else {
			if (node.getRight() == null)
				node.right = insert(node.right, data);
			else
				node.left = insert(node.left, data);
		}
		return node;
	}

	/**
	 * Checks if is empty.
	 *
	 * @return true, if is empty
	 */
	public boolean isEmpty() {
		if (root == null)
			return true;
		else
			return false;

	}

	/**
	 * Preorder.
	 * @return 
	 */
	public String preorder() {
		String result = preorder(root);
		System.out.println("REsult" + result);
		return result;
	}

	/**
	 * Preorder.
	 *
	 * @param nodeTraversal
	 *            the node traversal
	 */
	private String preorder(BinaryTreeNode nodeTraversal) {
		if (nodeTraversal != null) {
			
			preOrder += nodeTraversal.getData();
			preorder(nodeTraversal.getLeft());
			preorder(nodeTraversal.getRight());
			
		}
		return preOrder;
	}

}
