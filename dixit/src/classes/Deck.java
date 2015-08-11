package classes;

import java.util.ArrayList;

/**
 * Represents a deck for DiXit board game.
 * DiXit board game deck contains 84 pictured images.
 * 
 * @author ajla.eltabari
 *
 */
public class Deck {
	private static final int DECK_SIZE = 84;
	private static int card_id = 1;
	private ArrayList<Card> deck = new ArrayList<>();
	
	public Deck() {
		for (int i = 0; i < DECK_SIZE; i++) {
			Card card =  new Card(card_id);
			deck.add(card);
			card_id++;
		}
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Deck [deck=" + deck + "]";
	}
	

}
