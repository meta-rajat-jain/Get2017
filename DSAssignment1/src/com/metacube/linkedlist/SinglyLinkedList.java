/*
 * 
 */
package com.metacube.linkedlist;
/** 
 * @author Rajat Jain
 * @version 1.0
 * @Date 14-August-2017
 * @project Data Structure  Assignment 1
 */
public class SinglyLinkedList<E> {

	Node<E> head = null;
	Node<E> node = new Node<E>();
	 int size = 0;

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
		Node<E> prev = null;
		if(location == 1){
			newNode.next = temp;
			this.head = newNode;
			size++;
			return true;
		}
		else{
			while(temp != null){
				location--;
				if( location == 0 ){
					prev.next = newNode;
					newNode.next = temp;
					size++;
					return true;
				}
				prev = temp;
				temp = temp.next();
			}
		}
		return false;	
	}

	public int getSize() {
		return size;
	}

	public void addNode(E data) {
		if (size == 0) {
			Node<E> newNode = node.getNode(data);
			this.head = newNode;
		} else {
			Node<E> newNode = node.getNode(data);
			Node<E> temp = this.head;
			while (temp.next() != null) {
				temp = temp.next();
			}
			temp.next = newNode;
		}
		size++;
	}

	public boolean removeItem(E data) {
		Node<E> temp = this.head;
		Node<E> prev = null;
		if (head.data.equals(data)) {
			head = head.next();
			size--;
			return true;
		} else {
			while (temp != null) {
				if (temp.data.equals(data)) {
					prev.next = temp.next();
					size--;
					return true;
				}
				prev = temp;
				temp = temp.next();
			}
		}
		return false;
	}

	public boolean removeItemFromPosition(int location) {
		Node<E> temp = this.head;
		Node<E> prev = null;
		int index = 0;
		if (location == 0) {
			this.head = this.head.next();
			size--;
			return true;
		} else {
			while (temp != null) {
				if (index == location) {
					prev.next = temp.next();
					size--;
					return true;
				}
				index++;
				prev = temp;
				temp = temp.next();
			}
		}
		return false;
	}

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

	public void reverseLinkedList() {
		Node<E> temp = this.head;
		Node<E> head1 = null;
		while (head != null) {
			temp = head;
			head = head.next();
			temp.next = head1;
			head1 = temp;
		}
		head = head1;
	}

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
