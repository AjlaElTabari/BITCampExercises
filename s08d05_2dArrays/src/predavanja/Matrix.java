package predavanja;

public class Matrix {

	public static void main(String[] args) {
		int[][] matrix = new int[4][5];
		
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				matrix[i][j] = i + 10 + j;
			}
		}
		
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				if (j != 0) {
					System.out.print("| " + matrix[i][j] + " ");
				} else {
					System.out.print(matrix[i][j] + " ");
				}
			}
			System.out.println();
		}

	}

}
