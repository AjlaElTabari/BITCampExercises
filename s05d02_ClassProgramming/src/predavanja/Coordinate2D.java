package predavanja;

public class Coordinate2D {
	private int x;
	private int y;
	
	/**
	 * @param x
	 * @param y
	 */
	public Coordinate2D(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	// Copy constructor
		public Coordinate2D(Coordinate2D otherCoordinate) {
			this(otherCoordinate.x, otherCoordinate.y);
		}
	
	/**
	 * Get distance between two coordinates
	 * @param otherCoordinate
	 * @return double as distance
	 */
	public double getDistance(Coordinate2D otherCoordinate) {
		int deltaX = this.x - otherCoordinate.x;
		int deltaY = this.y - otherCoordinate.y;
		
		deltaX *= deltaX;
		deltaY *= deltaY;
		
		return Math.sqrt((deltaX + deltaY));
	}
	
	/**
	 * Prints Coordinate2D information
	 */
	public String toString() {
		return String.format("(%d, %d)", x, y);
	}

	/**
	 * Checks if two objects are equals
	 * @param otherCoordinate
	 * @return true if they are, and false if they are not
	 */
	public boolean equals(Coordinate2D otherCoordinate) {
		if (this.x == otherCoordinate.x && this.y == otherCoordinate.y) {
			return true;
		} else {
			return false;
		}
	}
}
