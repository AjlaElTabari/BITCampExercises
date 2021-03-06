package vjezbe;

public class Song {

	// constants for music genre
	public static final int ROCK = 0;
	public static final int METAL = 1;
	public static final int JAZZ = 2;
	
	// attributes
	private String title;
	private String author;
	private int yearPublished;
	private int genre;
	
	
	/**
	 * CONSTRUCTOR
	 * @param title
	 * @param author
	 * @param yearPublished
	 * @param genre
	 */
	public Song(String title, String author, int yearPublished, int genre) {
		super();
		this.title = title;
		this.author = author;
		this.yearPublished = yearPublished;
		this.genre = genre;
	}
	

	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Song other = (Song) obj;
		if (author == null) {
			if (other.author != null)
				return false;
		} else if (!author.equals(other.author))
			return false;
		if (genre != other.genre)
			return false;
		if (title == null) {
			if (other.title != null)
				return false;
		} else if (!title.equals(other.title))
			return false;
		if (yearPublished != other.yearPublished)
			return false;
		return true;
	}
	
	public String toString() {
		return title + "\n" + author + "\n(" + yearPublished + ")\n" + getGenre(genre) + "\n";
	}
	
	public String getGenre(int genre) {
		switch(genre) {
		case 0:
			return "Rock";
		case 1:
			return "Metal";
		case 2: 
			return "Jazz";
		}
		return "";
	}
}
