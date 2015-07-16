

import java.util.Scanner;

public class ArraysHelper {

	/**
	 * Printing 2D Array of ints
	 * @param array
	 */
	public static void print2DArray(int[][] array) {
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				System.out.printf("%2d ", array[i][j]);
			}
			System.out.println();
		}
	}
	
	/**
	 * Printing 2D Array of Strings
	 * @param array
	 */
	public static void print2DArray(String[][] array) {
		System.out.println();
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				System.out.printf("%5s ", array[i][j]);
			}
			System.out.println();
		}
	}
	
	public static boolean isFull(String[][] array) {
		boolean isBoardFull = true;
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				if(array[i][j].equals("-")) {
					isBoardFull = false;
					break;
				}
			}
		}
		return isBoardFull;
	}
	
	/**
	 * Filling 2D array with values from 1 to...
	 * 
	 * @param array
	 */
	public static void fill2DArray(int[][] array) {
		int counter = 1;
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				array[i][j] = counter++;
			}
		}
	}
	
	/**
	 * Filling 2D array with "-"
	 * 
	 * @param array
	 */
	public static void fill2DArray(String[][] array) {
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				array[i][j] = "-";
			}
		}
	}

	/**
	 * Filling matrix with random numbers from [1 - 10]
	 * @param array
	 */
	public static void fill2DArrayWithRandomValues(int[][] array) {
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				array[i][j] = (int)(Math.random() * 10 + 1);
			}
		}
	}
	/**
	 * Filling 2D array with values from the console
	 * 
	 * @param array
	 */
	public static void fill2DArrayFromTheConsole(int[][] array) {
		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				System.out.println("What number should be on location: [" + i
						+ ", " + j + "]");
				array[i][j] = in.nextInt();
			}
		}
	}

	/**
	 * Printing 12 array
	 * 
	 * @param array
	 */
	public static void print1DArray(int[] array) {
		for (int i = 0; i < array.length; i++) {
			System.out.printf("%2d ", array[i]);
		}
	}

	/**
	 * Getting 2D array column
	 * 
	 * @param arr
	 * @param col
	 * @return 1D array that represents desired column
	 */
	public static int[] get2DArrayColumn(int arr[][], int col) {
		int res[] = new int[arr.length];
		for (int i = 0; i < arr.length; i++) {
			res[i] = arr[i][col];
		}
		return res;
	}
}
