import org.junit.Assert;
import org.junit.Test;

// TODO: Auto-generated Javadoc
/**
 * The Class MatrixTestCase.
 */
public class MatrixTestCase {

	/**
	 * Test multiply.
	 */
	// this test will check the multiplication of two square matrices
	@Test
	public void testMultiply() {
		Matrix object = new Matrix(3, 3);
		int k = 0;
		for (int index = 0; index < 3; index++) {
			for (int jindex = 0; jindex < 3; jindex++) {
				object.addElements(index, jindex, ++k);
			}
		}
		Matrix obj = new Matrix(3, 3);
		k = 0;
		for (int index = 0; index < 3; index++) {
			for (int jindex = 0; jindex < 3; jindex++) {
				obj.addElements(index, jindex, ++k);
			}
		}
		Matrix result = object.multiplication(obj);
		int expected[][] = { { 30, 36, 42 }, { 66, 81, 96 }, { 102, 126, 150 } };
		Assert.assertArrayEquals(expected, result.data);
	}

	/**
	 * Test multiply 2.
	 */
	/* this test will check multiplication of two matrices with different rows
	 and columns*/
	@Test
	public void testMultiply2() {
		Matrix object = new Matrix(3, 3);
		int k = 0;
		for (int index = 0; index < 3; index++) {
			for (int jindex = 0; jindex < 3; jindex++) {
				object.addElements(index, jindex, ++k);
			}
		}
		Matrix obj = new Matrix(2, 3);
		k = 0;
		for (int index = 0; index < 2; index++) {
			for (int jindex = 0; jindex < 3; jindex++) {
				obj.addElements(index, jindex, ++k);
			}
		}
		Matrix result = object.multiplication(obj);
		int expected[][] = { { 1, 2, 3 }, { 4, 5, 6 } };
		Assert.assertArrayEquals(expected, result.data);
	}

	/**
	 * Test transpose.
	 */
	// this test will check the transpose of a matrix
	@Test
	public void testTranspose() {
		Matrix object = new Matrix(2, 3);
		int k = 0;
		for (int index = 0; index < 2; index++) {
			for (int jindex = 0; jindex < 3; jindex++) {
				object.addElements(index, jindex, ++k);
			}
		}
		Matrix obj = object.transpose();
		int expected[][] = { { 1, 4 }, { 2, 5 }, { 3, 6 } };
		Assert.assertArrayEquals(expected, obj.data);
	}
}