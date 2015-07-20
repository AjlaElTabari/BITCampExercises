package vjezbe;

public class Application {

	private String name;
	private int year;
	private double version;
	private double size;

	/**
	 * @param name
	 * @param year
	 * @param version
	 * @param size
	 */
	public Application(String name, int year, double version, double size) {
		super();
		this.name = name;
		this.year = year;
		this.version = version;
		this.size = size;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name
	 *            the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the year
	 */
	public int getYear() {
		return year;
	}

	/**
	 * @param year
	 *            the year to set
	 */
	public void setYear(int year) {
		this.year = year;
	}

	/**
	 * @return the version
	 */
	public double getVersion() {
		return version;
	}

	/**
	 * @param version
	 *            the version to set
	 */
	public void setVersion(double version) {
		this.version = version;
	}

	/**
	 * @return the size
	 */
	public double getSize() {
		return size;
	}

	/**
	 * @param size
	 *            the size to set
	 */
	public void setSize(double size) {
		this.size = size;
	}

	public String toString() {
		return "Application: " + name + " (" + year + ") \nVersion: " + version
				+ "Size: " + size + "\n";
	}

}
