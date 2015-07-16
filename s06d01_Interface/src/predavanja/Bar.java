package predavanja;

public class Bar implements Compare{
	private String name;

	/**
	 * @param name
	 */
	public Bar(String name) {
		super();
		this.name = name;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	
	public String toString() {
		return "Bar: " + name;
	}

	@Override
	public int compare(Object o) {
		if (o instanceof Bar) {
			Bar b = (Bar)o;
			if (this.name.length() < b.name.length()) {
				return -1;
			} else if (this.name.length() > b.name.length()) {
				return 1;
			} else {
				return 0;
			}
		} else {
			throw new IllegalArgumentException();
		}
	}
}
