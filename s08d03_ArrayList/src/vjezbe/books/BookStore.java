package vjezbe.books;

import java.util.ArrayList;

public class BookStore {
	private ArrayList<BookClass> books;
	
	public BookStore() {
		this.books = new ArrayList<BookClass>();
	}
	
	public BookStore(BookClass... books) {
		for (int i = 0; i < books.length; i++) {
			this.books.add(books[i]);
		}
	}
	
	public void addBook(BookClass b) {
		if (books.indexOf(b) < 0) {
			books.add(b);
		} else {
			System.out.println("Book already exists.");
		}
	}
	
	public void removeBook(BookClass b) {
		if (books.indexOf(b) > 0) {
			books.remove(b);
		} else {
			System.out.println("Book could not be removed. It does not exist.");
		}
	}
	
	public void removeBook(int i) {
		if (i >= 0 && i < books.size()) {
			books.remove(i);
		} else {
			System.out.println("Book could not be removed. Provided index does not exist.");
		}
	}
	
	public int getBookStoreSize() {
		return books.size();
	}
	
	public String toString() {
		return books.toString();
	}
}
