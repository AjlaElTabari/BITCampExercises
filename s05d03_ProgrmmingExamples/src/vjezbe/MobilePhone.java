package vjezbe;

public class MobilePhone {
	private String model;
	private double displaySize;
	private String color;
	private boolean hasCamera;
	private Battery battery;
	private Display display;
	private Antenna antenna;
	private MobilePhoneSpeakers speakers;
	private double batteryConsumption;

	public MobilePhone(String model, double displaySize, String color,
			boolean hasCamera, Battery battery, Display display,
			Antenna antenna, MobilePhoneSpeakers speakers) {

		this.model = model;
		this.displaySize = displaySize;
		this.color = color;
		this.hasCamera = hasCamera;
		this.battery = battery;
		this.display = display;
		this.antenna = antenna;
		this.speakers = speakers;
		
	}
	
	public String toString() {
		String s = "This mobile phone is: " + this.model;
		s += "\nIt is made by different components, produced by different manifactures. This is it's specification:";
		s += battery.toString();
		s += "\n" + display.toString();
		s += "\n" + antenna.toString();
		s += "\n" + speakers.toString(); 
		return s;
	}
	
	public void getBatteryConsumption(int minutesOn) {
		batteryConsumption -= (display.getBatteryConsumption()/60 + antenna.getBatteryConsumption()/60 + speakers.getBatteryConsumption()/60);
		batteryConsumption *= minutesOn;
		if (batteryConsumption < 0) {
			
		}
		System.out.println(batteryConsumption);
	}
}
