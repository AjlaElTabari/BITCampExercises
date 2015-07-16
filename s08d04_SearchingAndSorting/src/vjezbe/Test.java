package vjezbe;

import java.util.ArrayList;

public class Test {

	public static void main(String[] args) {
		Employee e = new Employee("Ajla", "Tabari", true, 1000, 5, 7, 1984);
		Employee e1 = new Employee("Gordan", "Masic", false, 2000, 5, 7, 1989);
		Employee e3 = new Employee("Kristina", "Pupovac", true, 3000, 5, 7, 1987);
		Employee e4 = new Employee("Zaid", "Zerdo", false, 4000, 5, 7, 1994);
		Employee e5 = new Employee("Amra", "Sabic", true, 1000, 6, 7, 1988);
		
		ArrayList<Employee> employees = new ArrayList();
		employees.add(e);
		employees.add(e1);
		employees.add(e3);
		employees.add(e4);
		
		Company c = new Company(employees);
	
		c.hireEmployee(e5);
		c.fireEmployee(e3);
		
		System.out.println("Is employee of this company? " + c.isWorkingHere(e4));
		System.out.println("Has females? " + c.hasFemaleEmployees());
		//System.out.println(employees);
		
		//c.sortEmployeesByConditionUsingSelectionSort("ID");
		//c.sortEmployeesByConditionUsingSelectionSort("age");
		//c.sortEmployeesByConditionUsingInsertionSort("salary");
		//c.sortEmployeesByConditionUsingInsertionSort("gender");
		//System.out.println(c.areEmployeesSortedByID());
		
		for (Employee emp : employees) {
			System.out.println(emp);
		}
	}
	

}
