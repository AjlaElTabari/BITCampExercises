package predavanja;

import java.util.Arrays;
import java.util.Random;

public class RollTheDice {

	public static void main(String[] args) {
		int[] results = new int[13];
		
		int dice1 = 0;
		int dice2 = 0;
		
		for (int i = 0; i < 36000; i++) {
			Random rand = new Random();
			dice1 = rand.nextInt(6) + 1;
			dice2 = rand.nextInt(6) + 1;
			
			System.out.println(dice1 + " " + dice2);
			
			if((dice1 + dice2 - 1) >= 0) {
				results[(dice1 + dice2) - 1] = results[(dice1 + dice2) - 1] + 1;
			}
		}
		
		System.out.println(Arrays.toString(results));

	}

}
