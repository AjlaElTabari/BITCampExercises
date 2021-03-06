package ajla.samostalne.vjezbe;
/**
 * Represents a laptop. Inherits PortableComputer class.
 * @author ajla.eltabari
 *
 */
public class Laptop extends PortableComputer {
	private int batteryCellsNo;
	private boolean hasBluetooth;
	private boolean hasNumPad;
	
	/**
	 * @param os
	 * @param ramInGBs
	 * @param price
	 * @param weight
	 * @param screenSize
	 * @param hasWiFi
	 * @param batteryCellsNo
	 * @param hasBluetooth
	 * @param hasNumPad
	 */
	public Laptop(String os, double ramInGBs, double price, double weight,
			double screenSize, boolean hasWiFi, int batteryCellsNo,
			boolean hasBluetooth, boolean hasNumPad) {
		super(os, ramInGBs, price, weight, screenSize, hasWiFi);
		this.batteryCellsNo = batteryCellsNo;
		this.hasBluetooth = hasBluetooth;
		this.hasNumPad = hasNumPad;
	}
	/**
	 * @return the hasBluetooth
	 */
	public boolean isHasBluetooth() {
		return hasBluetooth;
	}
	/**
	 * @param hasBluetooth the hasBluetooth to set
	 */
	public void setHasBluetooth(boolean hasBluetooth) {
		this.hasBluetooth = hasBluetooth;
	}
	/**
	 * @return the hasNumPad
	 */
	public boolean isHasNumPad() {
		return hasNumPad;
	}
	/**
	 * @param hasNumPad the hasNumPad to set
	 */
	public void setHasNumPad(boolean hasNumPad) {
		this.hasNumPad = hasNumPad;
	}
	
	public void printInformation() {
		super.printInformation();
		String s = "LAPTOP: \n";
		s += "Battery cells number: " + this.batteryCellsNo + "\n";
		s += "Has bluetooth? " + this.hasBluetooth + " ''\n";
		s += "Has numPad?: " + this.hasNumPad + "\n";
		
		System.out.println(s);
	}
	
}
