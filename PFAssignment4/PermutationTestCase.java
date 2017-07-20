import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;


import org.junit.Before;

import org.junit.Test;

/**
 * @author Rajat Jain
 * @version1.10 19 July 2017
 */

/**
 * Class description
 */

public class PermutationTestCase {
	static List<String> output = new ArrayList<String>();

	/**
	 * Run before test method.
	 */
	@Before
	public void runBeforeTestMethod() {
		output.clear();
	}

	/**
	 * Test 1. This will test on string abc
	 */
	// Test Case when input string has different letters
	@Test
	public void testStringWithDifferentLetters() {
		List<String> expected = new ArrayList<String>();
		output = Permutation.generatePermutations("ABC");
		expected.add("ACB");
		expected.add("BCA");
		expected.add("ABC");
		expected.add("CBA");
		expected.add("BAC");
		expected.add("CAB");
		assertEquals(expected, output);

	}

	// Test Case when input string has some same letters
	@Test
	public void testStringWithSameLetters() {
		List<String> expected = new ArrayList<String>();
		output = Permutation.generatePermutations("AAC");
		expected.add("CAA");
		expected.add("AAC");
		expected.add("ACA");
		assertEquals(expected, output);

	}

	// Test Case when input string has some same letters
	@Test
	public void testStringWithSingleLetter() {
		List<String> expected = new ArrayList<String>();
		output = Permutation.generatePermutations("A");
		expected.add("A");
		assertEquals(expected, output);

	}
	/**
	 * Test 3. This will test when null is provided as input
	 */
	@Test(expected = NullPointerException.class)
	public void test3() {
		String input = null;
		output = Permutation.generatePermutations(input);
		String actual[] = output.toArray(new String[output.size()]);
		String expected[] = { "Null Pointer Exception Occur" };
		assertArrayEquals(expected, actual);
	}

}
