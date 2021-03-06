package predavanja;

import java.util.Arrays;

public class Matrix {

	public static void main(String[] args) {
		int[] arr = {1, 2, 3, 4, 5};
		print1DArray(arr);
		System.out.println();
		System.out.println();
		
		int[][] matrix = new int[4][5];
		fill2DArray(matrix);
		print2DArray(matrix);
		System.out.println();
		
		System.out.println(Arrays.toString(get2DArrayColumn(matrix, 1)));

	}

	public static void print2DArray(int[][] array) {
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				System.out.printf("%2d ", array[i][j]);
			}
			System.out.println();
		}
	}
	
	/**
	 * Filling 2D array with values from 1 to...
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
	 * Printing D2 array
	 * @param array
	 */
	public static void print1DArray(int[] array) {
		for (int i = 0; i < array.length; i++) {
			System.out.printf("%2d ", array[i]);
		}
	}
	
	/**
	 * Getting 2D array column
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
