package vjezbe;

import java.util.Arrays;

public class AtoZ {

	public static void main(String[] args) {
		System.out.println(Arrays.toString(sortArgsAlphabetically("Ajla", "Zaid", "Gordan", "1")));

	}
	
	public static String[] sortArgsAlphabetically(String... args) {
		Arrays.sort(args);
		return args;
	}
}
