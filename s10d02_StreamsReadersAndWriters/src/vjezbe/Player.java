package vjezbe;

import java.io.Serializable;

public class Player implements Serializable {

	private static final long serialVersionUID = 1099214284623173569L;
	private String name;
	private String club;
	private String nationality;
	private int goalsScored;
	
	/**
	 * @param name
	 * @param club
	 * @param nationality
	 */
	public Player(String name, String club, String nationality) {
		super();
		this.name = name;
		this.club = club;
		this.nationality = nationality;
		goalsScored = 0;
	}
	
	public int getGoals() {
		return goalsScored;
	}
	
	public int addGoals(int goals) {
		return goalsScored += goals;
	}
	
	public String toString() {
		return "The best player in the world is: " + name + "\nHe is playing for " + club + "\nHe has " + nationality + " nationality.";
	}
	
}
