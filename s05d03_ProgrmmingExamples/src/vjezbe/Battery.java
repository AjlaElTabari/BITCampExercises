package vjezbe;

public class Battery {
	private static int BATTERY_MAX = 100;
	private static int DEFAULT_BATTERY_PERCENTAGE = 50;
	private static int BATTERY_MIN = 0;
	private String manifacturer;
	private double batteryStatus; // percentage
	private int chargingSpeed; // percentage / minutes
	
	public Battery(String manifacturer, int chargingSpeed) {
		this.manifacturer = manifacturer;
		this.batteryStatus = DEFAULT_BATTERY_PERCENTAGE;
		this.chargingSpeed = chargingSpeed;
	}

	/**
	 * @return the manifacturer
	 */
	public String getManifacturer() {
		return manifacturer;
	}

	/**
	 * @return the batteryStatus
	 */
	public double getBatteryStatus() {
		return batteryStatus;
	}
	
	public void chargeTheBattery(int minutes) {
		double charge = chargingSpeed * minutes;
		if (batteryStatus + charge <= BATTERY_MAX) {
			batteryStatus += charge;
		} else {
			batteryStatus = BATTERY_MAX;
		}
	}
	
	public void decreaseBattery(int batteryPercentage) {
		if (batteryStatus - batteryPercentage > BATTERY_MIN) {
			batteryStatus -= batteryPercentage;
		} else {
			batteryStatus = BATTERY_MIN;
		}
	}
	
	public String toString() {
		return "\nManifacturer: " + manifacturer + "\nBattery status: " + batteryStatus;
	}
	
 }
