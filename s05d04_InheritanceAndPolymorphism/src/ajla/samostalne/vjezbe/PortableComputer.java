package ajla.samostalne.vjezbe;

/**
 * Represents a portable computer. Inherits PersonalComputer class.
 * Talking of portable computer, it is important to take care of sizes and weights
 * @author ajla.eltabari
 *
 */
public abstract class PortableComputer extends PersonalComputer {
	private double weight; // in kilograms
	private double screenSize; // in inches
	private boolean hasWiFi;
	
	
	/**
	 * @param os
	 * @param ramInGBs
	 * @param price
	 * @param weight
	 * @param screenSize
	 * @param hasWiFi
	 */
	public PortableComputer(String os, double ramInGBs, double price,
			double weight, double screenSize, boolean hasWiFi) {
		super(os, ramInGBs, price);
		this.weight = weight;
		this.screenSize = screenSize;
		this.hasWiFi = hasWiFi;
	}
	/**
	 * @return the weight
	 */
	public double getWeight() {
		return weight;
	}
	/**
	 * @param weight the weight to set
	 */
	public void setWeight(double weight) {
		this.weight = weight;
	}
	/**
	 * @return the screenSize
	 */
	public double getScreenSize() {
		return screenSize;
	}
	/**
	 * @param screenSize the screenSize to set
	 */
	public void setScreenSize(double screenSize) {
		this.screenSize = screenSize;
	}
	/**
	 * @return the hasWiFi
	 */
	public boolean isHasWiFi() {
		return hasWiFi;
	}
	/**
	 * @param hasWiFi the hasWiFi to set
	 */
	public void setHasWiFi(boolean hasWiFi) {
		this.hasWiFi = hasWiFi;
	}
	
	public void printInformation() {
		super.printInformation();
		String s = "PORTABLE COMPUTER: \n";
		s += "Weight: " + this.weight + "\n";
		s += "Screen size: " + this.screenSize + " ''\n";
		s += "Has WiFi: " + this.hasWiFi + "\n";
		
		System.out.println(s);
	}
	
}
