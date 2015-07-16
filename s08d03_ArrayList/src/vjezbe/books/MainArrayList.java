package vjezbe.books;

import java.util.ArrayList;

public class MainArrayList {

	public static void main(String[] args) {
		
		ArrayList<BookClass> books = new ArrayList<>();
		
		books.add(new BookClass("Magarece godine", "Branko Copic", 1932));
		books.add(new BookClass("Tresnjevacke tresnje", "Mato Lovrak", 1982));
		books.add(new BookClass("Tvrdjava", "Mesa Selimovic", 1940));
		books.add(new BookClass("Mali princ", "Antonie nesto nesto", 1920));
		books.add(new BookClass("20000 milja pod morem", "Zil Vern", 1938));
		books.add(new BookClass("20000 milja pod morem", "Zil Vern", 1938));
		
		System.out.println(books);

	}

}
