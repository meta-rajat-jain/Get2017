import static org.junit.Assert.*;

import org.junit.Test;

public class assignment6UnitTest {
	//positive result
	@Test
	public void whenTwoSortedArrayPositiveResult() {
		assignment6 unitTest = new assignment6();
		int[]array1={1,2,5,7,7,9};
		int[]array2={3,3,4,6,7};
		int[] output = unitTest.join(array1,6,array2,5);
		 int expectedOutput[]={1,2,3,3,4,5,6,7,7,7,9};
		assertArrayEquals(expectedOutput, output);
	}
	//negative result
	@Test
	public void whenTwoSortedArrayNegativeResult() {
		assignment6 unitTest = new assignment6();
		int[]array1={1,2,5,7,7,9};
		int[]array2={3,3,4,6,7};
		int[] output = unitTest.join(array1,6,array2,5);
		 int expectedOutput[]={1,2,3,3,4,5,6,7,7,9};
		assertArrayEquals(expectedOutput, output);
	}
	//special case
	@Test
	public void whenOneOfTheArrayIsSortedDescendingly() {
		assignment6 unitTest = new assignment6();
		int[]array1={1,2,5,7,7,9};
		int[]array2={20,19,18,17,16};
		int[] output = unitTest.join(array1,6,array2,5);
		 int expectedOutput[]={1,2,5,7,7,9,16,17,18,19,20};
		assertArrayEquals(expectedOutput, output);
	}
	
}