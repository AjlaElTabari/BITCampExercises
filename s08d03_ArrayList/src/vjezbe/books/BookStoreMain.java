package vjezbe.books;

public class BookStoreMain {

	public static void main(String[] args) {
		
		BookStore bs = new BookStore();
		
		BookClass b = new BookClass("Stara knjiga");
		
		bs.addBook(new BookClass("Nova knjiga"));
		bs.addBook(new BookClass("Nova knjiga"));
		bs.addBook(new BookClass("Nova nova knjiga"));
		bs.addBook(b);
		
		bs.removeBook(b);
		
		bs.removeBook(6);
		
		System.out.println(bs);
		
		System.out.println(bs.getBookStoreSize());

	}

}
