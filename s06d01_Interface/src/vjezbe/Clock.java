package vjezbe;

public class Clock implements WriteableClock {
	private int hours;
	private int minutes;
	private int seconds;

	/**
	 * @param hours
	 * @param minutes
	 * @param seconds
	 */
	public Clock(int hours, int minutes, int seconds) {
		super();
		this.hours = hours;
		this.minutes = minutes;
		this.seconds = seconds;
	}

	@Override
	public void addToFile(String filename, int format) {
		String time = "";
		switch (format) {
			case AMPM_FORMAT:
				if(hours > 12) {
					time = hours - 12 + ":" + minutes + ":" + seconds + " PM";
					writeToFile(filename, time);
				} else {
					time = hours + ":" + minutes + ":" + seconds + " AM";
					writeToFile(filename, time);
				}
				break;
			case AMPM_FORMAT_NO_SECONDS:
				if(hours > 12) {
					time = hours - 12 + ":" + minutes + " PM";
					writeToFile(filename, time);
				} else {
					time = hours + ":" + minutes + " AM";
					writeToFile(filename, time);
				}
				break;	
			case MILITARY_FORMAT:
				time = hours + ":" + minutes + ":" + seconds;
				writeToFile(filename, time);
				break;	
			case MILITARY_FORMAT_NO_SECONDS:
				time = hours + ":" + minutes;
				writeToFile(filename, time);
				break;	
		}

	}

}
