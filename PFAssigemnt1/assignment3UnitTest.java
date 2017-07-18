import static org.junit.Assert.*;

import org.junit.Test;

public class assignment3UnitTest {
	@Test
	public void whenLongestSequenceIsCorrect() {
		assignment3 unitTest = new assignment3();
		int input[]={1,2,3,2,3,4,5,3,4,2,2,3,4,5,6,7,8,1,2,4,5,6,7,8,9};
		int[] output = unitTest.longestSequence(input);
		 int expectedOutput[]={1, 2,4,5,6,7,8,9};
		assertArrayEquals(expectedOutput, output);
	}
	@Test
	public void whenLongestSequenceIsIncorrect() {
		assignment3 unitTest = new assignment3();
		int input[]={1,2,3,2,3,4,5,3,4,2,2,3,4,5,6,7,8,1,2,4,5,6,7,8,9};
		int[] output = unitTest.longestSequence(input);
		 int expectedOutput[]={1,2,2,4,5,6,7,8,9};
		assertArrayEquals(expectedOutput, output);
	}

	@Test
	public void whenLongestSequenceIsCorrect1() {
		assignment3 unitTest = new assignment3();
		int input[]={1,2,3,2,3,4,5,3,4,2,2,3,4,5,6,7,8,9,10,11,12,1,2,4,5,6,7,8,9};
		int[] output = unitTest.longestSequence(input);
		 int expectedOutput[]={2,3,4,5,6,7,8,9,10,11,12};
		assertArrayEquals(expectedOutput, output);
	}
}
