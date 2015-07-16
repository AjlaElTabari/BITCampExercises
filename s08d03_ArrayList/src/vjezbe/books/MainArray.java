package vjezbe.books;

public class MainArray {

	public static void main(String[] args) {

		BookClass b1 = new BookClass("Magarece godine", "Branko Copic", 1932);
		BookClass b2 = new BookClass("Tresnjevacke tresnje", "Mato Lovrak", 1982);
		BookClass b3 = new BookClass("Tvrdjava", "Mesa Selimovic", 1940);
		BookClass b4 = new BookClass("Mali princ", "Antonie nesto nesto", 1920);
		BookClass b5 = new BookClass("20000 milja pod morem", "Zil Vern", 1938);
		BookClass b6 = new BookClass("20000 milja pod morem", "Zil Vern", 1938);

		BookClass[] books = {b1, b2, b3, b4, b5, b6};
		
		for (BookClass b : books) {
			System.out.println(b);
			System.out.println();
		}
		
		if (b6.equals(b5)) {
			System.out.println("Druze, iste su ti to knjige.");
		} else {
			System.out.println("Ovu jos nisi citao.");
		}
		
		if (b4.equals(b5)) {
			System.out.println("Druze, iste su ti to knjige.");
		} else {
			System.out.println("Ovu jos nisi citao.");
		}
	}

}
