package predavanja_inheritance;

public class SalaryEmployee extends Employee {
	protected int salary;
	
	public SalaryEmployee(String name, String gender, int salary) {
		super(name, gender);
		this.salary = salary;
	}

	public String toString() {
		return "Child class: " + name +  " " + gender + " " + salary;
	}
	
}
