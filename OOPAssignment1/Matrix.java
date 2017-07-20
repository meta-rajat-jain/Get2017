import java.util.Scanner;

/**
 * @author Rajat Jain
 * @version 1.0
 * @Date 19 july 2017
 */

/**
 * The Class Matrix created to perform different functionalities of a Matrix
 */
public class Matrix {

	/** The data which is used to store the matrix */
	protected int data[][];

	/** The number of rows. */
	private int noRows;

	/** The number of columns. */
	private int noCols;
	

	/**
	 * Instantiates a new matrix.
	 *
	 * @param noRows
	 *            The number of rows.
	 * @param noCols
	 *            The number of columns.
	 */
	public Matrix(int noRows, int noCols) {
		try{
			if(noRows<0 || noCols<0){
				throw new IllegalArgumentException("Illegal Array Size");
			}
		
		this.noRows = noRows;
		this.noCols = noCols;
		data = new int[noRows][noCols];
		}catch(IllegalArgumentException e){
			System.out.print(e);
		}
	}

	/**
	 * Adds the elements into the matrix and of the matrix.
	 *
	 * @param noRows
	 *            The number of rows.
	 * @param noCols
	 *            The number of columns.
	 * @param val
	 *            the value
	 */
	public void addElements(int noRows, int noCols, int val) {

		data[noRows][noCols] = val;

	}

	/**
	 * Transpose.
	 *
	 * @return the matrix
	 */
	public Matrix transpose() {
		Matrix trans = new Matrix(noCols, noRows);
		for (int row_index = 0; row_index < trans.noRows; row_index++) {
			for (int col_index = 0; col_index < trans.noCols; col_index++) {
				trans.data[row_index][col_index] = data[col_index][row_index];
			}
		}
		return trans;
	}

	/**
	 * Show.
	 */
	public int[][] show() {
		for (int row_index = 0; row_index < noRows; row_index++) {
			for (int col_index = 0; col_index < noCols; col_index++) {
				System.out.print(data[row_index][col_index] + " ");
			}
			System.out.println();
		}
		return this.data;
	}

	/**
	 * Multiplication.
	 *
	 * @return the matrix
	 */
	public Matrix multiplication(Matrix secondMatrix) {
		Matrix resultMatrix = new Matrix(noRows, noCols);
		if(secondMatrix.noRows == noCols){
		for (int row_index = 0; row_index < noRows; row_index++) {
			for (int col_index = 0;col_index < noCols; col_index++) {
				for (int k = 0; k < noCols; k++) {
					resultMatrix.data[row_index][col_index] = resultMatrix.data[row_index][col_index]
							+ data[row_index][k] * secondMatrix.data[k][col_index];
				}
			}
		}
		return resultMatrix;
		}
		else {
			return secondMatrix;
		}
	}

	/**
	 * The main method.
	 *
	 * @param args
	 *            the arguments
	 */
	public static void main(String args[]) {
		int noRows, noCols;
		Scanner sc = new Scanner(System.in);
		noRows = sc.nextInt();
		noCols = sc.nextInt();
		Matrix matrix = new Matrix(noRows, noCols);
		System.out.println("Enter the value of matrix ");
		for (int row_index = 0; row_index < noRows; row_index++) {
			for (int col_index = 0; col_index < noCols; col_index++) {
				matrix.addElements(row_index, col_index, sc.nextInt());
			}
		}

		Matrix m2 = matrix.transpose();
		m2.show();
		Matrix m4 = new Matrix(noRows, noCols);
		System.out.println("Enter the value of second matrix ");
		for (int row_index = 0; row_index < noRows; row_index++) {
			for (int col_index = 0; col_index < noCols; col_index++) {
				m4.addElements(row_index, col_index, sc.nextInt());
			}
		}
		Matrix m3 = matrix.multiplication(m4);
		m3.show();
		sc.close();
	}

}
