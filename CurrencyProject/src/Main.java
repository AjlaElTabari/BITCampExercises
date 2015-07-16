
public class Main {

	public static void main(String[] args) {
		
		
		
		String currentCurrency = args[0];
		System.out.println("Current currency: " + currentCurrency);
		
		Double amount = Double.parseDouble(args[1]);
		System.out.println("Amount: " + amount);
		
		String desiredCurrency = args[2];
		System.out.println("Desired currency: " + desiredCurrency);
		String excangeCurrencyRatesDestination = "src/ba/BITCamp/A_Team/CurrencyProject/Currency.txt";
		Ajla.generateWellcomeMsg(excangeCurrencyRatesDestination);
		
		try {
			
			double currCurency = Double.parseDouble(Adis.getExchangeRates(
					currentCurrency, excangeCurrencyRatesDestination));
			double desCurency = Double.parseDouble(Adis.getExchangeRates(
					desiredCurrency, excangeCurrencyRatesDestination));

			System.out.printf("%.5f %s = %.5f %s\n", amount, currentCurrency,
					Dinko.calculateConversion(currCurency, amount, desCurency),
					desiredCurrency);
			
		} catch (IllegalArgumentException e) {
			System.out.println("Unknown currency format.");
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("This program demands at least three arguments.");
		} 

	}

}
