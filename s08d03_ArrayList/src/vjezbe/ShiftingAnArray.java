package vjezbe;

import java.util.Arrays;

public class ShiftingAnArray {

	public static void main(String[] args) {
		char[] arr = {'A', 'B', 'C', 'D', 'A'};
		shiftAnArray(arr);

	}
	
	public static void shiftAnArray(char[] arr) {
		char tmp = arr[arr.length - 1];
		
		for (int i = arr.length - 2; i >= 0; i--) {                
		    arr[i + 1] = arr[i];
		}
		arr[0] = tmp;
		
		System.out.println(Arrays.toString(arr));
	}

}
