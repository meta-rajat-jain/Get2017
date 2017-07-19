
import static org.junit.Assert.*;
import org.junit.Test;
/**
 * This class will test the class NQueen.
 *
 * @author Rajat Jain
 * @version1.10 19 Jul 2017
 */
 /**
  * Class description
  *
  */
public class NQueensTestCase {
	/** The testQueen. object of class NQueen */
	/**
	 * Test 1. This will test when n is 4
	 */
	@Test
	public void forNE4() {
		int n = 4;
		int[][] board = new int[4][4];
		boolean[][] actual = NQueens.queens(board, 0, n - 1);
		boolean[][] expected = { { false, true, false, false },
				{ false, false, false, true }, { true, false, false, false },
				{ false, false, true, false } };
		assertArrayEquals(expected, actual);
	}
}
