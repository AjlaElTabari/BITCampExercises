package vjezbe;

import java.util.Arrays;

public class PartiallyFileld {

	public static void main(String[] args) {
		System.out.println(Arrays.toString(returnArrayWithoutNulls("Ajla", null, "Gordan", null, "Zaid", null, null)));

	}

	public static String[] returnArrayWithoutNulls(String... arr) {
		int counter = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] != null) {
				counter++;
			}
		}
		
		int counter1 = 0;
		String[] resArr = new String[counter];
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] != null) {
				resArr[counter1] = arr[i];
				counter1++;
			}
		}
		return resArr;
	}
}
