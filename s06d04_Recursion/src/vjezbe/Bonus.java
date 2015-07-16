package vjezbe;

public class Bonus {

	public static void main(String[] args) {
		int[][] matrix = new int[10][10];
		ArraysHelper.fill2DArray(matrix);
		ArraysHelper.print2DArray(matrix);
		System.out.println();
		paint(matrix, 6, 3);
		ArraysHelper.print2DArray(matrix);
	}
	
	public static void paint(int[][] matrix, int x, int y) {
		if(x < 0 || x > 9 || y < 0 || y > 9) {
			return;
		}
		if (matrix[x][y] == 0) {
			matrix[x][y] = 1;
			paint(matrix, x + 1, y);
			paint(matrix, x - 1, y);
			paint(matrix, x, y + 1);
			paint(matrix, x, y - 1);
		}
		return;
	}

}