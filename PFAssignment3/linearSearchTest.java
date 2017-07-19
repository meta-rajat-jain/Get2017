

import static org.junit.Assert.*;

import org.junit.Test;

public class linearSearchTest {

	@Test
	public void test() {
		int outputExpected = 2;
		int input[]={1,2,3,4,5};
		int index = 0;
		int outputActual = linearSearch.recSearch(input, index, input.length-1, 3);
		assertEquals(outputExpected,outputActual);
	}
	@Test
	public void test1() {
		int outputExpected = -1;
		int input[]={2,5,8,9,10, 77, 55};
		int index = 0;
		int outputActual = linearSearch.recSearch(input, index, input.length-1, 88);
		assertEquals(outputExpected,outputActual);
	}
	@Test
	public void test2() {
		int outputExpected = 5;
		int input[]={2,5,8,9,10, 77, 55};
		int index = 0;
		int outputActual = linearSearch.recSearch(input, index, input.length-1, 77);
		assertEquals(outputExpected,outputActual);
	}

}
