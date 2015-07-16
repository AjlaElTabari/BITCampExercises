package zaid;

public class Employee implements Comparable<Employee>{
	
	private String name;
	private int salary;
	private int height;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	public Employee(String name, int salary, int height) {
		super();
		this.name = name;
		this.salary = salary;
		this.height = height;
	}
	@Override
	public int compareTo(Employee o) {
		return this.salary - o.salary;
	}
	@Override
	public String toString() {
		return "Employee [name=" + name + ", salary=" + salary + ", height="
				+ height + "]";
	}
	
	
}
