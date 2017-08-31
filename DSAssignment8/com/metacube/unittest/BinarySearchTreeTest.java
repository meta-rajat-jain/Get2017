/**
 * @author Rajat Jain
 * @version 1.0
 * @Date 30-August-2017
 * @project Binary Search Tree
 *
 */
package com.metacube.unittest;
import static org.junit.Assert.assertArrayEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.metacube.BinarySearchTree.BuildBST;
/**
 * The Class BinarySearchTreeTest.
 */
public class BinarySearchTreeTest {
	/** The tree. */
	static BuildBST tree;
	/**
	 * Sets the up.
	 */
	@Before
	public void setUp() {
		tree = new BuildBST();
		tree.insert(10);
		tree.insert(20);
		tree.insert(30);
		tree.insert(40);
		tree.insert(60);
		tree.insert(70);
		tree.insert(80);
	}
	/**
	 * test when value is present in array.
	 */
	@Test
	public void testWhenSameValueIsPresent() {
		tree.insert(20);
		tree.insert(60);
		int[] actual = tree.buildArray();
		int[] expected = {10, 20, 20, 30, 40, 60, 60, 70, 80};
		assertArrayEquals(expected, actual);
	}
	/**
	 * test when value is not present in array.
	 */
	@Test
	public void testWhenDifferentValueIsNotPresent() {
		int[] actual = tree.buildArray();
		int[] expected = {10, 20, 30, 40, 60, 70, 80};
		assertArrayEquals(expected, actual);
	}
	/**
	 * Tear down.
	 */
	@After
	public void tearDown() {
		tree = null;
	}
}
