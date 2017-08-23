package com.metacube.tests;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

import org.junit.Before;
import org.junit.Test;

import com.metacube.postorder.BinaryTreePostOrder;

public class PostOrderTest {
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
	public void postOrderTest() {
		String result = tree.postorder();
		String expected = "654321";
		assertEquals(result,expected);
		
	}


	//Negative test Case
	@Test
	public void postOrderNegative() {
		String result = tree.postorder();
		String expected = "135624";
		assertFalse(expected == result);
	}

	
}
