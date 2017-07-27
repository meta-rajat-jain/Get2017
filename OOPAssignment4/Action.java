import java.util.Scanner;
/**
 * @author Rajat Jain
 * @version 1.0
 * @Date 26-july-2017
 * @project Menu Driven Application
 */

/**
 * The Class Action.

 */

public class Action {
	
	/** The choice. */
	private int choice;
	
	/**
	 * Instantiates a new action.
	 *
	 * @param choice the choice
	 */
	Action(int choice){
		this.choice = choice;
	}

	
	/**
	 * Perform action.
	 *
	 * @param matrix the matrix
	 * @param noRows the no rows
	 * @param noCols the no columns
	 */
	public void performAction(Matrix matrix,int noRows,int noCols) {
		Scanner scanner=new Scanner(System.in);
		//choose which action would be performed
		switch (choice) {
		case 1: {
			System.out.println("Enter values to be added to Matrix");
			for (int row_index = 0; row_index < noRows; row_index++) {
				for (int col_index = 0; col_index < noCols; col_index++) {
					matrix.addElements(row_index, col_index, scanner.nextInt());
				}
			}
			break;
		}
		case 2: {
			Matrix transposed = matrix.transpose();
			System.out.println("transpose of matrix is:");
			transposed.show();
			break;
		}
		case 3: {
			System.out.println("Enter the row and column for second Matrix");
					int noRow = scanner.nextInt();
					int noCol = scanner.nextInt();
					Matrix secondMatrix = new Matrix(noRow,noCol);
					System.out.println("Enter values of Matrix to be multiplied with ");
					for (int row_index = 0; row_index < noRows; row_index++) {
						for (int col_index = 0; col_index < noCols; col_index++) {
							secondMatrix.addElements(row_index, col_index, scanner.nextInt());
						}
					}
					Matrix multiplied = matrix.multiplication(secondMatrix);
					multiplied.show();
					break;
		}
		case 4: {
			matrix.show();
			break;
		}
		case 5: {
			System.exit(0);
		}
		}
	}
}
