package predavanja;

import java.util.Arrays;

public class Sorting {

    public static void main(String[] args) {

            int arraySize = 1000000;
            int[] array = new int[arraySize];

            for (int i = 0; i < array.length; i++) {
                    array[i] = i;
            }

            System.out.println(Arrays.toString(array));
            
            Arrays.sort(array);

            System.out.println(Arrays.toString(array));
            
            System.out.println(search(array, 155));
            
            System.out.println(insertionSort(array));

    }

    // Bubble sort
    public static void sortArray(int[] array) {
            // for (int j = 0; j < array.length; j++) {
            boolean sorted = false;
            while (!sorted) {
                    sorted = true;
                    for (int i = 0; i < array.length - 1; i++) {
                            if (array[i] > array[i + 1]) {
                                    sorted = false;
                                    int temp = array[i];
                                    array[i] = array[i + 1];
                                    array[i + 1] = temp;
                            }
                    }
            }

    }

    // Binary search
    public static int search(int[] array, int number){
            int min = 0;
            int max = array.length-1;
            
            while(true){
            int mid = (min + max)/2;
            
            
            if(array[mid] == number){
                    return mid;
            }else if (array[mid] > number){
                    max = mid -1;
            }else{
                    min = mid +1;
            }
            if(min > max){
                    break;
            }
            }
            return -1;
            
    }
    
    // Insertion sort 
    public static int[] insertionSort(int[] a) {
    	int temp = 0, location = 0;
    	for (int i = 1; i < a.length; i++) {
    		temp = a[i];
    		location = i - 1;
    		
    		while(location >= 0 && temp < a[location]) {
    			a[location + 1] = a[location];
    			location--;
    		}
    		a[location + 1] = temp;
    	}
    	return a;
    }
}