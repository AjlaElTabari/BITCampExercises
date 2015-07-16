package predavanja;

public class Circle {
	private Coordinate2D centerPoint;
	private int radius;

	public Circle(int x, int y, int radius) {
		this.centerPoint = new Coordinate2D(x, y);
		this.radius = radius;
	}
	
	public Circle(Coordinate2D centerPoint, int radius) {
		this.centerPoint = centerPoint;
		this.radius = radius;
	}

	/**
	 * Checks if two circles are intersecting
	 * 
	 * @return
	 */
	public boolean areCirclesIntersecting(Circle otherCircle) {
		return (this.centerPoint.getDistance(otherCircle.centerPoint) > this.radius + otherCircle.radius) ? false : true;
	}

	// Getters and Setters for all attributes
	public Coordinate2D getcenterPoint() {
		return centerPoint;
	}

	public void setX(Coordinate2D centerPoint) {
		this.centerPoint = centerPoint;
	}

	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}

	/**
	 * Prints Circle information
	 */
	public String toString() {
		return String.format("Center: %s, radius: %d", centerPoint, radius);
	}

	/**
	 * Checks if two circles are equal
	 */
	public boolean equals(Circle otherCircle) {
		if (this.centerPoint.equals(otherCircle.centerPoint) && this.radius == otherCircle.radius) {
			return true;
		} else {
			return false;
		}
	}
}
