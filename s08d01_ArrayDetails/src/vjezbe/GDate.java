package vjezbe;

public class GDate {
	private int day;
	private int month;
	private int year;

	public GDate(int day, int month, int year) {
		this.day = day;
		this.month = month;
		this.year = year;
	}

	public GDate() {
		this.day = 1;
		this.month = 1;
		this.year = 2000;
	}
	
	public String toString() {
		return day + ". " + month + ". " + year + ".";
	}
	
	public static void main(String[] args) {
		GDate[]  dates = {new GDate(5, 2, 1988), new GDate(4, 3, 2015), new GDate(18, 5, 2015), new GDate()};
		for (GDate date : dates) {
			System.out.println(date);
		}
	}

}
