package ajla.samostalne.vjezbe;
/**
 * Represents a desktop computer. Inherits StationaryComputer class.
 * @author ajla.eltabari
 *
 */
public class DesktopComputer extends StationaryComputer {
	private boolean hasEmptyMemmorySlots;
	private boolean isOverclocked;
	private boolean hasOpticalDrive;
		
	/**
	 * @param os
	 * @param ramInGBs
	 * @param price
	 * @param processorSpeed
	 * @param powerSupplyCapacity
	 * @param hardDiskCapacity
	 * @param hasEmptyMemmorySlots
	 * @param isOverclocked
	 * @param hasOpticalDrive
	 */
	public DesktopComputer(String os, double ramInGBs, double price,
			double processorSpeed, double powerSupplyCapacity,
			int hardDiskCapacity, boolean hasEmptyMemmorySlots,
			boolean isOverclocked, boolean hasOpticalDrive) {
		super(os, ramInGBs, price, processorSpeed, powerSupplyCapacity,
				hardDiskCapacity);
		this.hasEmptyMemmorySlots = hasEmptyMemmorySlots;
		this.isOverclocked = isOverclocked;
		this.hasOpticalDrive = hasOpticalDrive;
	}

	/**
	 * @return the hasEmptyMemmorySlots
	 */
	public boolean isHasEmptyMemmorySlots() {
		return hasEmptyMemmorySlots;
	}
	/**
	 * @param hasEmptyMemmorySlots the hasEmptyMemmorySlots to set
	 */
	public void setHasEmptyMemmorySlots(boolean hasEmptyMemmorySlots) {
		this.hasEmptyMemmorySlots = hasEmptyMemmorySlots;
	}
	/**
	 * @return the isOverclocked
	 */
	public boolean isOverclocked() {
		return isOverclocked;
	}
	/**
	 * @param isOverclocked the isOverclocked to set
	 */
	public void setOverclocked(boolean isOverclocked) {
		this.isOverclocked = isOverclocked;
	}
	/**
	 * @return the hasOpticalDrive
	 */
	public boolean isHasOpticalDrive() {
		return hasOpticalDrive;
	}
	/**
	 * @param hasOpticalDrive the hasOpticalDrive to set
	 */
	public void setHasOpticalDrive(boolean hasOpticalDrive) {
		this.hasOpticalDrive = hasOpticalDrive;
	}
	
	public void printInformation() {
		super.printInformation();
		String s = "DESKTOP: \n";
		s += "Has empty memory slots? " + this.hasEmptyMemmorySlots + "\n";
		s += "Is overclocked? " + this.isOverclocked + " ''\n";
		s += "Has optical drive?: " + this.hasOpticalDrive + "\n";
		
		System.out.println(s);
	}
}
