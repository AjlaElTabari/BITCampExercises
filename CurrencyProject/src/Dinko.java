
public class Dinko {

	/**
	 * <h1>Calculates the conversion</h1>
	 * The method takes 2 double variables and divides them.
	 * Then multiplies the result with the wanted amount and gives the result.
	 * @param currentCurrency : The currency that we want to covert
	 * @param amount : The wanted amount
	 * @param desiredCurrency : The currency we want to get
	 * @return  The result as a double
	 */
	public static double calculateConversion(double currentCurrency,
			double amount, double desiredCurrency) {
		return desiredCurrency / currentCurrency * amount;
	}
}
