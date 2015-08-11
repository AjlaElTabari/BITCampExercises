package vjezbe;

import java.util.ArrayList;

public class Employee {
	private int id;
	private String name;
	private int salary;
	private boolean hasContract;
	
	/**
	 * @param id
	 * @param name
	 * @param salary
	 * @param hasContract
	 */
	public Employee(int id, String name, int salary, boolean hasContract) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.hasContract = hasContract;
	}

	/**
	 * 
	 */
	public Employee() {
		super();
	}
	
	

	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the salary
	 */
	public int getSalary() {
		return salary;
	}

	/**
	 * @param salary the salary to set
	 */
	public void setSalary(int salary) {
		this.salary = salary;
	}

	/**
	 * @return the hasContract
	 */
	public boolean isHasContract() {
		return hasContract;
	}

	/**
	 * @param hasContract the hasContract to set
	 */
	public void setHasContract(boolean hasContract) {
		this.hasContract = hasContract;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", salary=" + salary
				+ ", hasContract=" + hasContract + "]\n";
	}
	
	public static ArrayList<Employee> getPersonsWIthSalaryOver5000(ArrayList<Employee> allPersons) {
		ArrayList<Employee> persons = new ArrayList<>();
		for (Employee p : allPersons) {
			if (p.getSalary() > 5000) {
				persons.add(p);
			}
		}
		return persons;
	}
	
	public static ArrayList<Employee> getPersonsBySlaraYAndId(ArrayList<Employee> allPersons) {
		ArrayList<Employee> persons = new ArrayList<>();
		for (Employee p : allPersons) {
			if (p.getSalary() > 5000 && p.getId() > 2) {
				persons.add(p);
			}
		}
		return persons;
	}
	
	public static void getNames(ArrayList<Employee> allPersons) {
		for (Employee p : allPersons) {
			System.out.println(p.getName());
		}
	}
	
	public static void getNamesAndSalaries(ArrayList<Employee> allPersons) {
		for (Employee p : allPersons) {
			System.out.println(p.getName() + " " + p.getSalary());
		}
	}
	
}	
