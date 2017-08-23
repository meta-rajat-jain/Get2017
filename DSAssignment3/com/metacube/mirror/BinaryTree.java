/** 
 * @author Rajat Jain
 * @version 1.0
 * @Date 22-August-2017
 * @project Binary Tree Traversal
 */
package com.metacube.mirror;

/**
 * The Class BinaryTreePreOrder.
 */
public class BinaryTree {

	/** The root. */
	private BinaryTreeNode root,oldRoot, newRoot ;

	public BinaryTreeNode getRoot() {
		return root;
	}

	public void setRoot(BinaryTreeNode root) {
		this.root = root;
	}

	/**
	 * Instantiates a new binary tree pre order.
	 */
	public BinaryTree() {
		root = null;
		oldRoot = null ;
		newRoot = null;
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
	public void insertInMirror(int data) {
		root = insertInMirror(root, data);
	}
	private BinaryTreeNode insertInMirror(BinaryTreeNode node, int data) {
		if (node == null)
			node = new BinaryTreeNode(data);
		else {
			if (node.getLeft() == null)
				node.left = insertInMirror(node.left, data);
			else
				node.right = insertInMirror(node.right, data);
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
	public boolean mirror(BinaryTreeNode newRoot,BinaryTreeNode oldRoot){
		if(newRoot == null && oldRoot==null)
			return true;
		
		if(newRoot == null || oldRoot==null)
			return false;
		
		return (oldRoot.getData())==(newRoot.getData()) && mirror(newRoot.getLeft(),oldRoot.getRight()) && mirror(newRoot.getRight(),oldRoot.getLeft());
	}
	
	public boolean checkMirror(){
		boolean flag = mirror(newRoot,oldRoot);
		return flag;
	}
	public void printInOrder(BinaryTreeNode root){
		if(root != null){
			printInOrder(root.getLeft());
			System.out.print(root.data + " ");
			printInOrder(root.getRight());
		}
	}
}
