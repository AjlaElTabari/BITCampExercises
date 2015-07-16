package vjezbe;

import java.util.Arrays;

public class FindTheOne {

	public static void main(String[] args) {
		String s = "AnaVoliMilovana";
		char c = 'r';
		
		System.out.println(existsCharacter(s, c));
	}

	public static boolean existsCharacter(String s, char c) {
		char[] arr = new char[s.length()];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = s.charAt(i);
		}
		
		Arrays.sort(arr);
		return (Arrays.binarySearch(arr, c) > 0) ? true : false; 
		
	}
}
