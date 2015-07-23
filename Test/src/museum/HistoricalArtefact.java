package museum;

/**
 * Represents a historical artefact in the museum.
 * Extends Showpiece class and adds some additional attributes.
 * @author ajla.eltabari
 *
 */
public class HistoricalArtefact extends Showpiece implements Searchable {
	public enum Period {CLASSICS, MIDDLE_AGE, MODERN_ERA};
	private String origin;
	private Period period;
	
	/**
	 * Constructor that makes a HistoricalArtefact object.
	 * @param id
	 * @param name
	 * @param description
	 * @param origin
	 * @param period
	 */
	public HistoricalArtefact(String name, String description,
			String origin, Period period) {
		super(name, description);
		this.origin = origin;
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
		HistoricalArtefact other = (HistoricalArtefact) obj;
		if (origin == null) {
			if (other.origin != null)
				return false;
		} else if (!origin.equals(other.origin))
			return false;
		if (period != other.period)
			return false;
		return true;
	}
	
	/**
	 * Prints out information about HistoricalArtefact
	 */
	public String toString() {
		String result = super.toString() + "\n";
		return String.format("%sOrigin: %s \nPeriod: %s", result, this.origin, this.period);
	}
	
	/**
	 * Searches all historical artefact's attributes for provided string
	 */
	@Override
	public boolean fitsSearch(String s) {
		if (super.getName().equalsIgnoreCase(s)) {
			return true;
		} else if (super.getDescription().contains(s)) {
			return true;
		} else if (this.origin.equalsIgnoreCase(s)) {
			return true;
		} else if (s.equalsIgnoreCase(this.period.toString())) {
			return true;
		}
		return false;
	}
}
