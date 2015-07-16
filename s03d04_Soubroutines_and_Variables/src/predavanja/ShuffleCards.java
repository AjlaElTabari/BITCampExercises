package predavanja;

public class ShuffleCards {

	public static void main(String[] args) {
		// new deck
		byte[] cards = new byte[52];
		for (byte i = 0; i < 52; i++) {
			cards [i] = (byte)(i+1);
		}
		// show new deck
		for (byte i = 0; i < 52; i++) {
			int signIndex = cards[i] / 13;
			int num = cards[i] % 13+1;
			char sign = ' ';
			switch (signIndex) {
			case 0:
				sign = 'S';
				break;
			case 1:
				sign = 'B';
				break;
			case 2:
				sign = 'T';
				break;
			case 3:
				sign = 'P';
				break;
			}
			System.out.print(num + "" + sign + " ");
		}
		// 10 times
		for (int shuffleTimes = 0; shuffleTimes < 10; shuffleTimes++) {
			// 15 times 
			for (int switchTimes = 0; switchTimes < 15; switchTimes++) {
				// take a random card (random index)
				int firstCardIndex = (int)(Math.random() * 52);
				// take another random card (random index)
				int secondCardIndex = (int)(Math.random() * 52);
				// switch two random cards
				byte temp = cards[firstCardIndex];
				cards[firstCardIndex] = cards[secondCardIndex];
				cards[secondCardIndex] = temp;
			}
		}
			
			 
		// show cards
		for (byte i = 0; i < 52; i++) {
			System.out.print(cards[i]);
		}
		System.out.println();
		
		// draw first four cards
		for (byte i = 0; i < 4; i++) {
			System.out.print(cards[i]);
		}
		System.out.println();
		
		// Reduce deck
		byte[] reducedDeck = new byte[52-4];
		for (byte i = 0; i < 52 - 4; i++) {
			reducedDeck[i] = cards[i + 4];
		}
		System.out.println();
		
		// show reducedDeck
				for (byte i = 0; i < 52; i++) {
					System.out.println(cards[i]);
				}
	}

}
