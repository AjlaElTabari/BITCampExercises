package vjezbe;

import java.util.Date;

public class IgricaTablicaMnzenja {

	public static void main(String[] args) {
		int bodovi = 0;
		boolean areYouReallyThatSmart = true;
		int a = 0, b = 0;
		int c = 0;
		while (bodovi < 6) {
			a = (int) (Math.random() * 10) + 1;
			b = (int) (Math.random() * 10) + 1;
			
			TextIO.put(a + " * " + b + " = ");
			c = TextIO.getInt();

			if (a * b == c) {
				bodovi++;
			} else {
				areYouReallyThatSmart = false;
			}
		}

		if (areYouReallyThatSmart) {
			for (int i = 1; i <= 10; i++) {
				a = (int) (Math.random() * 100) - 50;
				b = (int) (Math.random() * 100) - 50;

				TextIO.put(a + " * " + b + " = ");
				c = TextIO.getInt();

				if (a * b == c) {
					bodovi++;
				}
			}
		}
		// else {
		// for(int i = 1; i <= 10; i++){
		// a = (int)(Math.random() * 10) +1;
		// b = (int)(Math.random() * 10) + 1;
		//
		// TextIO.put(a + " * " + b + " = ");
		// c = TextIO.getInt();
		//
		// if (a * b == c) {
		// bodovi++;
		// }
		// }
		// }

		TextIO.putln();
		TextIO.readFile("src/ba/BITCamp/ajla/s02d04/vjezbe/text.txt");
		String dateTime = TextIO.getln();
		int highScore = TextIO.getInt();
		if (bodovi > highScore) {
			TextIO.writeFile("src/ba/BITCamp/ajla/s02d04/vjezbe/text.txt");
			Date date = new Date();
			TextIO.putln(date);
			TextIO.put(bodovi);
			TextIO.writeStandardOutput();
			TextIO.putln("Postigli ste high score! Prethodni najbolji rezultat je bio "
					+ highScore
					+ " postignut "
					+ dateTime
					+ " , a vi ste svojili " + bodovi + " bodova");
		} else {
			TextIO.writeStandardOutput();
			TextIO.putln("NISTE postigli high score! Prethodni najbolji rezultat je bio "
					+ highScore
					+ " postignut "
					+ dateTime
					+ " , a vi ste svojili " + bodovi + " bodova");
		}

	}

}
