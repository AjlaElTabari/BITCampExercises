package ajla.samostalne.vjezbe;

public abstract class PersonalComputer {
	private String os;
	private double ramInGBs;
	private double price;
	
	/**
	 * @param os
	 * @param ramInGBs
	 * @param price
	 */
	public PersonalComputer(String os, double ramInGBs, double price) {
		super();
		this.os = os;
		this.ramInGBs = ramInGBs;
		this.price = price;
	}
	
	/**
	 * @return the os
	 */
	public String getOs() {
		return os;
	}
	/**
	 * @param os the os to set
	 */
	public void setOs(String os) {
		this.os = os;
	}
	/**
	 * @return the ramInGBs
	 */
	public double getRamInGBs() {
		return ramInGBs;
	}
	/**
	 * @param ramInGBs the ramInGBs to set
	 */
	public void setRamInGBs(double ramInGBs) {
		this.ramInGBs = ramInGBs;
	}
	/**
	 * @return the price
	 */
	public double getPrice() {
		return price;
	}
	/**
	 * @param price the price to set
	 */
	public void setPrice(double price) {
		this.price = price;
	}
	
	public void printInformation() {
		String s = "PERSONAL COMPUTER: \n";
		s += "Operating system: " + this.os + "\n";
		s += "RAM: " + this.ramInGBs + " GB\n";
		s += "Price: " + this.price + "\n";
		
		System.out.println(s);
	}
	
}
