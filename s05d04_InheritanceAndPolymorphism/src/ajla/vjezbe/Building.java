package ajla.vjezbe;

public abstract class Building {
	private String address;
	private int population;
	private double area;
	/**
	 * @param address
	 * @param population
	 * @param area
	 */
	public Building(String address, int population, double area) {
		super();
		this.address = address;
		this.population = population;
		this.area = area;
	}
	/**
	 * @return the address
	 */
	public String getAddress() {
		return address;
	}
	/**
	 * @param address the address to set
	 */
	public void setAddress(String address) {
		this.address = address;
	}
	/**
	 * @return the population
	 */
	public int getPopulation() {
		return population;
	}
	/**
	 * @param population the population to set
	 */
	public void setPopulation(int population) {
		this.population = population;
	}
	/**
	 * @return the area
	 */
	public double getArea() {
		return area;
	}
	/**
	 * @param area the area to set
	 */
	public void setArea(double area) {
		this.area = area;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Building [address=" + address + ", population=" + population
				+ ", area=" + area + "]";
	}
	
	public double getPopulationDensity() {
		return 0.0;
	}
}
