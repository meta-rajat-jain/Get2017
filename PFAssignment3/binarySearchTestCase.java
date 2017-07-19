import static org.junit.Assert.assertEquals;

import org.junit.Test;

// TODO: Auto-generated Javadoc
/**
 * The Class binarySearchTestCase.
 */
public class binarySearchTestCase {
	
	/**
	 * Match Is Found.
	 */
	@Test
	public void matchIsFound() {
		int outputExpected = 2;
		int input[]={1,2,3,4,5};
		int index = 0;
		int outputActual = binarySearch.binrySearch(input, index, input.length-1, 3);
		assertEquals(outputExpected,outputActual);
	}
	
	/**
	 * No Match Found.
	 */
	@Test
	public void noMatchFound() {
		int outputExpected = -1;
		int input[]={2,5,8,9,10, 77, 55};
		int index = 0;
		int outputActual = binarySearch.binrySearch(input, index, input.length-1, 88);
		assertEquals(outputExpected,outputActual);
	}
	
	/**
	 * When Match Is Found 2.
	 */
	@Test
	public void whenMatchIsFound2() {
		int outputExpected = 5;
		int input[]={2,5,8,9,10, 77, 55};
		int index = 0;
		int outputActual = binarySearch.binrySearch(input, index, input.length-1, 77);
		assertEquals(outputExpected,outputActual);
	}

}
