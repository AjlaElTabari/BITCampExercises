package predavanja;

public class RollingDice {

	public static void main(String[] args) {
		int d6 = (int)(Math.random() * 6) + 1;
		int d8 = (int)(Math.random() * 8) + 1;
		int d10 = (int)(Math.random() * 12) + 1;
		int d12 = (int)(Math.random() * 12) + 1;
		int d20 = (int)(Math.random() * 20) + 1;
		
		System.out.printf("\n\nWe rolled 4 dices, results are: \n\n d6: %d \n d8: %d \n d10: %d \n d12: %d \n d20: %d ", d6, d8, d10, d12, d20);

	}

}
