package predavanja_inheritance;

public class Employee {
	protected String name;
	protected String gender;
	
	public Employee(String name, String gender) {
		this.name = name;
		this.gender = gender;
	}
	
	public String toString() {
		return "Parent class: " + name +  " " + gender;
	}
	
	
}
