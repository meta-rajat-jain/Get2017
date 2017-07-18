import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;


public class TestPatternPrinting2 {
	
	/*
	 * this test will check pyramid pattern for a given max value
	 */
	@Test
	public void test() {
		int max = 5;
		Assignment2 pattern = new Assignment2();
		String result[] = pattern.pyramid(max);
		String expected[] = {   "1 2 3 4 5 ",
								"  1 2 3 4 ",
								"    1 2 3 ",
								"      1 2 ",
								"        1 "};
		Assert.assertArrayEquals(expected,result);
	}
	/*
	 * this test will check the spaces generated for a given row and max value
	 */
	@Test(expected = NegativeArraySizeException.class)
	public void testException() {
			int max = -1;
			Assignment2 pattern = new Assignment2();
			String result[] = pattern.pyramid(max);
			String expected[] = {   "1 2 3 4 5 ",
									"  1 2 3 4 ",
									"    1 2 3 ",
									"      1 2 ",
									"        1 "};
			Assert.assertArrayEquals(expected,result);
	}

	/*
	 * this test will check the spaces generated for a given row and max value
	 */
	@Test
	public void testSpace() {
			int max = 5;
			int row = 0;
			Assignment2 pattern = new Assignment2();
			String result = pattern.spaces(max, row);
			String expected = "";
			assertEquals(expected,result);
	}
	
	/*
	 * this test will check the numbers generated for a given row and max value
	 */
	@Test
	public void testNumbers() {
			int max = 5;
			int row = 0;
			Assignment2 pattern = new Assignment2();
			String result = pattern.number(max,row);
			String expected = "1 2 3 4 5 ";
			assertEquals(expected,result);
	}
}
