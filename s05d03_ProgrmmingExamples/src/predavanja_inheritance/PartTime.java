package predavanja_inheritance;

public class PartTime extends SalaryEmployee {
	private int halfDay;
	
	public PartTime(String name, String gender, int salary, int halfDay) {
		super(name, gender, salary);
		this.halfDay = halfDay;
	}
	
	public String toString() {
		return "Child class: " + name +  " " + gender + " " + salary + " " + halfDay;
	}
}
