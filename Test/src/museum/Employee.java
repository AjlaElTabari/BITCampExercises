package museum;

/**
 * Represents an Employee of the museum.
 * 
 * @author ajla.eltabari
 *
 */
public class Employee implements Searchable {
	public enum Position {
		DIRECTOR, CEO, STAFF, APPRAISER
	};

	private String name;
	private String lastname;
	private String jmbg;
	private Position position;
	private int salary;

	/**
	 * Constructor that creates an Employee object
	 * 
	 * @param name
	 * @param lastname
	 * @param jmbg
	 * @param position
	 * @param salary
	 */
	public Employee(String name, String lastname, String jmbg,
			Position position, int salary) {
		super();
		this.name = name;
		this.lastname = lastname;
		this.jmbg = jmbg;
		this.position = position;
		this.salary = salary;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		if (jmbg == null) {
			if (other.jmbg != null)
				return false;
		} else if (!jmbg.equals(other.jmbg))
			return false;
		if (lastname == null) {
			if (other.lastname != null)
				return false;
		} else if (!lastname.equals(other.lastname))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (position != other.position)
			return false;
		if (salary != other.salary)
			return false;
		return true;
	}

	/**
	 * Prints out information about an employee
	 */

	public String toString() {
		return String
				.format("%s %s \nJMBG: %s \nPosition: %s \nSalary: %d KM",
						this.name, this.lastname, this.jmbg, this.position,
						this.salary);
	}

	/**
	 * Searches all employee's attributes for provided string
	 */
	@Override
	public boolean fitsSearch(String s) {
		if (name.equalsIgnoreCase(s)) {
			return true;
		} else if (lastname.equalsIgnoreCase(s)) {
			return true;
		} else if (s.equalsIgnoreCase(this.position.toString())) {
			return true;
		} else if (salary == Integer.parseInt(s)) {
			return true;
		}
		return false;
	}

}
