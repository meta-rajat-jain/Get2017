


	import org.junit.Assert;
	import org.junit.Test;

	public class assignment5UnitTest {
		//when the input is unsorted
		@Test
		public void whenUnsortedArray(){
			assignment5 unitTest=new assignment5();
			int [] input={1,2,3,2,1};
			int num=unitTest.arraySorting(input);
			Assert.assertEquals(0,num);
			}
		//when the input is sorted in ascending
		@Test
		public void whenSortedInAscending(){
			assignment5 unitTest=new assignment5();
			int [] input={1,2,3,4,5};
			int num=unitTest.arraySorting(input);
			Assert.assertEquals(1,num);
			}
		//when the input is sorted in descending
		@Test
		public void whenSortedInDescending(){
			assignment5 unitTest=new assignment5();
			int [] input={6,5,4,3,2};
			int num=unitTest.arraySorting(input);
			Assert.assertEquals(2,num);
			}
		//special case--when input value is repeated
		@Test
		public void whenInputValueIsRepeated(){
			assignment5 unitTest=new assignment5();
			int [] input={1,1,2,2,3};
			int num=unitTest.arraySorting(input);
			Assert.assertEquals(1,num);
			}
		
		
		}
		
	

