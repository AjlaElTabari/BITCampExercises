package ajla.predavanja;

public class LandVehicle {
	private String registration;
	private int yearManifacured;
	private int passingersMaxNo;
	private int noOfVheils;
	
	
	/**
	 * @param registration
	 * @param yearManifacured
	 * @param passingersMaxNo
	 * @param noOfVheils
	 */
	public LandVehicle(String registration, int yearManifacured,
			int passingersMaxNo, int noOfVheils) {
		super();
		this.registration = registration;
		this.yearManifacured = yearManifacured;
		this.passingersMaxNo = passingersMaxNo;
		this.noOfVheils = noOfVheils;
	}
	
	/**
	 * @return the registration
	 */
	public String getRegistration() {
		return registration;
	}
	/**
	 * @param registration the registration to set
	 */
	public void setRegistration(String registration) {
		this.registration = registration;
	}
	/**
	 * @return the yearManifacured
	 */
	public int getYearManifacured() {
		return yearManifacured;
	}
	/**
	 * @param yearManifacured the yearManifacured to set
	 */
	public void setYearManifacured(int yearManifacured) {
		this.yearManifacured = yearManifacured;
	}
	/**
	 * @return the passingersMaxNo
	 */
	public int getPassingersMaxNo() {
		return passingersMaxNo;
	}
	/**
	 * @param passingersMaxNo the passingersMaxNo to set
	 */
	public void setPassingersMaxNo(int passingersMaxNo) {
		this.passingersMaxNo = passingersMaxNo;
	}
	/**
	 * @return the noOfVheils
	 */
	public int getNoOfVheils() {
		return noOfVheils;
	}
	/**
	 * @param noOfVheils the noOfVheils to set
	 */
	public void setNoOfVheils(int noOfVheils) {
		this.noOfVheils = noOfVheils;
	}
	
	
}
