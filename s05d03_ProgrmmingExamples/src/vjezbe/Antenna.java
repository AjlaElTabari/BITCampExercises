package vjezbe;

public class Antenna {
	private static int MAX_SIGNAL_STRENGTH = 4;
	private static int MIN_SIGNAL_STRENGTH = 0;
	private String manifacturer;
	private int signalStrength;
	private double batteryConsumption; 
	
	public Antenna(String manifacturer, double batteryConsumption) {
		this.manifacturer = manifacturer;
		this.batteryConsumption = batteryConsumption;
		this.signalStrength = MAX_SIGNAL_STRENGTH;
	}

	/**
	 * @return the manifacturer
	 */
	public String getManifacturer() {
		return manifacturer;
	}

	/**
	 * @return the signalStrength
	 */
	public int getSignalStrength() {
		return signalStrength;
	}
	
	/**
	 * @return the batteryConsumption
	 */
	public double getBatteryConsumption() {
		return batteryConsumption;
	}

	/**
	 * @param signalStrength the signalStrength to set
	 */
	public void setSignalStrength(int signalStrength) {
		this.signalStrength = signalStrength;
	}
	
	public boolean isSignalValid(int signalStrength, String message) {
		if (this.signalStrength < signalStrength) {
			return false;
		} 
		if (!message.substring(0, 3).equals("CAL") && !message.substring(0, 3).equals("SMS")) {
			return false;
		}
		if (!message.substring(3, 6).equals("387")) {
			return false;
		} 
		if ((message.substring(3, message.length())).length() < 11) {
			return false;
		}
		return true;
	}
	
	public String toString() {
		return "Manifacturer: " + manifacturer + "\nSignal Strength: " + signalStrength;
	}
	
}
