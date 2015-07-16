package vjezbe;

public class Line implements Shape, Drawable {
	private int length;

	/**
	 * @param length
	 */
	public Line(int length) {
		super();
		this.length = length;
	}

	/**
	 * @return the length
	 */
	public int getLength() {
		return length;
	}

	/**
	 * @param length the length to set
	 */
	public void setLength(int length) {
		this.length = length;
	}

	@Override
	public void drawOnConsole() {
		for (int i = 0; i < length; i++) {
			System.out.print("•");
		}
		
	}

	@Override
	public int getCircumference() {
		return length;
	}

	@Override
	public int getArea() {
		// TODO Auto-generated method stub
		return 0;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Line [length=" + length + "]";
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Line other = (Line) obj;
		if (length != other.length)
			return false;
		return true;
	}

	
}
