/**
 * @author Rajat Jain
 * @version 1.0
 * @Date 29-August-2017
 * @project Binary Search
 *
 */
package com.metacube.unittest;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import com.metacube.BinarySearchTree.BuildBST;

/**
 * The Class BinarySearchTreeTest.
 */
public class BinarySearchTreeTest {

	/** The tree. */
	BuildBST tree;

	/**
	 * Sets the up.
	 */
	@Before
	public void setUp() {
		tree = new BuildBST();
		tree.insert(1);
		tree.insert(2);
		tree.insert(2);
		tree.insert(3);
		tree.insert(4);
		tree.insert(6);
		tree.insert(6);
		tree.insert(7);
		tree.insert(8);
	}

	/**
	 * test when value is present in array.
	 */
	@Test
	public void testWhenValueIsPresent() {
		int actual = tree.searchElement(2);
		int expected = 2;
		assertEquals(expected, actual);
	}

	/**
	 * test when value is not present in array.
	 */
	@Test
	public void testWhenValueIsNotPresent() {
		int actual = tree.searchElement(9);
		int expected = -1;
		assertEquals(expected, actual);
	}

}
