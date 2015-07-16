package zaid;

import java.util.Arrays;
import java.util.Comparator;

public class Employee implements Comparable<Employee>{
	private String name;
	private int salary;
	private int height;
		
	public Employee(String name, int salary, int height) {
		super();
		this.name = name;
		this.salary = salary;
		this.height = height;
	}

	public String getName() {
		return name;
	}

	public int getSalary() {
		return salary;
	}

	public int getHeight() {
		return height;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	public void setHeight(int height) {
		this.height = height;
	}
	
	@Override
	public String toString() {
		return name + "(" + height + ") - " + salary + " KM";
	}
	
	public static void sortByName(Employee[] array) {		
		Arrays.sort(array, new Comparator<Employee>() {

			@Override
			public int compare(Employee e1, Employee e2) {
				return e1.name.compareTo(e2.name);
			}
			
		});
	}
	
	public static void sortBySalary(Employee[] array) {
		Arrays.sort(array, new Comparator<Employee>() {

			@Override
			public int compare(Employee o1, Employee o2) {
				return o2.salary - o1.salary;
			}
			
		});
	}

	@Override
	public int compareTo(Employee e) {
		if (this.salary != e.salary) {
			return e.salary - this.salary;
		} else {
			return this.name.compareTo(e.name);
		}
	}

	
}
