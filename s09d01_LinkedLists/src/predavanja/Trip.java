package predavanja;

public class Trip {
	private Place start;
	
	/**
	 * @return the start
	 */
	public Place getStart() {
		return start;
	}
	
	/**
	 * @param start the start to set
	 */
	public void setStart(Place start) {
		this.start = start;
	}

	public void addPlace(Place newPlace) {
		
		if (start == null) {
			start = newPlace;
		} else {
			Place last = start;
			while (last.getNext() != null) {
				last = last.getNext();
			}

		last.setNext(newPlace);
		}
	}
	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		String result = "";
		Place currentPlace = start;
		
		while (currentPlace != null) {
			result += String.format("%s\n", currentPlace.getName());
			currentPlace = currentPlace.getNext();
		}
		return result;
	}
}
