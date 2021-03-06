package vjezbe;


public class Javadoc {

	/**
	 * @author ajla.eltabari
	 * @param args
	 * 
	 */
	public static void main(String[] args) {
		printHello();
		System.out.println(getMax(9, 3));
	}

	/**
	 * <b> Prints Hello on standard output </b>
	 * check more on <i><u> www.java.com </u></i>
	 */
	public static void printHello() {
		System.out.println("Hello!");
	}
	
	/**
	 * <b> Determines which number is larger </b>
	 * <p>
	 * @param a integer number
	 * @param b integer number
	 * @return larger of received numbers as int
	 */
	public static int getMax (int a, int b) {
		return (a > b) ? a : b;
	}
}
