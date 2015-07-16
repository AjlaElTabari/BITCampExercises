package ajla.vjezbe;

public class University extends Building {
	
	private int staffNo;
	private String name;
	private boolean isPublic;
	private int noOfFaculties;
	
	/**
	 * @param address
	 * @param population
	 * @param area
	 * @param staffNo
	 * @param name
	 * @param isPublic
	 * @param noOfFaculties
	 */
	public University(String address, int population, double area, int staffNo,
		String name, boolean isPublic, int noOfFaculties) {
		super(address, population, area);
		this.staffNo = staffNo;
		this.name = name;
		this.isPublic = isPublic;
		this.noOfFaculties = noOfFaculties;
	}

	/**
	 * @return the staffNo
	 */
	public int getStaffNo() {
		return staffNo;
	}

	/**
	 * @param staffNo the staffNo to set
	 */
	public void setStaffNo(int staffNo) {
		this.staffNo = staffNo;
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
	 * @return the noOfFaculties
	 */
	public int getNoOfFaculties() {
		return noOfFaculties;
	}

	/**
	 * @param noOfFaculties the noOfFaculties to set
	 */
	public void setNoOfFaculties(int noOfFaculties) {
		this.noOfFaculties = noOfFaculties;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "University [staffNo=" + staffNo + ", name=" + name
				+ ", isPublic=" + isPublic + ", noOfFaculties=" + noOfFaculties
				+ ", getAddress()=" + getAddress() + ", getPopulation()="
				+ getPopulation() + ", getArea()=" + getArea()
				+ ", toString()=" + super.toString() + ", getClass()="
				+ getClass() + ", hashCode()=" + hashCode() + "]";
	}



	
	
}
