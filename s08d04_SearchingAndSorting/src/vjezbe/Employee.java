package vjezbe;

/**
 * Describes an employee. 
 * An Employee is defined by his own unique ID and basic personal information
 * Employee birthday is defined as separate inner class Birthday
 * 
 * @author ajla.eltabari
 *
 */
public class Employee {
	/**
	 * @param sex the sex to set
	 */
	public void setSex(boolean sex) {
		this.sex = sex;
	}



	private static int ID_COUNTER = 1000;
	private int id;
	private String name;
	private String lastname;
	private boolean sex;
	private double salary;
	private Birthday birthday;

	/**
	 * @param id
	 * @param name
	 * @param lastname
	 * @param sex
	 * @param salary
	 * @param birthday
	 */
	public Employee(String name, String lastname, boolean sex,
			double salary, int day, int month, int year) {
		super();
		this.id = ID_COUNTER++;
		this.name = name;
		this.lastname = lastname;
		this.sex = sex;
		this.salary = salary;
		this.birthday = new Birthday(day, month, year);
	}
	
	// GETTERS AND SETTERS
	/**
	 * @return the id
	 */
	public int getId() {
		return id;
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
	 * @return the lastname
	 */
	public String getLastname() {
		return lastname;
	}

	/**
	 * @param lastname the lastname to set
	 */
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	/**
	 * @return the sex
	 */
	public boolean isSex() {
		return sex;
	}

	/**
	 * @return the salary
	 */
	public double getSalary() {
		return salary;
	}

	/**
	 * @param salary the salary to set
	 */
	public void setSalary(double salary) {
		this.salary = salary;
	}

	/**
	 * @return the birthday
	 */
	public Birthday getBirthday() {
		return birthday;
	}
	
	/**
	 * Returns string with information about an employee
	 */
	@Override
	public String toString() {
		
		String s = "Employee: " + id + "\n";
		s += name + " " + lastname + "\n";
		s += (sex) ? "Sex: Female\n" : " Sex: Male\n";
		s += "Salary: " + salary + "\n";
		s += "Birthday: " + birthday.toString() + "\n";
		
		return s;
	}

	/**
	 * Checks of two employee objects are equal
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
		if (birthday == null) {
			if (other.birthday != null)
				return false;
		} else if (!birthday.equals(other.birthday))
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
		if (Double.doubleToLongBits(salary) != Double
				.doubleToLongBits(other.salary))
			return false;
		if (sex != other.sex)
			return false;
		return true;
	}



	/**
	 * Inner class of Employee class
	 * Describes date of birth for employee
	 * Date of birth is defined by three integer numbers, 
	 * as Day, month and year
	 * 
	 * @author ajla.eltabari
	 *
	 */
	class Birthday {

		private int day;
		private int month;
		private int year;
		
		/**
		 * Constructor
		 * Receives three integer parameters for day, month and year, 
		 * and makes Birthday object
		 * @param day
		 * @param month
		 * @param year
		 */
		public Birthday(int day, int month, int year) {
			this.day = day;
			this.month = month;
			this.year = year;
		}
		
		/**
		 * @return the year
		 */
		public int getYear() {
			return year;
		}
		
		/**
		 * Returns string with date of birth in format: DD. MM. YYYY.
		 */
		@Override
		public String toString() {
			return day + ". " + month + ". " + year + ".";
		}

		/**
		 * Checks if two birthdays are equal
		 */
		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			if (day != birthday.day)
				return false;
			if (month != birthday.month)
				return false;
			if (year != birthday.year)
				return false;
			return true;
		}
	}
}
