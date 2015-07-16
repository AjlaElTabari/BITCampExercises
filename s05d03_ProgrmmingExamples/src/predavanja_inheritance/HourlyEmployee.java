package predavanja_inheritance;

public class HourlyEmployee extends Employee{
	private int hourlyRate;
	
	public HourlyEmployee(String name, String gender, int hourlyRate) {
		super(name, gender);
		this.hourlyRate = hourlyRate;
	}

	public String toString() {
		return "Child class: " + name +  " " + gender + " " + hourlyRate;
	}
}
