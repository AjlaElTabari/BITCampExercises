package predavanja;

import java.io.Serializable;

public class User implements Serializable{

	private static final long serialVersionUID = 5800087614003386774L;
	
	private String name;
	private int age;
	
	/**
	 * @param name
	 * @param age
	 */
	public User(String name, int age) {
		super();
		this.name = name;
		this.age = age;
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
	 * @return the age
	 */
	public int getAge() {
		return age;
	}

	/**
	 * @param age the age to set
	 */
	public void setAge(int age) {
		this.age = age;
	}
	
	public String toString() {
		return "User: " + name + "(" + ")";
	}
	
}
