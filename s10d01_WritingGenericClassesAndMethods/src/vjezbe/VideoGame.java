package vjezbe;

public class VideoGame extends Application {
	private String genre;
	private String publisher;
	private int soldCopies;

	/**
	 * @param name
	 * @param year
	 * @param version
	 * @param size
	 * @param genre
	 * @param publisher
	 * @param soldCopies
	 */
	public VideoGame(String name, int year, double version, double size,
			String genre, String publisher, int soldCopies) {
		super(name, year, version, size);
		this.genre = genre;
		this.publisher = publisher;
		this.soldCopies = soldCopies;
	}

	/**
	 * @return the genre
	 */
	public String getGenre() {
		return genre;
	}

	/**
	 * @param genre
	 *            the genre to set
	 */
	public void setGenre(String genre) {
		this.genre = genre;
	}

	/**
	 * @return the publisher
	 */
	public String getPublisher() {
		return publisher;
	}

	/**
	 * @param publisher
	 *            the publisher to set
	 */
	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	/**
	 * @return the soldCopies
	 */
	public int getSoldCopies() {
		return soldCopies;
	}

	/**
	 * @param soldCopies
	 *            the soldCopies to set
	 */
	public void setSoldCopies(int soldCopies) {
		this.soldCopies = soldCopies;
	}

	public String toString() {
		return "\nGenre: " + genre + "\nPublished by: " + publisher
				+ "\nSold copies: " + soldCopies + "\n";
	}
}
