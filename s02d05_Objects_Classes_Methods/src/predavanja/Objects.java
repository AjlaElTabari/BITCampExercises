package predavanja;

import models.Planet;


;

public class Objects {

	public static void main(String[] args) {

		Planet pl = new Planet(1000, 600, "lopta", "Pluton");
		pl.dodajMasu(80);
		pl.dodajMasu(40);

		System.out.println("PL: nova masa: " + pl.vrijednostMase()
				+ ", a njena nova tezina je " + pl.racunajTezinu());

		Planet bl = new Planet(800, 300, "elipsa", "mojNoviPlanet");
		bl.dodajMasu(30);
		bl.dodajMasu(70);
		bl.dodajMasu(-40);
		bl.dodajMasu(80);

		System.out.println("BL: nova masa: " + bl.vrijednostMase()
				+ ", a njena nova tezina je " + bl.racunajTezinu());
	}

}
