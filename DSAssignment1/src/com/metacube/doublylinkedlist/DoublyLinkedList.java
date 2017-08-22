
package com.metacube.doublylinkedlist;
/** 
 * @author Rajat Jain
 * @version 1.0
 * @Date 14-August-2017
 * @project Data Structure  Assignment 1
 */


/**
 * The Class DoublyLinkedList.
 *
 * @param <E> the element type
 */
public class DoublyLinkedList<E> {
	
	/** The head. */
	Node<E> head = null;
	
	/** The node. */
	Node<E> node = new Node<E>();
	
	/** The size. */
	static int size = 0;

	/**
	 * Adds the node at location.
	 *
	 * @param location the location
	 * @param data the data
	 * @return true, if successful
	 */
	public boolean addNodeAtLocation(int location, E data) {
			Node<E> newNode = node.getNode(data);
			Node<E> temp = this.head;
			int index = 2;
			if(location == 1){
				newNode.next = temp;
				if(temp != null){
					temp.previous = newNode;
				}
				this.head = newNode;
				size++;
				return true;
			}
			else{
				while(temp != null){		
					if(index == location){
						newNode.previous = temp;
						newNode.next = temp.next();
						if(temp.next != null){
							temp.next.previous = newNode;
						}
						temp.next = newNode;
						size++;
						return true;
					}
					index++;
					temp=temp.next();
					}	
				}
		return false;	
	}

	/**
	 * Gets the size.
	 *
	 * @return the size
	 */
	public int getSize() {
		return size;
	}

	/**
	 * Adds the node.
	 *
	 * @param data the data
	 */
	public void addNode(E data) {
		Node<E> newNode = node.getNode(data);
		if (size == 0) {
			this.head = newNode;
		} else {
			Node<E> temp = this.head;
			while (temp.next() != null) {
				temp = temp.next();
			}
			newNode.previous = temp;
			temp.next = newNode;
		}
		size++;
	}

	/**
	 * Removes the item.
	 *
	 * @param data the data
	 * @return true, if successful
	 */
	public boolean removeItem(E data) {
		Node<E> temp = this.head;
		if ( size>0 && head.data.equals(data) ) {
			head = head.next();
			if(head!=null){
			head.previous=null;
			}
			size--;
			return true;
		} else {
			while (temp != null) {
				if (temp.data.equals(data)) {
					temp.previous.next = temp.next();
					if(temp.next != null){
					temp.next.previous = temp.previous();	
					}
					size--;
					return true;
				}
				temp = temp.next();
			}
		}
		return false;
	}

	/**
	 * Removes the item from position.
	 *
	 * @param location the location
	 * @return true, if successful
	 */
	public boolean removeItemFromPosition(int location) {
		Node<E> temp = this.head;
		int index = 0;
		if (location == 0 && size>0) {
			this.head = this.head.next();
			if(head!=null){
			head.previous=null;
			}
			size--;
			return true;
		} else {
			while (temp != null) {
				if (index == location) {
					temp.previous.next = temp.next();
					if(temp.next != null){
						temp.next.previous = temp.previous();
					}
					size--;
					return true;
				}
				index++;
				temp = temp.next();
			}
		}
		return false;
	}

	/**
	 * Gets the element from position.
	 *
	 * @param location the location
	 * @return the element from position
	 */
	public E getElementFromPosition(int location) {
		Node<E> temp = this.head;
		int index = 0;
		while (temp != null) {
			if (index == location) {
				return temp.data;
			}
			temp=temp.next();
			index++;
		}
		return (E) "-1";
	}

	/**
	 * Reverse linked list.
	 */
	public void reverseLinkedList() {
		Node<E> temp = null;
        Node<E> current = head;
 
        while (current != null) {
            temp = current.previous();
            current.previous = current.next;
            current.next = temp;
            current = current.previous();
        }
        /* Before changing head, check for the cases like empty 
         list and list with only one node */
        if (temp != null) {
            head = temp.previous();
        }
	}
	
	/**
	 * Sort.
	 */
	public void sort(){
		Node<E> temp1 = this.head;
		Node<E> temp2 = null;
		while( temp1 != null ){
			temp2 = temp1.next();
			while(temp2 != null){
				if( temp1.data.toString().compareTo(temp2.data.toString()) > 0 ){
					E temp = temp1.data;
					temp1.data = temp2.data;
					temp2.data = temp;
				}
				temp2 = temp2.next();
			}
			temp1 = temp1.next();
		}
	}
	
}
