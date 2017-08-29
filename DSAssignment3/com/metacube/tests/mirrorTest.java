package com.metacube.tests;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

import org.junit.Before;
import org.junit.Test;

import com.metacube.mirror.BinaryTree;

public class mirrorTest {
	static BinaryTree tree;
	static BinaryTree mirrortree;
	//defining object only once
	@Before
	public  void setUp() {
		tree = new BinaryTree();
		mirrortree = new BinaryTree();
		tree.insert(1);
		tree.insert(2);
		tree.insert(3);
		tree.insert(4);
		tree.insert(5);
		tree.insert(6);
		
		
	}

	

	//Positive test Case
	@Test
	public void mirrorTest() {
		mirrortree.insertInMirror(1);
		mirrortree.insertInMirror(2);
		mirrortree.insertInMirror(3);
		mirrortree.insertInMirror(4);
		mirrortree.insertInMirror(5);
		mirrortree.insertInMirror(6);
		boolean result = tree.mirror(mirrortree.getRoot(),tree.getRoot());
		boolean expected = true;
		assertEquals(expected ,result);
		
	}


	//Negative test Case
	@Test
	public void mirrorTestNegative() {
		mirrortree.insertInMirror(2);
		mirrortree.insertInMirror(1);
		mirrortree.insertInMirror(4);
		mirrortree.insertInMirror(3);
		mirrortree.insertInMirror(5);
		mirrortree.insertInMirror(6);
		boolean result = tree.mirror(mirrortree.getRoot(),tree.getRoot());
		boolean expected = true;
		assertFalse(expected == result);
	}

	
}
