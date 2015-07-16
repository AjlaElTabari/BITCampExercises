package ajla.samostalne.vjezbe;

/**
 * Represents a stationary computer(PC). Inherits PersonalComputer class.
 * It is very important to take care of power supply capacity, when working
 * with this type of computers
 * @author ajla.eltabari
 *
 */
public abstract class StationaryComputer extends PersonalComputer {
	private double processorSpeed; // in GHz
	private double powerSupplyCapacity; // in Watts
	private int hardDiskCapacity; // in TB
	
	/**
	 * @param os
	 * @param ramInGBs
	 * @param price
	 * @param processorSpeed
	 * @param powerSupplyCapacity
	 * @param hardDiskCapacity
	 */
	public StationaryComputer(String os, double ramInGBs, double price,
			double processorSpeed, double powerSupplyCapacity,
			int hardDiskCapacity) {
		super(os, ramInGBs, price);
		this.processorSpeed = processorSpeed;
		this.powerSupplyCapacity = powerSupplyCapacity;
		this.hardDiskCapacity = hardDiskCapacity;
	}
	
	public StationaryComputer(String os, double ramInGBs, double price) {
		super(os, ramInGBs, price);
	}

	/**
	 * @return the processorSpeed
	 */
	public double getProcessorSpeed() {
		return processorSpeed;
	}
	/**
	 * @param processorSpeed the processorSpeed to set
	 */
	public void setProcessorSpeed(double processorSpeed) {
		this.processorSpeed = processorSpeed;
	}
	/**
	 * @return the powerSupplyCapacity
	 */
	public double getPowerSupplyCapacity() {
		return powerSupplyCapacity;
	}
	/**
	 * @param powerSupplyCapacity the powerSupplyCapacity to set
	 */
	public void setPowerSupplyCapacity(double powerSupplyCapacity) {
		this.powerSupplyCapacity = powerSupplyCapacity;
	}
	/**
	 * @return the hardDiskCapacity
	 */
	public int getHardDiskCapacity() {
		return hardDiskCapacity;
	}
	/**
	 * @param hardDiskCapacity the hardDiskCapacity to set
	 */
	public void setHardDiskCapacity(int hardDiskCapacity) {
		this.hardDiskCapacity = hardDiskCapacity;
	}

	public void printInformation() {
		super.printInformation();
		String s = "STATIONARY COMPUTER: \n";
		s += "Processor speed: " + this.processorSpeed + "\n";
		s += "Power Supply Capacity: " + this.powerSupplyCapacity + "\n";
		s += "HDD Capacity: " + this.hardDiskCapacity + "\n";
		
		System.out.println(s);
	}
}
