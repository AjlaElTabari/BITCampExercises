package vjezbe;

public class Minesweeper {

	public static void main(String[] args) {
		TextIO.readFile("src/ba/BITCamp/ajla/s04d03/vjezbe/Minesweeper.txt");

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
		
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				if (matrix[i][j] == -1) {
					try {
						matrix[i - 1][j - 1] += (matrix[i - 1][j - 1] != -1) ? 1 : 0;
					} catch (IndexOutOfBoundsException e) {
					}
					try {
						matrix[i - 1][j] += (matrix[i - 1][j] != -1) ? 1 : 0;
					} catch (IndexOutOfBoundsException e) {
					}
					try {
						matrix[i - 1][j + 1] += (matrix[i - 1][j + 1] != -1) ? 1 : 0;
					} catch (IndexOutOfBoundsException e) {
					}
					
					try {
						matrix[i][j - 1] += (matrix[i][j - 1] != -1) ? 1 : 0;
					} catch (IndexOutOfBoundsException e) {
					}
					try {
						matrix[i][j + 1] += (matrix[i][j + 1] != -1) ? 1 : 0;
					} catch (IndexOutOfBoundsException e) {
					}
					try {
						matrix[i + 1][j - 1] += (matrix[i + 1][j - 1] != -1) ? 1 : 0;
					} catch (IndexOutOfBoundsException e) {
					}
					try {
						matrix[i + 1][j] += (matrix[i + 1][j] != -1) ? 1 : 0;
					} catch (IndexOutOfBoundsException e) {
					}
					try {
						matrix[i + 1][j + 1] += (matrix[i + 1][j + 1] != -1) ? 1 : 0;
					} catch (IndexOutOfBoundsException e) {
					}
				}
			}
		}
		
		ArraysHelper.print2DArray(matrix);

	}

}
