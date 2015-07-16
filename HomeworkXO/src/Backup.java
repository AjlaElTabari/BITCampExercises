

import java.util.InputMismatchException;
import java.util.Scanner;

public class Backup {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out
				.println("\nPlease enter the size of the board. Example: enter 3 for 3x3 board, 4 for 4x4 board,... 8 for 8x8 board");
		int boardSize = input.nextInt();

		String[][] board = new String[boardSize][boardSize];
		ArraysHelper.fill2DArray(board);

		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board[i].length; j++) {
				int x = 0, y = 0;
				try {
					System.out.println("\nX, enter coordinates for your move");
					System.out.print("Row: ");
					x = input.nextInt();
					System.out.print("Column: ");
					y = input.nextInt();
					if (board[x][y].equals("-")) {
						board[x][y] = "X";
					} else {
						throw new InputMismatchException();
					}
				} catch (InputMismatchException e) {
					System.out
							.println("Requested space is already taken. Try again.");
					input.nextLine();
				}
				ArraysHelper.print2DArray(board);

				System.out.println("\nO, enter coordinates for your move");
				System.out.print("Row: ");
				x = input.nextInt();
				System.out.print("Column: ");
				y = input.nextInt();
				board[x][y] = "O";

				ArraysHelper.print2DArray(board);
			}
		}
		input.close();
	}
}
