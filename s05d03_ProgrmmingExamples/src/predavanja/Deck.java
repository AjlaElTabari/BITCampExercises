package predavanja;

import java.util.Random;

public class Deck {
	private Card[] deck;
	private int numberOfDealtCards = 0;

	public Deck(boolean includeJockers) {
		if (includeJockers) {
			this.deck = new Card[54];
			deck[52] = new Card();
			deck[53] = new Card();
			generateDeck();
		} else {
			this.deck = new Card[52];
			generateDeck();
		}
	}

	private void generateDeck() {
		int counter = 0;
		for (int j = Card.ACE; j <= Card.KING; j++) {
			deck[counter++] = new Card(j, Card.HEART);
			deck[counter++] = new Card(j, Card.CLUB);
			deck[counter++] = new Card(j, Card.SPADE);
			deck[counter++] = new Card(j, Card.DIAMOND);
		}
	}

	public void shuffleDeck() {
		Random rand = new Random();
		for (int i = 0; i < deck.length; i++) {
			int first = rand.nextInt(deck.length);
			int second = rand.nextInt(deck.length);
			Card temp = deck[first];
			deck[first] = deck[second];
			deck[second] = temp;
		}
	}
	
	public int getRemainingCards() {
		return deck.length - numberOfDealtCards;
	}
	
	public boolean isEmpty() {
		return getRemainingCards() == 0;
	}
	
	public Card dealCard() {
		if (isEmpty()) {
			throw new UnsupportedOperationException("Deck is empty");
		}
		return deck[numberOfDealtCards++];
	}

}
