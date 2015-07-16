package vjezbe;

public class VjezbeTextIO {

	public static void main(String[] args) {
		
		for (int i = -1; i <= 9; i++) {
			for (int j = -1; j <= 9; j++) {
				if (i == -1 && j == -1) {
					System.out.print("  *");
				}
				else if (i == 0) {
					System.out.print("  _");
				}
				else if (j == 0) {
					System.out.print("|");
				}
				else if (i > 0 && j > 0){
					System.out.printf("%2d ", i*j);
				}
				else
					System.out.printf("%2d ", -i*j);
			}
			System.out.println();
		}
		
	}

}
