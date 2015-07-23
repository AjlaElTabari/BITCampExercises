package museum;

/**
 * Represents an artpiece in the museum.
 * Extends Showpiece class and adds some additional attributes.
 * @author ajla.eltabari
 *
 */
public class Artpiece extends Showpiece implements Searchable {
	public enum Period {RENAISSANCE, NEO_CLASSICS, MODERN, CONTEMPORARY_ART};
	private String author;
	private Period period;
	
	/**
	 * Constructor
	 * @param id
	 * @param name
	 * @param description
	 * @param author
	 * @param period
	 */
	public Artpiece(String name, String description, String author,
			Period period) {
		super(name, description);
		this.author = author;
		this.period = period;
	}
	
	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Artpiece other = (Artpiece) obj;
		if (author == null) {
			if (other.author != null)
				return false;
		} else if (!author.equals(other.author))
			return false;
		if (period != other.period)
			return false;
		return true;
	}
	
	/**
	 * Prints out information about Artpiece
	 */
	public String toString() {
		String result = super.toString() + "\n";
		return String.format("%sAuthor: %s \nPeriod: %s", result, this.author, this.period);
	}

	/**
	 * Searches all artpieces's attributes for provided string
	 */
	@Override
	public boolean fitsSearch(String s) {
		if (super.getName().equalsIgnoreCase(s)) {
			return true;
		} else if (super.getDescription().contains(s)) {
			return true;
		} else if (this.author.equalsIgnoreCase(s)) {
			return true;
		} else if (s.equalsIgnoreCase(this.period.toString())) {
			return true;
		}
		return false;
	}
}
