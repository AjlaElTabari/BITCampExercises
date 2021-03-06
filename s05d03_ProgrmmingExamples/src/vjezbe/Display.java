package vjezbe;

public class Display {
	private static int MAX_BRIGHTNESS = 100;
	private static int MIN_BRIGHTNESS = 0;
	private static int BRIGHTNESS_TUNNER = 10;
	private String manifacturer;
	private boolean isOn;
	private int currentBrihthness;
	private double batteryConsumption;
	
	public Display(String manifacturer, double batteryConsumption) {
		this.manifacturer = manifacturer;
		this.batteryConsumption = batteryConsumption;
		this.currentBrihthness = MAX_BRIGHTNESS;
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
	 * @return the batteryConsumption
	 */
	public double getBatteryConsumption() {
		return batteryConsumption;
	}

	/**
	 * Turn the display on
	 */
	public void enable() {
		isOn = true;
	}
	/**
	 * Turn the display off
	 */
	public void disable() {
		isOn = false;
	}
	
	/**
	 * Decreases brightness for BRIGHTNESS_TUNNER if display are on
	 * and if currentBrihthness > MIN_BRIGHTNESS. If it is not, sets currentBrihthness on MIN_BRIGHTNESS
	 */
	public void lowerBrihthness() {
		if(isOn) {
			if(currentBrihthness - BRIGHTNESS_TUNNER >= MIN_BRIGHTNESS) {
				currentBrihthness -= BRIGHTNESS_TUNNER;
			} else {
				currentBrihthness = MIN_BRIGHTNESS;
			}
		}
	}	
	
	/**
	 * Increases brightness for BRIGHTNESS_TUNNER if display are on
	 * and if currentBrihthness < MIN_BRIGHTNESS. If it is not, sets currVolume on MAX_BRIGHTNESS
	 */
	public void increaseBrihthness() {
		if(isOn) {
			if(currentBrihthness + BRIGHTNESS_TUNNER <= MAX_BRIGHTNESS) {
				currentBrihthness += BRIGHTNESS_TUNNER;
			} else {
				currentBrihthness = MAX_BRIGHTNESS;
			}
		}
	}
	
	public String toString() {
		String s = "Manifacturer: " + manifacturer;
		s+= ((isOn) ? "\nCurrent Brihthness: " + currentBrihthness : "\nOff");
		return s;
	}
}
