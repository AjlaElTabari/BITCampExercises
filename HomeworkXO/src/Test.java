

public class Test {

	public static void main(String[] args) {
		String[][] board = {{"-", "-", "-"}, {"-", "X", "-"}, {"X", "-", "-"}};
		
		for (int m = 0; m < 3; m++) {
			for (int n = 3 - 1; n >= 0; n--) {
				if (!board[m][n].equals("X")) {
					System.out.println("nope");
					break;
				}
			}
		}
		System.out.println("yeeeey");
	}

}
