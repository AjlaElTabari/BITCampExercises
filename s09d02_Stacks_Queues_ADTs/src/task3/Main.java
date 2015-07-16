package task3;

import task1.StringStackArrays;
import task2.StringStackLinkedLists;

public class Main {

	public static void main(String[] args) {

		// Using arrays
		StringStackArrays stackArray = new StringStackArrays();	
		// Using linked lists
		StringStackLinkedLists stackLinkedLists = new StringStackLinkedLists();
		
		// PUSH
		long startStackArrayPush = System.currentTimeMillis();
		for (int i = 0; i < 100000; i++) {
			stackArray.push("Amra" + i);
		}
		System.out.println("stackArray PUSH: " + (System.currentTimeMillis() - startStackArrayPush));
		
		long startStackLinkedListsPush = System.currentTimeMillis();
		for (int i = 0; i < 100000; i++) {
			stackLinkedLists.push("Amra" + i);
		}
		System.out.println("startStackLinkedLists PUSH: " + (System.currentTimeMillis() - startStackLinkedListsPush));
		
		// POP
		long startStackArrayPop = System.currentTimeMillis();
		for (int i = 0; i < 100000; i++) {
			stackArray.pop();
		}
		System.out.println("stackArray POP: " + (System.currentTimeMillis() - startStackArrayPop));
		
		long startStackLinkedListsPop = System.currentTimeMillis();
		for (int i = 0; i < 100000; i++) {
			stackLinkedLists.pop();
		}
		System.out.println("startStackLinkedLists POP: " + (System.currentTimeMillis() - startStackLinkedListsPop));
	}

}
