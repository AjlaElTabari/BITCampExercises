package array.lists;

import java.util.Arrays;

public class ArrayListInt {	
	private int[] array;
	
	public ArrayListInt() {
		array = new int[0];
	}
	
	public void add(int element) {
		int[] tempArray = new int[array.length + 1];
		
		for (int i = 0; i < array.length; i++) {
			tempArray[i] = array[i];
		}
		
		tempArray[array.length] = element;
		
		array = tempArray;
	}
	
	public int get(int index) {
		return array[index];
	}
	
	public void remove(int index) {
		int[] tempArray = new int[array.length - 1];
		
		for (int i = 0; i < index; i++) {
			tempArray[i] = array[i];
		}
		
		for (int i = index + 1; i < array.length; i++) {
			tempArray[i - 1] = array[i];
		}
		
		array = tempArray;
	}
	
	@Override
	public String toString() {
		return Arrays.toString(array);
	}
}
