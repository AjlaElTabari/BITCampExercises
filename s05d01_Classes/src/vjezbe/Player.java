package vjezbe;

public class Player {
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
