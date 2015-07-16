package vjezbe;

import java.util.Scanner;

public class MujoPoslijeObjasnjenja {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Mujo, how many containers do you have today?");
		int containers = input.nextInt();
		System.out.println("What is the capacity of dangerous matter your need to carry?");
		//int capacity = input.nextInt();
		
		input.close();
		
		int newContainers = containers, counter = 0;
		
		do {
			if (counter > 0) {
				newContainers = containers + counter;
			} else {
				newContainers = containers;
			}
			if (newContainers % 2 == 0) {
				newContainers /= 2;
			}
			else {
				counter++;
				break;
			}
		} while (newContainers > 1);
		
		/*for (int i = containers; i <= 1; i--) {
			if (counter > 0) {
				newContainers = containers + counter;
			} else {
				newContainers = containers;
			}
			for (int j = newContainers; j <= 1; j--) {
				if (newContainers % 2 == 0) {
					newContainers /= 2;
				}
				else {
					counter++;
					break;
				}
			}
		}*/

		System.out.println(counter);
		input.close();
	}

}
