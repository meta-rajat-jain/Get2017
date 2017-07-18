

	import org.junit.Assert;
	import org.junit.Test;

	public class assignment2UnitTest {
		//returns positive or passed Test Case
		@Test
		public void whenDuplicatesAreRemovedSuccessfully(){
			assignment2 unitTest=new assignment2();
			
			int [] input={1,2,1,4,5,4};
			int [] expectedOutput = {1,2,4,5};
			int [] actualOutput=unitTest.removeDuplicate(input);
			Assert.assertArrayEquals(expectedOutput, actualOutput);
			}
		//returns negative or failed test case
		@Test
		public void whenDuplicatesAreNotRemovedSuccessfully(){
			assignment2 unitTest=new assignment2();
			
			int [] input={1,2,1,1,2,2};
			int [] expectedOutput = {1,2,2};
			int [] actualOutput=unitTest.removeDuplicate(input);
			Assert.assertArrayEquals(expectedOutput, actualOutput);
			}
		//when all the input are same
		@Test
		public void whenAllTheInputAreSame(){
			assignment2 unitTest=new assignment2();
			
			int [] input={1,1,1,1,1,1};
			int [] expectedOutput = {1};
			int [] actualOutput=unitTest.removeDuplicate(input);
			Assert.assertArrayEquals(expectedOutput, actualOutput);
			}
	}

