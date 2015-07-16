package vjezbe;

import java.util.ArrayList;
import java.util.Arrays;

public class ShiftingArrayUsingArrayList {

	public static void main(String[] args) {

		ArrayList<Character> arr = new ArrayList(Arrays.asList('A', 'B', 'C', 'D', 'A'));
		shiftAnArray(arr);

	}
	
	public static void shiftAnArray(ArrayList<Character> arr) {
		char tmp = arr.get(arr.size()-1);
		
		for (int i = arr.size() - 2; i >= 0; i--) {
			arr.set(i + 1, arr.get(i));
		}
		arr.set(0, tmp);
		
		System.out.println(arr);
	}
}
