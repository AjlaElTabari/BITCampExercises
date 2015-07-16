package vjezbe;

import java.util.Scanner;

public class Mujo {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
			
		// Asking Mujo to enter how many containers does he have, and what amount he needs to carry
		System.out.println("Mujo, how many containers do you have today?");
		int containers = input.nextInt();
		System.out.println("What is the capacity of dangerous matter your need to carry?");
		int capacity = input.nextInt();

		int optimalNoOfContainers = containers, newContainers = 0;
		boolean enoughContainers = true;
		
		//Checking if Mujo needs more containers today
		while(optimalNoOfContainers > capacity){
			if(!enoughContainers) {
				// Buying new containers 
				optimalNoOfContainers = containers + newContainers;
				enoughContainers = true;
			}
			if(optimalNoOfContainers % 2 == 0) {
				// If there is same amount of dangerous matter in two containers, Mujo can join two of them  
				optimalNoOfContainers /= 2;
			} else {
				// If there is not the same mount of dangerous matter in two containers, Mujo needs to buy new containers
				enoughContainers = false;
				newContainers++;		
			}
		}
		
		System.out.println("Mujo, you have to buy another " + newContainers + " container(s)");
		
		input.close();


	}

}
