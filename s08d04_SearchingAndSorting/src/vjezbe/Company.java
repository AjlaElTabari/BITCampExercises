package vjezbe;

import java.util.ArrayList;

/**
 * Describes a company with employees Contains only a list of employees And
 * methods to hire and fire an employee
 * 
 * @author ajla.eltabari
 *
 */
public class Company {
	
	private ArrayList<Employee> employees;

	/**
	 * @param employees
	 */
	public Company(ArrayList<Employee> employees) {
		super();
		this.employees = employees;
	}

	/**
	 * Hires an employee if he/she is not already hired.
	 * 
	 * @param employee
	 */
	public void hireEmployee(Employee employee) {
		boolean isHired = false;
		for (int i = 0; i < employees.size(); i++) {
			if (employees.get(i).equals(employee)) {
				isHired = true;
				break;
			}
		}
		if (isHired) {
			System.out.println("Desired employee is already hired.");
		} else {
			employees.add(employee);
		}
	}

	/**
	 * Fires an employee if he/she already works hire.
	 * 
	 * @param employee
	 */
	public void fireEmployee(Employee employee) {
		boolean isHired = false;
		for (int i = 0; i < employees.size(); i++) {
			if (employees.get(i).equals(employee)) {
				isHired = true;
				break;
			}
		}
		if (!isHired) {
			System.out
					.println("Desired employee is doesn't work in our company. You cannot fire him/her");
		} else {
			employees.remove(employee);
		}
	}

	/**
	 * Checks if person is an employee in this company
	 */
	public boolean isWorkingHere(Employee employee) {
		boolean isWorkingHere = false;
		for (int i = 0; i < employees.size(); i++) {
			if (employees.get(i).equals(employee)) {
				isWorkingHere = true;
				break;
			}
		}
		return isWorkingHere;
	}
	
	/**
	 * Checks if person is an employee in this company
	 */
	public boolean hasFemaleEmployees() {
		boolean hasFemales = false;
		for (int i = 0; i < employees.size(); i++) {
			if (employees.get(i).isSex()) {
				hasFemales = true;
				break;
			}
		}
		return hasFemales;
	}
	
	/**
	 * Sorts employees by ID using selection sort
	 */
	public void sortEmployeesByConditionUsingSelectionSort(String condition) {
		for (int i = 0; i < employees.size() - 1; i++) {
			int minIndex = findSmallestElementInRange(employees, i, condition);
			
			Employee temp = employees.get(i);
			employees.set(i, employees.get(minIndex));
			employees.set(minIndex, temp);
		}
		System.out.println(employees);
	}
	
	/**
	 * Finds the index of the smallest element in the
	 * given range [startIndex, array.length).
	 */
	public static int findSmallestElementInRange(ArrayList<Employee> employees, int startIndex, String condition) {
		int minIndex = startIndex;
		if(condition.equals("ID")) {
			for (int i = startIndex; i < employees.size(); i++) {
				if (employees.get(i).getId() < employees.get(minIndex).getId()) {
					minIndex = i;
				}
			}
		} else if (condition.equals("age")) {
			for (int i = startIndex; i < employees.size(); i++) {
				if (employees.get(i).getBirthday().getYear() < employees.get(minIndex).getBirthday().getYear()) {
					minIndex = i;
				}
			}
		}

		return minIndex;
	}

	/**
	 * Sorts list of employees by condition, using insertion sort
	 * @param condition
	 */
	public void sortEmployeesByConditionUsingInsertionSort(String condition) {
		if (condition.equals("salary")) {
			for (int i = 1; i < employees.size(); i++) {
				double temp = employees.get(i).getSalary();
				
				int j;
				for (j = i - 1; j >= 0; j--) {
					if (employees.get(j).getSalary() < temp) {
						break;
					}
					employees.set(j + 1, employees.get(j));
				}
				employees.get(j + 1).setSalary(temp);
			}
		}
		if (condition.equals("gender")) {
			for (int i = 1; i < employees.size(); i++) {
				boolean temp = employees.get(i).isSex();
				
				int j;
				for (j = i - 1; j >= 0; j--) {
					if (employees.get(j).isSex() == temp) {
						break;
					}
					employees.set(j + 1, employees.get(j));
				}
				employees.get(j + 1).setSex(temp);
			}
		}
		System.out.println(employees);
	}
	
	/**
	 * Checks if employees are sorted by IDs
	 * @return true if they are
	 */
	public boolean areEmployeesSortedByID() {
		boolean isSorted = true;
		int counter = 0;
		while (isSorted && counter < employees.size() - 1) {
			if(employees.get(counter).getId() < employees.get(counter + 1).getId()) {
				counter++;
			} else {
				isSorted = false;
				break;
			}
		}
		return isSorted;
	}
	
	/**
	 * Returns Employee object by given ID
	 */
	
	public int getEmployee(int id) {
		return getEmployee(id, 0, employees.size() - 1);
	}
	
	private int getEmployee(int id, int start, int end) {
		if (start >= end) {
			return -1;
		}
		
		int middle = (start + end) / 2;
		if (employees.get(middle).getId() == id) {
			return middle;
		}
		
		if (employees.get(middle).getId() > id) {
			return getEmployee(id, start, middle);
		} else {
			return getEmployee(id, middle + 1, end);
		}
	}
	
	@Override
	public String toString() {
		return "Company [employees=" + employees + "]";
	}
	
	// Treca strana
	
	// returns array list of employees
	public ArrayList<Employee> getEmployeeList() {
		return employees;
	}
	
	// adds several employees using varargs
	public void addEmployees(Employee... e) {
		for (int j = 0; j < e.length; j++) {
			boolean isHired = false;
			for (int i = 0; i < employees.size(); i++) {
				if (employees.get(i).equals(e[i])) {
					isHired = true;
					break;
				}
			}
			if (isHired) {
				System.out.println("Desired employee is already hired.");
			} else {
				employees.add(e[j]);
			}
		}
	}
	
	// adds several employees using an array
	public void addArrayOfEmployees(Employee[] e) {
		for (int j = 0; j < e.length; j++) {
			boolean isHired = false;
			for (int i = 0; i < employees.size(); i++) {
				if (employees.get(i).equals(e[i])) {
					isHired = true;
					break;
				}
			}
			if (isHired) {
				System.out.println("Desired employee is already hired.");
			} else {
				employees.add(e[j]);
			}
		}
	}
	
	

}
