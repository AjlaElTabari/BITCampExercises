

public class Voltage {

	public static void main(String[] args) {
		double voltage = 2000;
		double resistance = 1200;

		double current = voltage / resistance;
		
		boolean isAlive = current <= 0.1;	
	
		
		System.out.printf("\n\tI = %.2f [A] \n\tMoze se prezivjeti? %b", current, isAlive);

	}

}
