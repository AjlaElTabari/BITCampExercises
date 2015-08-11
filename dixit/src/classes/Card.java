package classes;

import java.awt.image.BufferedImage;

/**
 * Represents a card for DiXit board game
 * 
 * @author ajla.eltabari
 *
 */
public class Card {
	private int id;
	private BufferedImage image;

	/**
	 * Constructor that makes a card with id, and without any image.
	 * 
	 * @param id
	 */
	public Card(int id) {
		this.id = id;
		this.image = null;
	}
	
	/**
	 * Constructor that makes a card with id, and image.
	 * 
	 * @param id
	 */
	public Card(int id, BufferedImage image) {
		this.id = id;
		this.image = image;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Card [id=" + id + ", image=" + image + "\n]";
	}
}
