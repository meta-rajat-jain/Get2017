

	import org.junit.Assert;
	import org.junit.Test;

	public class assignment1UnitTest {
		//returns positive or passed Test Case
		@Test
		public void whenBinaryIsConvertedSuccessfully(){
			assignment1 unitTest=new assignment1();
			int octnum=unitTest.binaryToOctal(Integer.parseInt("000100"));
			Assert.assertEquals(04,octnum);
			}
		//returns negative or failed test case
		@Test
		public void whenBinaryIsNotConvertedSuccessfully(){
			assignment1 unitTest=new assignment1();
			int octnum=unitTest.binaryToOctal(Integer.parseInt("110011"));
			Assert.assertEquals(36,octnum);
		}
		
		
	}

