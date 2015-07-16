package vjezbe;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class LettersCounting {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		String word = "";
		LinkedList<String> list = new LinkedList<>();
		
		System.out.println("Keep entering words. Enter 'end' to terminate input.");
		 while (!word.equals("end")) {
			word = input.nextLine();
			list.add(word);
		}
		
		HashSet<Character> hset = new HashSet<>();
		
		ListIterator<String> it = list.listIterator();
		String wordForCharacters = "";
		while (it.hasNext()) {
			wordForCharacters = it.next().toString();
			if (!wordForCharacters.equals("end")) {
				for (int i = 0; i < wordForCharacters.length(); i++) {
					hset.add(wordForCharacters.charAt(i));
				}
			}

		}
		System.out.println("You entered " + hset.size() + " different letters.");
		input.close();
	}

}
