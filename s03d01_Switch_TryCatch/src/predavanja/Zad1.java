package predavanja;

import java.util.Scanner;

public class Zad1 {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		String expression = "";
		
		System.out.println("Enter desired expression");
		expression = input.nextLine();
		
		int expressionLength = expression.length();
		int a = 0, b = 0;
		String operand = "", as = "", bs = "";
		
		for (int i = 0; i < expressionLength; i++) {
			char character;
			character = expression.charAt(i);
			while (character != '+' || character != '-') {
				as += character;
			}
			if (character != '+' || character != '-') {
				operand += character;
			}
			while (i < expressionLength) {
				bs += character;
			}
		}
		
		System.out.println(as + operand + bs);
		input.close();
	}

}
