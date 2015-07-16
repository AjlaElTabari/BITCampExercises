package ajla.samostalne.vjezbe;
/**
 * Represents a workstation. Inherits StationaryComputer class.
 * @author ajla.eltabari
 *
 */
public class Workstation extends StationaryComputer {
	private int displaysNo;
	private int processorCoresNo;
	private boolean hasECC;
	
	/**
	 * @param os
	 * @param ramInGBs
	 * @param price
	 * @param processorSpeed
	 * @param powerSupplyCapacity
	 * @param hardDiskCapacity
	 * @param displaysNo
	 * @param processorCoresNo
	 * @param hasECC
	 */
	public Workstation(String os, double ramInGBs, double price,
			double processorSpeed, double powerSupplyCapacity,
			int hardDiskCapacity, int displaysNo, int processorCoresNo,
			boolean hasECC) {
		super(os, ramInGBs, price, processorSpeed, powerSupplyCapacity,
				hardDiskCapacity);
		this.displaysNo = displaysNo;
		this.processorCoresNo = processorCoresNo;
		this.hasECC = hasECC;
	}
	
	/**
	 * @return the displaysNo
	 */
	public int getDisplaysNo() {
		return displaysNo;
	}
	/**
	 * @param displaysNo the displaysNo to set
	 */
	public void setDisplaysNo(int displaysNo) {
		this.displaysNo = displaysNo;
	}
	/**
	 * @return the processorCoresNo
	 */
	public int getProcessorCoresNo() {
		return processorCoresNo;
	}
	/**
	 * @param processorCoresNo the processorCoresNo to set
	 */
	public void setProcessorCoresNo(int processorCoresNo) {
		this.processorCoresNo = processorCoresNo;
	}
	/**
	 * @return the hasECC
	 */
	public boolean isHasECC() {
		return hasECC;
	}
	/**
	 * @param hasECC the hasECC to set
	 */
	public void setHasECC(boolean hasECC) {
		this.hasECC = hasECC;
	}
	
	public void printTypeInfo() {
		System.out.println("Workstation \n");
	}
	
	public void printInformation() {
		super.printInformation();
		String s = "WORKSTATION: \n";
		s += "Number of displayes: " + this.displaysNo + "\n";
		s += "Processor cores number: " + this.processorCoresNo + " ''\n";
		s += "Has ECC: " + this.hasECC + "\n";
		
		System.out.println(s);
	}
}
