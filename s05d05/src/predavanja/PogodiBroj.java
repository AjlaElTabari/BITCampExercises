package predavanja;

import java.util.Scanner;

public class PogodiBroj {
	private int maxNo;
	private int minNo;
	private int noOfGueses;	
	
	public PogodiBroj(int maxNo, int noOfGuesses) {
		super();
		this.maxNo = maxNo;
		this.noOfGueses = noOfGuesses;
		this.minNo = 1;
	}
	
	public PogodiBroj() {
		this(100, 5);
	}
	
	public PogodiBroj(int maxNo) {
		this(maxNo, maxNo / 100 + 1);
	}
	
	/**
	 * Generate random number between two forwarded numbers
	 */
	public int generateNoInRange() {
		return (minNo + (int)(Math.random() * ((maxNo - minNo))));
	}

	/**
	 * Play Guess Number!
	 */
	public boolean guessNo(int desiredNo, int no) {
		if (no == desiredNo) {
			System.out.println("Congratulations, you successfully guessed the number!");
			return true;
		} else { 
			System.out.println("Try again!");
		}
		return false;
	}
	
	/**
	 * Simulates playing game of guessing no
	 * Asking user to enter number, while number of guesses 
	 * is smaller than max number of guesses
	 */
	public void igrajPogodiBroj() {
		Scanner input = new Scanner(System.in);
		
		int desiredNo = generateNoInRange();
		System.out.println(desiredNo);
		int counter = 0;
		
		do {
			System.out.println("Guess number");
			int no = input.nextInt();
			boolean gn = guessNo(desiredNo, no);
			if (gn) {
				break;
			}
			counter++;
		} while(counter < noOfGueses);
		
		System.out.println("Game over!");
		input.close();
	}
}
