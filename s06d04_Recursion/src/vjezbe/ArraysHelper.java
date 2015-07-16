package vjezbe;

import java.util.Scanner;

public class ArraysHelper {

	/**
	 * Printing 2D Array
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
	 * Filling 2D array with values 0 or 1
	 * 
	 * @param array
	 */
	public static void fill2DArray(int[][] array) {
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				array[i][j] = (int)(Math.random() * 2);
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
