package vjezbe;

public class Rectangle implements Shape, Drawable {
	private int length;
	private int width;

	/**
	 * @param length
	 * @param width
	 */
	public Rectangle(int length, int width) {
		super();
		this.length = length;
		this.width = width;
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

	/**
	 * @return the width
	 */
	public int getWidth() {
		return width;
	}

	/**
	 * @param width the width to set
	 */
	public void setWidth(int width) {
		this.width = width;
	}

	@Override
	public void drawOnConsole() {
		for (int i = 0; i < width; i++) {
			for (int j = 0; j < length; j++) {
				System.out.print("•");
			}
			System.out.println();
		}
		
	}

	@Override
	public int getCircumference() {
		return 2 * length + 2 * width;
	}

	@Override
	public int getArea() {
		return length * width;
	}



	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Rectangle [length=" + length + ", width=" + width + "]";
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
		Rectangle other = (Rectangle) obj;
		if (length != other.length)
			return false;
		if (width != other.width)
			return false;
		return true;
	}
	
	

}
