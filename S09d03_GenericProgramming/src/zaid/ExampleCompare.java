package zaid;

import java.util.Arrays;

public class ExampleCompare {

	public static void main(String[] args) {
		Employee[] myEmployees = new Employee[4];
		myEmployees[0] = new Employee("Enver Memic", 5000, 156);
		myEmployees[1] = new Employee("Hasib Salkic", 5000, 190);
		myEmployees[2] = new Employee("Amra Sabic", 5000, 183);
		myEmployees[3] = new Employee("Zaid Zerdo", 600, 192);
		
		// Arrays.sort(myEmployees);
		
		Employee.sortBySalary(myEmployees);
		
		System.out.println(Arrays.toString(myEmployees));
		
	}

}
