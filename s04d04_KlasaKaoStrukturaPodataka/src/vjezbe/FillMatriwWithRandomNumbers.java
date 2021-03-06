package vjezbe;

import java.util.Scanner;


public class FillMatriwWithRandomNumbers {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("\nPlease enter the size of desired matrix");
		System.out.println("How many rows your matrix will have?");
		int rows = input.nextInt();
		System.out.println("How many columns your matrix will have?");
		int cols = input.nextInt();
		int[][] matrix = new int[rows][cols];
		ArraysHelper.fill2DArrayWithRandomValues(matrix);
		ArraysHelper.print2DArray(matrix);
		reverseMatrix(matrix, true);
		
		input.close();
	}

	public static void reverseMatrix(int[][] matrix, boolean rev) {
		if(rev) {
			int[][] revMatrix = new int[matrix.length][matrix[0].length];
			int counterI = 0, counterJ = 0;
			for (int i = matrix.length - 1; i >= 0; i--) {
				counterJ = 0;
				for (int j =  matrix[i].length - 1; j >= 0; j--) {
					revMatrix[counterI][counterJ] = matrix[i][j];
					counterJ++;
				}
				counterI++;
			}
			System.out.println("\nReverse matrix looks like:\n");
			ArraysHelper.print2DArray(revMatrix);
		}
		
	}
}
