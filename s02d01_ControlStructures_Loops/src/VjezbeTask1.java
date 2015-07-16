
import java.util.Scanner;

public class VjezbeTask1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int starsNo = input.nextInt();
		int counter = 1;
		
		while (counter <= starsNo) {
			System.out.println("*");
			counter++;
		}

		input.close();
	}

}
