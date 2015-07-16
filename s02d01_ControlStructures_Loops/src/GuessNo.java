
import java.util.Scanner;

public class GuessNo {

	public static void main(String[] args) {
		int randomNo = (int) (Math.random() * 100);
		int guess;

		Scanner input = new Scanner(System.in);
		System.out.println("Pogodite broj");
		do {
			guess = input.nextInt();
			if (randomNo == guess) {
				System.out.println("Pogodak! Zamisljeni broj je " + guess);
			} else if (randomNo < guess) {
				System.out.println("Zamisljeni broj je manji od unesenog");
			} else
				System.out.println("Zamisljeni broj je veci od unesenog");
		} while (randomNo != guess);
		input.close();
	}
}
