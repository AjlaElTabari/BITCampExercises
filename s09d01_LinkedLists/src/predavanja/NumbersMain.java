package predavanja;

import java.util.Scanner;

public class NumbersMain {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		Node head = null;
		Node last = null;
		
		System.out.println("Input numbers. Input zero to terminate input.");
		while(true) {
			int n = input.nextInt();
			if(n > 0) {
				Node newNode = new Node(n);
				
				if(head == null && last == null) {
					head = newNode;
					last = newNode;
				} else {
					last.setNext(newNode);
					last = newNode;
				}
			} else {
				break;
			}
		}

		int length = 0;
		Node currentNode = head;
		
		while (currentNode != null) {
			length++;
			currentNode = currentNode.getNext();
		}
		
		System.out.println("Length is: " + length);
		
		int sum = 0;
		Node nodeToSum = head;
		
		while (nodeToSum != null) {
			sum += nodeToSum.getValue();
			nodeToSum = nodeToSum.getNext();
		}

		System.out.println("Sum is: " + sum);
		
		input.close();
	}

}
