package vjezbe;

import java.util.Arrays;

public class Nizovi5 {

	public static void main(String[] args) {
		int[] arr = new int[10];
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = (int)(Math.random()*10) + 1;
		}
		
		int[] arrLarger = new int[20];
		
		for (int i = 0; i < arr.length; i++) {
			arrLarger[i] = arr[i];
		}
		
		System.out.println(Arrays.toString(arrLarger));

	}

}
