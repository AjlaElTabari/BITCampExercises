package ajla.samostalne.vjezbe;

public class PocketPC extends PortableComputer {
	private boolean hasTouchInterface;
	private boolean hasSIMslot;
	private boolean hasMicroSDSlot;
	
	/**
	 * @param os
	 * @param ramInGBs
	 * @param price
	 * @param weight
	 * @param screenSize
	 * @param hasWiFi
	 * @param hasTouchInterface
	 * @param hasSIMslot
	 * @param hasMicroSDSlot
	 */
	public PocketPC(String os, double ramInGBs, double price, double weight,
			double screenSize, boolean hasWiFi, boolean hasTouchInterface,
			boolean hasSIMslot, boolean hasMicroSDSlot) {
		super(os, ramInGBs, price, weight, screenSize, hasWiFi);
		this.hasTouchInterface = hasTouchInterface;
		this.hasSIMslot = hasSIMslot;
		this.hasMicroSDSlot = hasMicroSDSlot;
	}
	/**
	 * @return the hasTouchInterface
	 */
	public boolean isHasTouchInterface() {
		return hasTouchInterface;
	}
	/**
	 * @param hasTouchInterface the hasTouchInterface to set
	 */
	public void setHasTouchInterface(boolean hasTouchInterface) {
		this.hasTouchInterface = hasTouchInterface;
	}
	/**
	 * @return the hasSIMslot
	 */
	public boolean isHasSIMslot() {
		return hasSIMslot;
	}
	/**
	 * @param hasSIMslot the hasSIMslot to set
	 */
	public void setHasSIMslot(boolean hasSIMslot) {
		this.hasSIMslot = hasSIMslot;
	}
	/**
	 * @return the hasMicroSDSlot
	 */
	public boolean isHasMicroSDSlot() {
		return hasMicroSDSlot;
	}
	/**
	 * @param hasMicroSDSlot the hasMicroSDSlot to set
	 */
	public void setHasMicroSDSlot(boolean hasMicroSDSlot) {
		this.hasMicroSDSlot = hasMicroSDSlot;
	}
	public void printInformation() {
		super.printInformation();
		String s = "POCKET PC: \n";
		s += "Has touch interface?: " + this.hasTouchInterface + "\n";
		s += "Has SIM slot?: " + this.hasSIMslot + " ''\n";
		s += "Has microSD slot?: " + this.hasMicroSDSlot + "\n";
		
		System.out.println(s);
	}
	
}
