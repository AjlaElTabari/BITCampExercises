package ajla.vjezbe;

public class Hospital extends Building {
	private int noOfPatients;
	private boolean isPublic;
	private boolean hasCT;
	private int noOfBeds;
	
	/**
	 * @param address
	 * @param population
	 * @param area
	 * @param noOfPatients
	 * @param isPublic
	 * @param hasCT
	 * @param noOfBeds
	 */
	public Hospital(String address, int population, double area,
			int noOfPatients, boolean isPublic, boolean hasCT, int noOfBeds) {
		super(address, population, area);
		this.noOfPatients = noOfPatients;
		this.isPublic = isPublic;
		this.hasCT = hasCT;
		this.noOfBeds = noOfBeds;
	}

	/**
	 * @return the noOfPatients
	 */
	public int getNoOfPatients() {
		return noOfPatients;
	}

	/**
	 * @param noOfPatients the noOfPatients to set
	 */
	public void setNoOfPatients(int noOfPatients) {
		this.noOfPatients = noOfPatients;
	}

	/**
	 * @return the isPublic
	 */
	public boolean isPublic() {
		return isPublic;
	}

	/**
	 * @param isPublic the isPublic to set
	 */
	public void setPublic(boolean isPublic) {
		this.isPublic = isPublic;
	}

	/**
	 * @return the hasCT
	 */
	public boolean isHasCT() {
		return hasCT;
	}

	/**
	 * @param hasCT the hasCT to set
	 */
	public void setHasCT(boolean hasCT) {
		this.hasCT = hasCT;
	}

	/**
	 * @return the noOfBeds
	 */
	public int getNoOfBeds() {
		return noOfBeds;
	}

	/**
	 * @param noOfBeds the noOfBeds to set
	 */
	public void setNoOfBeds(int noOfBeds) {
		this.noOfBeds = noOfBeds;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Hospital [noOfPatients=" + noOfPatients + ", isPublic="
				+ isPublic + ", hasCT=" + hasCT + ", noOfBeds=" + noOfBeds
				+ ", getAddress()=" + getAddress() + ", getPopulation()="
				+ getPopulation() + ", getArea()=" + getArea()
				+ ", toString()=" + super.toString() + ", getClass()="
				+ getClass() + ", hashCode()=" + hashCode() + "]";
	}

	
}
