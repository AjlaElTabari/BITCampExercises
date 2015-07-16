package vjezbe.Suticase;

public class Suitcase {
	private int maxCapacity;
	private int currCapacity;

	/**
	 * @param maxCapacity
	 * @param currCapacity
	 */
	public Suitcase(int maxCapacity) {
		super();
		this.maxCapacity = maxCapacity;
		this.currCapacity = 0;
	}

	public int getMaxCapcity() {
		return maxCapacity;
	}

	public int getCurrCapcity() {
		return currCapacity;
	}

	public int getFreeSpace() {
		return maxCapacity - currCapacity;
	}

	public int addStaffToTheSuitcase(int newStuffCapacity) {
		return (getFreeSpace() >= newStuffCapacity) ? currCapacity += newStuffCapacity
				: currCapacity;
	}
	
	public int removeStaffFromTheSuitcase(int staffToRemove) {
		return (currCapacity - staffToRemove >= 0) ? currCapacity -= staffToRemove : currCapacity;
	}
}
