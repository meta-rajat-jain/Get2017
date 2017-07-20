/**
 * 
 * @author Rajat Jain
 * @version 1.0
 * @Date 18 july 2017 Assignment 4's Assignment 1 of Tower Of Hanoi
 */

public class NQueens {
	/**
	 * 
	 * @param board
	 * @param row
	 * @param dimension
	 * @return
	 */
	static boolean nQueen(int[][] board, int row, int dimension) {
		// base case : we have already placed n queens
		if (row >= dimension) {
			return true;
		}
		// array to store if ith column in current row is safe
		boolean isSafe[] = new boolean[dimension];
		// make all cols safe initially
		for (int i = 0; i < dimension; i++) {
			isSafe[i] = true;
		}
		// for all rows before currnt row
		for (int r = 0; r < row; r++) {
			for (int c = 0; c < dimension; c++) {
				// there is a queen ar row r col c
				if (board[r][c] == 1) {
					isSafe[c] = false;
					int dr = row - r;
					if (c + dr < dimension) {
						isSafe[c + dr] = false;
					}
					if (c - dr > 0)
						isSafe[c - dr] = false;
					break;
				}
			}
		}
		for (int i = 0; i < dimension; i++) {
			if (isSafe[i]) {
				board[row][i] = 1;
				boolean ans = nQueen(board, row + 1, dimension);
				if (ans)
					return true;
				board[row][i] = 0;
			}
		}
		return false;
	}

	/**
	 * 
	 * @param board
	 * @param row
	 * @param dimension
	 * @return
	 */
	public static boolean[][] queens(int[][] board, int row, int dimension) {
		boolean[][] boards = new boolean[4][4];
		boolean result = nQueen(board, 0, 4);
		System.out.println(result);
		for (int i = 0; i < boards.length; i++) {
			for (int j = 0; j < boards.length; j++) {
				if (board[i][j] == 1) {
					boards[i][j] = true;
				} else {
					boards[i][j] = false;
				}
			}
		}
		for (int i = 0; i < boards.length; i++) {
			for (int j = 0; j < boards.length; j++) {
				System.out.print(boards[i][j]);
			}
			System.out.println();
		}

		return boards;
	}
}