

import java.util.InputMismatchException;
import java.util.Scanner;

public class XOHelper {
	
	/**
	 * <b> Simulates playing TicTacToe game </b>
	 * <p>
	 * When player enters coordinates for his move, that space is already taken, if it is, 
	 * asks user to choose another location, if it is not place that user's symbol on desired space
	 * 
	 * @param board 2D array that represents current status of the board
	 * @param player X or 0
	 */
	public static void play(String[][] board, String player) {
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		while (true) {
			try {
				System.out.println("\n" + player + ", enter coordinates for your move");
				int x = 0, y = 0;
				System.out.print("Row: ");
				x = input.nextInt();
				System.out.print("Column: ");
				y = input.nextInt();
				if (board[x][y].equals("-")) {
					board[x][y] = player;
				} else {
					throw new InputMismatchException();
				} break;
			} catch (InputMismatchException e) {
				System.out
				.println("Requested space is already taken, or wrong input. Try again.");
				input.nextLine();
			} catch (IndexOutOfBoundsException e) {
				System.out
				.println("Unexisting index. Try again.");
				input.nextLine();
			}
		}
	}
	
	/**
	 * Checks for victory. Compound of methods that are checking for separate victories:
	 * <b>checkForVictoryInRows(String board[][], String player) </br>
	 * checkForVictoryInColumns(String board[][], String player) </br>
	 * checkForVictoryInDiagonal1(String board[][], String player) </br>
	 * checkForVictoryInDiagonal2(String board[][], String player) </br></b>
	 * 
	 * @param board 2D array that represents current status of the board
	 * @param player X or 0
	 * @return true if there is a victory for current player, and false if there is not
	 */
	public static boolean checkForVictory(String[][] board, String player) {
		if (checkForVictoryInColumns(board, player)
				|| checkForVictoryInRows(board, player)
				|| checkForVictoryInDiagonal1(board, player)
				|| checkForVictoryInDiagonal2(board, player)) {
			return true;
		}
		return false;
	}
	
	/**
	 * Check for victory in the row. 
	 * @param board 2D array that represents current status of the board
	 * @param player X or 0
	 * @return true if there is a row where all symbols belong to current player
	 */
	public static boolean checkForVictoryInRows(String board[][], String player) {
		boolean victory = true;
		int counter = 0;
		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board.length; j++) {
				if (!board[counter][j].equals(player)) {
					victory = false;
				}
			}
			if (victory) {
				return victory;
			} else {
			counter++;
			}
		}
		return victory;
	}
	
	/**
	 * Check for victory in the column. 
	 * @param board 2D array that represents current status of the board
	 * @param player X or 0
	 * @return true if there is a column where all symbols belong to current player
	 */
	public static boolean checkForVictoryInColumns(String board[][], String player) {
		boolean victory = true;
		int counter = 0;
		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board.length; j++) {
				if (!board[j][counter].equals(player)) {
					victory = false;
				}
			}
			if (victory) {
				return victory;
			} else {
			counter++;
			}
		}
		return victory;
	}

	/**
	 * Check for victory in the left diagonal. 
	 * @param board 2D array that represents current status of the board
	 * @param player X or 0
	 * @return true if in left diagonal all symbols belong to current player
	 */
	public static boolean checkForVictoryInDiagonal1(String board[][],
			String player) {
		for (int k = 0; k < board.length; k++) {
			for (int l = 0; l < board.length; l++) {
				if (k == l) {
					if (!board[l][k].equals(player)) {
						return false;
					}
				}
			}
		}
		return true;
	}

	/**
	 * Check for victory in the right diagonal. 
	 * @param board 2D array that represents current status of the board
	 * @param player X or 0
	 * @return true if in right diagonal all symbols belong to current player
	 */
	public static boolean checkForVictoryInDiagonal2(String board[][],
			String player) {
		for (int m = 0; m < board.length; m++) {
			for (int n = board.length - 1; n >= 0; n--) {
				if(m + n == board.length - 1) {
					if (!board[m][n].equals(player)) {
					return false;
					}
				}
			}
		}
		return true;
	}
	
}
