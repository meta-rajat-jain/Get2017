package com.metacube.tests;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

import org.junit.Before;
import org.junit.Test;

import com.metacube.preorder.BinaryTreePostOrder;

public class PreOrderTest {
	static BinaryTreePostOrder tree;
	//defining object only once
	@Before
	public  void setUp() {
		tree = new BinaryTreePostOrder();
		tree.insert(1);
		tree.insert(2);
		tree.insert(3);
		tree.insert(4);
		tree.insert(5);
		tree.insert(6);
	}

	

	//Positive test Case
	@Test
	public void prefixTest() {
		String result = tree.preorder();
		String expected = "135642";
		assertEquals(result,expected);
		
	}


	//Negative test Case
	@Test
	public void prefixTestNegative() {
		String result = tree.preorder();
		String expected = "135624";
		assertFalse(expected == result);
	}

	
}
