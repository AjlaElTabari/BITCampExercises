package predavanja;

public class Place {

	private String name;
	private Place next;
	
	
	/**
	 * @param name
	 */
	public Place(String name) {
		super();
		this.name = name;
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
	 * @return the next
	 */
	public Place getNext() {
		return next;
	}



	/**
	 * @param next the next to set
	 */
	public void setNext(Place next) {
		this.next = next;
	}


	
	

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return name;
	}
	
}
