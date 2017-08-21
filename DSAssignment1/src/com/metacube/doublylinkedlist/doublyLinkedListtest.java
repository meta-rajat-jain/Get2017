package com.metacube.doublylinkedlist;
/** 
 * @author Rajat Jain
 * @version 1.0
 * @Date 14-August-2017
 * @project Data Structure  Assignment 1
 */
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

import org.junit.BeforeClass;
import org.junit.Test;

import com.metacube.linkedlist.SinglyLinkedList;


public class doublyLinkedListtest {
	static SinglyLinkedList<Integer> linkedList;
	@BeforeClass
	public static void  setUpClass(){
		linkedList = new SinglyLinkedList<Integer>();
	}
	@Test
	public void testAdd(){
		
		linkedList.addNode(5);
		int expected = linkedList.getElementFromPosition(0);
		assertEquals(5, expected);
	}
	
	/**
	 * Test add by index.
	 */
	@Test
	public void testAddByIndex(){
		
		linkedList.addNode(5);
		linkedList.addNode(6);
		boolean expected = linkedList.addNodeAtLocation(2, 7);
		assertEquals(true, expected);
	}
	
	@Test
	public void testSize(){
		
		linkedList.addNode(5);
		linkedList.addNode(6);
		linkedList.addNode(8);
		int expected = linkedList.getSize() - 1;
		assertEquals(3, expected);
	}
	
	
	@Test
	public void testRemoveElementByPosition(){
	
		linkedList.addNode(5);
		linkedList.addNode(6);
		linkedList.addNode(8);
		boolean expected =  linkedList.removeItemFromPosition(1);
		assertEquals(true, expected );
	}
	
	@Test
	public void testRemoveElementByPositionNegative(){
	
		linkedList.addNode(5);
		linkedList.addNode(6);
		linkedList.addNode(8);
		linkedList.removeItemFromPosition(1);
		assertFalse(1 == linkedList.getElementFromPosition(6));
	}
	
	@Test
	public void testRemoveElement(){
	
		linkedList.addNode(5);
		linkedList.addNode(6);
		linkedList.addNode(8);
		assertEquals(true, linkedList.removeItem(8));
	}
	
	@Test
	public void testRemoveElementNegative(){
	
		linkedList.addNode(5);
		linkedList.addNode(6);
		linkedList.addNode(8);
		assertFalse(false == linkedList.removeItem(8));
	}
	
	
	
	
	
	/*@Test
	public void testReverseArray(){
		DoublyLinkedList<Integer> linkedList = new DoublyLinkedList<Integer>();
		linkedList.addNode(5);
		linkedList.addNode(6);
		linkedList.addNode(8);
		linkedListect expected[] = linkedList.printArrayList();
		linkedList.reverseArrayList();
		linkedListect actual[] = linkedList.printArrayList();
		assertFalse(actual == expected);
	}*/
}
