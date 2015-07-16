package vjezbe;


//Wrapper classes
public class Example2 {

	public static void main(String[] args) {
		// double
		// Double
		double d1 = 5.5;
		Double d2 = 5.5;

		System.out.println(Double.MAX_VALUE);
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Long.MAX_VALUE);
		
		System.out.println(Double.parseDouble("5.5"));
		System.out.println(Integer.parseInt("5"));
		System.out.println(Long.parseLong("5"));
		
		System.out.println(Double.valueOf("5.5"));
		System.out.println(Integer.valueOf("5"));
		System.out.println(Long.valueOf("5"));
		
		
		if (d1 == d2) {
			System.out.println("Ne valja!!");
		}
		
		if (d2.equals(d1)) {
			System.out.println("Uredu je");
		}

		// Character klasa ima finih metoda
	}

}
