package vjezbe;

import java.util.Scanner;

public class isMatrixSingular {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("\nPlease enter values for your 3x3 matrix");
		int[][] matrix = new int[3][3];
		ArraysHelper.fill2DArrayFromTheConsole(matrix);
		
		if(isSingular(matrix)) {
			System.out.println("Your matrix is singular!");
		} else {
			System.out.println("Your matrix isn't singular!");
		}
		input.close();
	}

	public static boolean isSingular(int[][] m) {
		int d = 0;
		d = (m[0][0] * m[1][1] * m[2][2]) + (m[0][1] * m[1][2] * m[2][0])
				+ (m[0][2] * m[1][0] * m[2][1]) - (m[2][0] * m[1][1] * m[0][2])
				- (m[2][1] * m[1][2] * m[0][0]) - (m[2][2] * m[1][0] * m[0][1]);
		return (d == 0) ? true : false;
	}
}
