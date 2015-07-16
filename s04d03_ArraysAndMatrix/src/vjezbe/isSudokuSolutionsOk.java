package vjezbe;

public class isSudokuSolutionsOk {

	public static void main(String[] args) {
		TextIO.readFile("src/ba/BITCamp/ajla/s04d03/vjezbe/Sudoku.txt");

		int n = TextIO.getInt();
		int m = TextIO.getInt();
		
		int[][] matrix = new int[n][m];
		
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				matrix[i][j] = TextIO.getInt();
			}
		}

		ArraysHelper.print2DArray(matrix);
		System.out.println();
		
		for (int i = 0; i < 9; i++) {
			if (!getRowsSum(matrix, i)) {
			System.out.println("This is not valid Sudoku solution!");
			System.exit(0);
			}
		}
		
		for (int i = 0; i < 9; i++) {
			if (!getColmSum(matrix, i)) {
			System.out.println("This is not valid Sudoku solution!");
			System.exit(0);
			}
		}
		int[] sq1 = new int[9]; int[] sq4 = new int[9]; int[] sq7 = new int[9];  
		int[] sq2 = new int[9]; int[] sq5 = new int[9]; int[] sq8 = new int[9];
		int[] sq3 = new int[9]; int[] sq6 = new int[9]; int[] sq9 = new int[9];
		int c1 = 0, c2 = 0, c3 = 0, c4 = 0, c5 = 0, c6 = 0, c7 = 0, c8 = 0, c9 = 0;
		
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				
				if((i >= 0 && i <= 2) && (j >= 0 && j <= 2 )) {
					sq1[c1] = matrix[i][j];
					c1++;
				}
				if((i >= 0 && i <= 2) && (j >= 3 && j <= 5 )) {
					sq2[c2] = matrix[i][j];
					c2++;
				}
				if((i >= 0 && i <= 2) && (j >= 6 && j <= 8 )) {
					sq3[c3] = matrix[i][j];
					c3++;
				}
				if((i >= 3 && i <= 5) && (j >= 0 && j <= 2 )) {
					sq4[c4] = matrix[i][j];
					c4++;
				}
				if((i >= 3 && i <= 5) && (j >= 3 && j <= 5 )) {
					sq5[c5] = matrix[i][j];
					c5++;
				}
				if((i >= 3 && i <= 5) && (j >= 5 && j <= 8 )) {
					sq6[c6] = matrix[i][j];
					c6++;
				}
				if((i >= 5 && i <= 8) && (j >= 0 && j <= 2 )) {
					sq7[c7] = matrix[i][j];
					c7++;
				}
				if((i >= 5 && i <= 8) && (j >= 3 && j <= 5 )) {
					sq8[c8] = matrix[i][j];
					c8++;
				}
				if((i >= 5 && i <= 8) && (j >= 5 && j <= 8 )) {
					sq9[c9] = matrix[i][j];
					c9++;
				}
			}
		}
		if (!getArraySum(sq1)) {
			System.out.println("This is not valid Sudoku solution!");
			System.exit(0);
		}

		if (!getArraySum(sq2)) {
			System.out.println("This is not valid Sudoku solution!");
			System.exit(0);
		}
		if (!getArraySum(sq3)) {
			System.out.println("This is not valid Sudoku solution!");
			System.exit(0);
		}
		if (!getArraySum(sq4)) {
			System.out.println("This is not valid Sudoku solution!");
			System.exit(0);
		}
		if (!getArraySum(sq5)) {
			System.out.println("This is not valid Sudoku solution!");
			System.exit(0);
		}
		if (!getArraySum(sq6)) {
			System.out.println("This is not valid Sudoku solution!");
			System.exit(0);
		}
		if (!getArraySum(sq7)) {
			System.out.println("This is not valid Sudoku solution!");
			System.exit(0);
		}
		if (!getArraySum(sq8)) {
			System.out.println("This is not valid Sudoku solution!");
			System.exit(0);
		}
		if (!getArraySum(sq9)) {
			System.out.println("This is not valid Sudoku solution!");
			System.exit(0);
		}
		

		System.out.println("This is valid Sudoku solution!");
	}

	public static boolean getRowsSum (int[][] arr, int col) {
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i][col];
		}
		return (sum == 45) ? true : false;
	}
	
	public static boolean getColmSum (int[][] arr, int row) {
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum += arr[row][i];
		}
		return (sum == 45) ? true : false;
	}
	
	public static boolean getArraySum (int[] arr) {
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		return (sum == 45) ? true : false;
	}
}
