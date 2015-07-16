package vjezbe;

import java.util.ArrayList;
import java.util.Arrays;

public class PartiallyFilledUsingArrayList {

	public static void main(String[] args) {
		System.out.println(returnArrayWithoutNulls("Ajla", null, "Gordan", null, "Zaid", null, null));
		
	}

	public static ArrayList<String> returnArrayWithoutNulls(String... arr) {
		ArrayList<String> list = new ArrayList<>();
		
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] != null) {
				list.add(arr[i]);
			}
		}
		return list;
	}

}
