package vjezbe;

public class MobilePhoneSpeakers {
	private static int MAX_VOLUME = 100;
	private static int MIN_VOLUME = 0;
	private static int VOLUME_TUNNER = 10;
	private String manifacturer;
	private double price;
	private boolean isOn;
	private int currentVolume;
	private double batteryConsumption; // over an hour
	
	/**
	 * Constructor
	 * @param manifacturer
	 * @param batteryConsumption
	 * @param price
	 */
	public MobilePhoneSpeakers(String manifacturer, double batteryConsumption, double price) {
		this.manifacturer = manifacturer;
		this.price = price;
		this.isOn = false;
		this.currentVolume = 0;
		this.batteryConsumption = batteryConsumption;
	}

	/**
	 * @return the manifacturer
	 */
	public String getManifacturer() {
		return manifacturer;
	}
	/**
	 * @param manifacturer the manifacturer to set
	 */
	public void setManifacturer(String manifacturer) {
		this.manifacturer = manifacturer;
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
	/**
	 * @return the isOn
	 */
	public boolean isOn() {
		return isOn;
	}

	/**
	 * @param isOn the isOn to set
	 */
	public void setOn(boolean isOn) {
		this.isOn = isOn;
	}
	/**
	 * @return the currentVolume
	 */
	public int getCurrentVolume() {
		return currentVolume;
	}
	/**
	 * @param currentVolume the currentVolume to set
	 */
	public void setCurrentVolume(int currentVolume) {
		this.currentVolume = currentVolume;
	}
	
	/**
	 * @return the batteryConsumption
	 */
	public double getBatteryConsumption() {
		return batteryConsumption;
	}
	
	/**
	 * Turn the speakers on
	 */
	public void enable() {
		isOn = true;
	}
	/**
	 * Turn the speakers off
	 */
	public void disable() {
		isOn = false;
	}
	
	/**
	 * Decreases volume for VOLUME_TUNNER if speakers are on
	 * and if currentVolume > MIN_VOLUME. If it is not, sets currVolume on MIN_VOLUME
	 */
	public void lowerVolume() {
		if(isOn) {
			if(currentVolume - VOLUME_TUNNER >= MIN_VOLUME) {
				currentVolume -= VOLUME_TUNNER;
			} else {
				currentVolume = MIN_VOLUME;
			}
		}
	}	
	
	/**
	 * Increases volume for VOLUME_TUNNER if speakers are on
	 * and if currentVolume < MAX_VOLUME. If it is not, sets currVolume on MAX_VOLUME
	 */
	public void increaseVolume() {
		if(isOn) {
			if(currentVolume + VOLUME_TUNNER <= MAX_VOLUME) {
				currentVolume += VOLUME_TUNNER;
			} else {
				currentVolume = MAX_VOLUME;
			}
		}
	}
	
	public String toString() {
		String s = "Manifacturer: " + manifacturer;
		s+= ((isOn) ? "\nCurrent volume: " + currentVolume : "\nOff");
		return s;
	}
	
}
