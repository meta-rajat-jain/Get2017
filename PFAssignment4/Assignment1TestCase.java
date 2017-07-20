import static org.junit.Assert.*;
import java.util.ArrayList;
import java.util.List;
import org.junit.Before;
import org.junit.Test;

/**
 * @author Rajat Jain
 * @version 1.0
 * @Date 18 july 2017 Assignment 4's Assignment 1 of Tower Of Hanoi
 */

/**
 * The Class Assignment1TestCase.
 */
public class Assignment1TestCase {
	static List<String> output = new ArrayList<String>();
	
	/**
	 * Tower of hanoi case : when 1 disk is given.
	 */
	@Before
	public void setUpClass() {
	output.clear();
	}
	/**
	 * Tower of hanoi case : Test When One Disk Given
	 */
	@Test
	public void testWhenOneDiskGiven(){
		List<String> expected = new ArrayList<String>();
		output=Assignment1.towerOfHanoi("A", "B", "C", 1);
		expected.add("Move Disk 1 From A to B");
		  assertEquals(expected,output);

	}
	/**
	 * Tower of hanoi case : when 2 disk is given.
	 */

	@Test
	public void testWhenTwoDiskGiven(){
	    List<String> expected = new ArrayList<String>();
		output=Assignment1.towerOfHanoi("A", "B", "C", 2);
		expected.add("Move Disk 1 From A to C");
		expected.add("Move Disk 2 From A to B");
		expected.add("Move Disk 1 From C to B");
		  assertEquals(expected,output);

	}
	/**
	 * Tower of hanoi case : when 3 disk is given.
	 */

	@Test
	public void testWhenThreeDiskGiven(){
		List<String> expected = new ArrayList<String>();
		output=Assignment1.towerOfHanoi("A", "B", "C", 3);
		expected.add("Move Disk 1 From A to B");
		expected.add("Move Disk 2 From A to C");
		expected.add("Move Disk 1 From B to C");
		expected.add("Move Disk 3 From A to B");
		expected.add("Move Disk 1 From C to A");
		expected.add("Move Disk 2 From C to B");
		expected.add("Move Disk 1 From A to B");
		  assertEquals(expected,output);

	}
	}
	