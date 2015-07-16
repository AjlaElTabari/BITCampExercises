package predavanja;

import java.util.Scanner;

public class Expression {

	@SuppressWarnings("static-access")
	public static void main(String[] args) {
		// Asking user to enter expression in specified format a + b  or a - b or a / b or a * b
		Scanner input = new Scanner(System.in);
		System.out
				.println("Enter desired expression");
		String expression = input.next();

		
		int expressionLength = expression.length();
		
		int operandIndex = expression.indexOf("+");
		if(operandIndex == -1) {
			operandIndex = expression.indexOf("-");
		} 
		if(operandIndex == -1) {
			operandIndex = expression.indexOf("*");
		} 
		if(operandIndex == -1) {
			operandIndex = expression.indexOf("/");
		}
		
		String as = "", bs = "";
		char operand = ' ';
		Integer a = 0, b = 0;
		
		as = expression.substring(0, operandIndex);
		bs = expression.substring(operandIndex + 1, expressionLength);
		operand = expression.charAt(operandIndex);
		
		int result = 0;
		try {
			a = a.parseInt(as);
			b = b.parseInt(bs);
		} catch (NumberFormatException e){
			System.out.println("Pogresan unos!");
			e.printStackTrace();
		}
		
		if (operand == '+') {
			result = a + b;
		} else if (operand == '-') {
			result = a - b;
		} else if (operand == '/') {
			result = a / b;
		} else if (operand == '*') {
			result = a * b;
		}
	
		
		
		System.out.println(expression + "=" + result);
		

		input.close();

	}

}
