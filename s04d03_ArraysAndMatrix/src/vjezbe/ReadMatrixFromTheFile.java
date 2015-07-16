package vjezbe;

public class ReadMatrixFromTheFile {

	public static void main(String[] args) {
		TextIO.readFile("src/ba/BITCamp/ajla/s04d03/vjezbe/Matrix.txt");

		int n = TextIO.getInt();
		int m = TextIO.getInt();
		
		int[][] matrix = new int[n][m];
		
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				matrix[i][j] = TextIO.getInt();
			}
		}
		
		ArraysHelper.print2DArray(matrix);
	}

}
