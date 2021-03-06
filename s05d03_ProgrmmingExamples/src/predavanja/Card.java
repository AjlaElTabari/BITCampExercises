package predavanja;

/**
 * Represents a gaming card from standard deck
 * 
 * @author ajla.eltabari
 *
 */
public class Card {
	public static final int MIN_VALUE = 0; 
	public static final int MAX_VALUE = 13; 
	public static final int MIN_SUIT = 0; 
	public static final int MAX_SUIT = 4; 
	
	public static final int HEART = 0; 
	public static final int DIAMOND = 1; 
	public static final int CLUB = 2; 
	public static final int SPADE = 3; 
	public static final int JOKER = 4; 
	

	public static final int ACE = 1; 
	public static final int JACK = 11; 
	public static final int QUEEN = 12; 
	public static final int KING = 13; 
	
	private int value;
	private int suit;
	private boolean isJoker = false;

	/**
	 * Constructor
	 * 
	 * @param value
	 * @param suit
	 */
	public Card(int value, int suit) throws IllegalArgumentException {
		if (value < MIN_VALUE || value > MAX_VALUE) {
			throw new IllegalArgumentException("Value must be in range 1 to 13");
		}
		if (suit < MIN_SUIT || suit > MAX_SUIT) {
			throw new IllegalArgumentException("Suit has to be in range 0 to 4");
		}
		this.value = value;
		this.suit = suit;
		if (suit == JOKER) {
			this.isJoker = true;
		}
	}
	
	/**
	 * Constructor
	 * For declaration of JOKER card
	 */
	public Card() {
		this.value = 0;
		this.suit = JOKER;
		this.isJoker = true;
	}

	// Getters and Setters
	/**
	 * @return the value
	 */
	public int getValue() {
		return value;
	}

	/**
	 * @param value
	 *            the value to set
	 */
	public void setValue(int value) {
		if (!isJoker) {
			throw new UnsupportedOperationException("Can't change the value of a non Joker");
		}
		if (value < MIN_VALUE || value > MAX_VALUE) {
			throw new IllegalArgumentException("Value must be in range 1 to 13");
		}
		this.value = value;
	}

	/**
	 * @return the suit
	 */
	public int getSuit() {
		return suit;
	}

	/**
	 * @param suit
	 *            the suit to set
	 */
	public void setSuit(int suit) {
		if(!isJoker) {
			throw new UnsupportedOperationException("Can't change the value of a non Joker");
		}
		if (suit < MIN_SUIT || suit > MAX_SUIT) {
			throw new IllegalArgumentException("Suit has to be in range 0 to 4");
		}
		this.suit = suit;
	}

	/**
	 * In the program, cards are represented by numbers from 1 to 13, 
	 * 1 represents both, 1 and 11. 
	 * 
	 * @return String that represents value of the card
	 */
	public String getCardValue() {
		// Presenting values of cards to user
		// Values between 1 and 10 representing number of cards
		if (value > 1 || value <= 10) {
			return Integer.toString(value);
		}
		switch (value) {
		case ACE:
			return "Ace";
		case JACK:
			return "Jack";
		case QUEEN:
			return "Queen";
		case KING:
			return "King";
		default: 
			return "";
		}
	}
	
	/**
	 * In the program, suits are represented by numbers from 0 to
	 * 3 suit 0 - Hearts, 1 - Diamonds, 2 - Clubs, 3 - Spades, and 4 - Joker
	 * 
	 * @return String that represents value of the card
	 */
	public String getCardSuit() {

		// Presenting cards suit
		switch (suit) {
		case HEART:
			return "Heart";
		case DIAMOND:
			return "Diamond";
		case CLUB:
			return "Club";
		case SPADE:
			return "Spade";
		default: 
			return "Joker";
		}
	}
	
	/**
	 * Gets final representation of the card as String
	 * @return
	 */
	public String getCard() {
		return getCardValue() + " " + getCardSuit();
	}

}
