package predavanja;

public class Person {
	private String name;
	private String lastname;
	public int yearOfBirth;
	private String address;
	private String personalId;
	private String email;
	private int height;
	private boolean isValid;
	private String favFood;
	private String favDrink;
	
	/**
	 * @param name
	 * @param lastname
	 * @param yearOfBirth
	 * @param address
	 * @param personalId
	 * @param email
	 * @param height
	 * @param isValid
	 * @param favFood
	 * @param favDrink
	 */
	public Person(String name, String lastname, int yearOfBirth, String address,
			String personalId, String email, int height, boolean isValid,
			String favFood, String favDrink) {
		super();
		this.name = name;
		this.lastname = lastname;
		this.yearOfBirth = yearOfBirth;
		this.address = address;
		this.personalId = personalId;
		this.email = email;
		this.height = height;
		this.isValid = isValid;
		this.favFood = favFood;
		this.favDrink = favDrink;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Person [name=" + name + ", lastname=" + lastname
				+ ", yearOfBirth=" + yearOfBirth + ", address=" + address
				+ ", personalId=" + personalId + ", email=" + email
				+ ", height=" + height + ", isValid=" + isValid + ", favFood="
				+ favFood + ", favDrink=" + favDrink + "]";
	}
	
	
	
	
}
