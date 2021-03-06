package predavanja;

public class Person {
	private static int userCount = 0;
	private int id;
	private String name;
	private String lastname;
	private int years;
	
	/**
	 * @param name
	 * @param lastname
	 * @param years
	 */
	public Person(String name, String lastname, int years) {
		super();
		this.name = name;
		this.lastname = lastname;
		this.years = years;
		this.id = ++userCount;
	}
	
	/**
	 * @param name
	 * @param lastname
	 */
	public Person(String name, String lastname) {
		this(name, lastname, 0);
	}
	
	// Copy constructor
	public Person(Person otherPerson) {
		this(otherPerson.name, otherPerson.lastname, otherPerson.years);
		userCount--;
		this.id = otherPerson.id;
	}
	
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
	 * @return the years
	 */
	public int getYears() {
		return years;
	}

	/**
	 * @param years the years to set
	 */
	public void setYears(int years) {
		this.years = years;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return String.format("Name: %s, Lastname: %s, Id: %d", name, lastname, id);
	}


	public boolean equals(Person other) {
		if (this.name.equals(other.name) && this.lastname.equals(other.lastname) && this.id == other.id) {
			return true;
		} else {
			return false;
		}
	}



	
	
}
