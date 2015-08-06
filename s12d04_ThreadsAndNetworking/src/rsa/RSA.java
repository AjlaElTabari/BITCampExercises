package rsa;

import java.math.BigInteger;

public class RSA {		  
		 public static void main(String[] args) {
			 BigInteger num = new BigInteger("1050809377681880902769");
			for (BigInteger i = new BigInteger("2"); num.divide(BigInteger.valueOf(2)).compareTo(i) > 0; i = i.add(new BigInteger("1"))) {
				if(num.mod(i).equals(new BigInteger("0"))) {
					System.out.println(i + " * " + num.divide(i));
					break;
				}
			}
		}
}
