import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;


public class TestPatternPrinting {

	/*
	 * this test will check pyramid pattern for a given max value
	 */
	@Test
	public void testPyramid() {
			int max = 5;
			Assignment1 pattern = new Assignment1();
			String result[] = pattern.pyramid(max);
					String expected[] ={"        1         ",
										"      1 2 1       ",
										"    1 2 3 2 1     ",
										"  1 2 3 4 3 2 1   ",
										"1 2 3 4 5 4 3 2 1 ",
										"  1 2 3 4 3 2 1   ",
										"    1 2 3 2 1     ",
										"      1 2 1       ",
										"        1         "};
			Assert.assertArrayEquals(expected,result);
	}
	/*
	 * this test will check pyramid pattern for a given negative value
	 */
	@Test(expected = NegativeArraySizeException.class)
	public void testException() {
			int max = -1;
			Assignment1 pattern = new Assignment1();
			String result[] = pattern.pyramid(max);
					String expected[] ={"        1         ",
										"      1 2 1       ",
										"    1 2 3 2 1     ",
										"  1 2 3 4 3 2 1   ",
										"1 2 3 4 5 4 3 2 1 ",
										"  1 2 3 4 3 2 1   ",
										"    1 2 3 2 1     ",
										"      1 2 1       ",
										"        1         "};
			Assert.assertArrayEquals(expected,result);
	}
	
    
	/*
	 * this test will check the spaces generated for a given row and max value
	 */
	@Test
	public void testSpace() {
			int max = 5;
			int row = 5;
			String result = Assignment1.spaces(max, row);
			String expected = "  ";
			assertEquals(expected,result);
	}
	
	/*
	 * this test will check the numbers generated for a given row and max value
	 */
	@Test
	public void testNumbers() {
			int max = 5;
			int row = 0;
			String result = Assignment1.number(max, row);
			String expected = "1 ";
			assertEquals(expected,result);
	}

}
