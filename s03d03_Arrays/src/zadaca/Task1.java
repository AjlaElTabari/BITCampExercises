package zadaca;

import java.util.Arrays;

public class Task1 {

	public static void main(String[] args) {
		int[] arr = new int [100];
		int counter = 0;
		for(int i = 0; i < arr.length; i++) {
			arr[i] = counter;
			counter++;
			if(counter > 9){
				counter = 0;
			}
		}
		System.out.println(Arrays.toString(arr));
	}
}
