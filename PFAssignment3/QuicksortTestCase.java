import static org.junit.Assert.assertEquals;

import org.junit.Assert;
import org.junit.Test;

// TODO: Auto-generated Javadoc
/**
 * The Class QuicksortTestCase.
 */
public class QuicksortTestCase {

	/**
	 * Quick Sort Test.
	 */
	@Test
	public void quickSortTest() {
		int outputExpected[] = { 1, 2, 3, 4, 5 };
		int input[] = { 1, 2, 5, 4, 3 };
		int []outputActual = Quicksort.sort(input, 0, input.length-1);
		System.out.print(input);
		Assert.assertArrayEquals(outputExpected, outputActual);
	}

	/**
	 * When input is empty array .
	 */
	@Test
	public void nullTest() {
		try{
		int outputExpected[] ={};
		int input[] = {};
		int []outputActual =Quicksort.sort(input,0, input.length - 1);
		Assert.assertArrayEquals(outputExpected, outputActual);
		}catch(IllegalArgumentException e){
			System.out.print("Array length is 0");
		}
	}

}
