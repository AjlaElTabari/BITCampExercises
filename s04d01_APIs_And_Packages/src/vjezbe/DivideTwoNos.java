package vjezbe;

import java.util.InputMismatchException;

public class DivideTwoNos {

	public static void main(String[] args) {
		try {
			double a = Double.parseDouble(args[0]);
			double b = Double.parseDouble(args[1]);
			if (b == 0) {
				throw new ArithmeticException();
			}
			
			
			double div = a / b + 0.0;
			System.out.println(div);
		} catch (InputMismatchException e) {
			System.out.println("Wrong input");
		} catch (ArithmeticException e) {
			System.out.println("It is not allowed to divide with zero");
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("This method needs to receive two parameters");
		}

	}

}
