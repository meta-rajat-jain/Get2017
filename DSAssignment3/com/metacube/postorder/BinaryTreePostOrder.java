/** 
 * @author Rajat Jain
 * @version 1.0
 * @Date 22-August-2017
 * @project Binary Tree Traversal
 */
package com.metacube.postorder;

/**
 * The Class BinaryTreePreOrder.
 */
public class BinaryTreePostOrder {

	/** The root. */
	private BinaryTreeNode root;
	public String postOrder = "";
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

	public String postorder() {
		String result = postorder(root);
		return result;
	}

	/**
	 * Postorder.
	 *
	 * @param postOrderNode
	 *            the postOrderNode
	 */
	private String postorder(BinaryTreeNode postOrderNode) {
		if (postOrderNode != null) {
			postorder(postOrderNode.getLeft());
			postorder(postOrderNode.getRight());
			postOrder += postOrderNode.getData();
		}
		return postOrder;
	}

}
