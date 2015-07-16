package vjezbe;

public class SquareArea {

	public static void main(String[] args) {
		try {
			System.out.println(getSquareArea(-10));
		} catch (IllegalArgumentException e) {
			System.out.println("Size of edge is not valid.");
		}
		

	}

	/**
	 * <b>Calculate square area </b>
	 * <p>
	 * Calculate square area using given edge value, as parameter.
	 * @param a - square edge as int
	 * @return square area
	 * @exception IllegalArgumentException if edge value a < 0
	 * 
	 */
	public static int getSquareArea(int a) {
		if(a < 0) {
			throw new IllegalArgumentException();
		}
		return (int)Math.pow(a, 2);
		
	}
}
