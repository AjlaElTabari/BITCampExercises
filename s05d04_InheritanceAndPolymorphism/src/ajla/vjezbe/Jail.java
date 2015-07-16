package ajla.vjezbe;

public class Jail extends Building {
	private int noOfCells;
	private int securityLvl;
	private boolean hasGym;
	/**
	 * @param address
	 * @param population
	 * @param area
	 * @param noOfCells
	 * @param securityLvl
	 * @param hasGym
 */
	public Jail(String address, int population, double area, int noOfCells,
			int securityLvl, boolean hasGym) {
		super(address, population, area);
		this.noOfCells = noOfCells;
		this.securityLvl = securityLvl;
		this.hasGym = hasGym;
	}
	/**
	 * @return the noOfCells
	 */
	public int getNoOfCells() {
		return noOfCells;
	}
	/**
	 * @param noOfCells the noOfCells to set
	 */
	public void setNoOfCells(int noOfCells) {
		this.noOfCells = noOfCells;
	}
	/**
	 * @return the securityLvl
	 */
	public int getSecurityLvl() {
		return securityLvl;
	}
	/**
	 * @param securityLvl the securityLvl to set
	 */
	public void setSecurityLvl(int securityLvl) {
		this.securityLvl = securityLvl;
	}
	/**
	 * @return the hasGym
	 */
	public boolean isHasGym() {
		return hasGym;
	}
	/**
	 * @param hasGym the hasGym to set
	 */
	public void setHasGym(boolean hasGym) {
		this.hasGym = hasGym;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Jail [noOfCells=" + noOfCells + ", securityLvl=" + securityLvl
				+ ", hasGym=" + hasGym + ", getAddress()=" + getAddress()
				+ ", getPopulation()=" + getPopulation() + ", getArea()="
				+ getArea() + ", toString()=" + super.toString()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ "]";
	}
	
	
}
