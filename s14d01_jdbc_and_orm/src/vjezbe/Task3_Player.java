package vjezbe;

public class Task3_Player {
	private int id;
	private String name;
	private String grade;
	
	/**
	 * @param id
	 * @param name
	 * @param grade
	 */
	public Task3_Player(int id, String name, String grade) {
		super();
		this.id = id;
		this.name = name;
		this.grade = grade;
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
	 * @return the grade
	 */
	public String getGrade() {
		return grade;
	}

	/**
	 * @param grade the grade to set
	 */
	public void setGrade(String grade) {
		this.grade = grade;
	}
	
	public String toString() {
		return id + " " + name + " " + grade;
	}
	
}
