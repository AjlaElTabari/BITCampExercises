

import java.util.InputMismatchException;
import java.util.Scanner;

public class PlayXO {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		// Printing instructions for the game
		// Asking user to define size of the board
		while(true){
			try {
				System.out
						.println("\nPlease enter the size of the board. Example: enter 3 for 3x3 board, 4 for 4x4 board,... 8 for 8x8 board..");
				int boardSize = input.nextInt();
	
				// declaration of 2D array that will represent our TicTacToe board
				String[][] board = new String[boardSize][boardSize];
				// Filling the board with "-" to mark all available spaces and to
				// avoid appearing nulls and confusing user
				ArraysHelper.fill2DArray(board);
				ArraysHelper.print2DArray(board);
	
				// Until the board is full, or the winner is declared, users
				// entering coordinates for their symbols
				while (!ArraysHelper.isFull(board)) {
					// X player's move
					XOHelper.play(board, "X");
					ArraysHelper.print2DArray(board);
	
					// Checking for victory for X player
					if (XOHelper.checkForVictory(board, "X")) {
						System.out.println("Congratulations! X won!");
						break;
					}
					
					if (!ArraysHelper.isFull(board)) {
						// O player's move
						XOHelper.play(board, "O");
						ArraysHelper.print2DArray(board);
	
						// Checking for victory for O player
						if (XOHelper.checkForVictory(board, "O")) {
							System.out.println("Congratulations! O won!");
							break;
						}
					}
				}
				System.out.println("Game over!");
				break;
			} catch (InputMismatchException e) {
				System.out.println("Wrong input. Try again.");
				input.nextLine();
			}
		}
		input.close();
	}

}
