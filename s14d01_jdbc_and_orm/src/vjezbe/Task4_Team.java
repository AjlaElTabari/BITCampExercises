package vjezbe;

public class Task4_Team {
	private int id;
	private String name;
	private int wins;
	private int losses;
	private int points;
	private int scoredplus;
	private int scoredminus;
	private String fromgroup;
	
	/**
	 * @param id
	 * @param name
	 * @param wins
	 * @param losses
	 * @param points
	 * @param scoredplus
	 * @param scoredminus
	 * @param fromgroup
	 */
	public Task4_Team(int id, String name, int wins, int losses, int points,
			int scoredplus, int scoredminus, String fromgroup) {
		super();
		this.id = id;
		this.name = name;
		this.wins = wins;
		this.losses = losses;
		this.points = points;
		this.scoredplus = scoredplus;
		this.scoredminus = scoredminus;
		this.fromgroup = fromgroup;
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
	 * @return the wins
	 */
	public int getWins() {
		return wins;
	}

	/**
	 * @param wins the wins to set
	 */
	public void setWins(int wins) {
		this.wins = wins;
	}

	/**
	 * @return the losses
	 */
	public int getLosses() {
		return losses;
	}

	/**
	 * @param losses the losses to set
	 */
	public void setLosses(int losses) {
		this.losses = losses;
	}

	/**
	 * @return the points
	 */
	public int getPoints() {
		return points;
	}

	/**
	 * @param points the points to set
	 */
	public void setPoints(int points) {
		this.points = points;
	}

	/**
	 * @return the scoredplus
	 */
	public int getScoredplus() {
		return scoredplus;
	}

	/**
	 * @param scoredplus the scoredplus to set
	 */
	public void setScoredplus(int scoredplus) {
		this.scoredplus = scoredplus;
	}

	/**
	 * @return the scoredminus
	 */
	public int getScoredminus() {
		return scoredminus;
	}

	/**
	 * @param scoredminus the scoredminus to set
	 */
	public void setScoredminus(int scoredminus) {
		this.scoredminus = scoredminus;
	}

	/**
	 * @return the fromgroup
	 */
	public String getFromgroup() {
		return fromgroup;
	}

	/**
	 * @param fromgroup the fromgroup to set
	 */
	public void setFromgroup(String fromgroup) {
		this.fromgroup = fromgroup;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Team(" + id + "): " + name + " | wins = " + wins
				+ ", losses = " + losses + ", points = " + points + ", scoredplus = "
				+ scoredplus + ", scoredminus = " + scoredminus + ", fromgroup = "
				+ fromgroup + ".\n";
	}
	
	
}
