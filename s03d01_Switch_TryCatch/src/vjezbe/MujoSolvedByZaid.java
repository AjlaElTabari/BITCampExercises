package vjezbe;

import java.util.Scanner;

public class MujoSolvedByZaid {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Mujo, how many containers do you have today?");
		int containers = input.nextInt();
		System.out.println("What is the capacity of dangerous matter your need to carry?");
		int capacity = input.nextInt();
		
		input.close();
		
		@SuppressWarnings("unused")
		int counter = 0;
		int reducedContainers = containers;
		
		while (reducedContainers % 2 == 0) {
			reducedContainers /= 2;
		}
		if (reducedContainers > capacity) {
			containers++;
			counter++;
		}

		System.out.println(reducedContainers);
	}
}
