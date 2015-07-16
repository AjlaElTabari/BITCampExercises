package vjezbe.books;

public class BookClass {
	private String title;
	private String author;
	private int yearPublished;
	
	public BookClass(String title, String author, int yearPublished) {
		this.title = title;
		this.author = author;
		this.yearPublished = yearPublished;
	}

	public BookClass(String title) {
		this.title = title;
		this.author = "NN";
		this.yearPublished = 0;
	}

	public BookClass(String title, String author) {
		this.title = title;
		this.author = author;
	}

	// Getters and setters

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public int getYearPublished() {
		return yearPublished;
	}

	public void setYearPublished(int yearPublished) {
		this.yearPublished = yearPublished;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		BookClass other = (BookClass) obj;
		if (author == null) {
			if (other.author != null)
				return false;
		} else if (!author.equals(other.author))
			return false;
		if (title == null) {
			if (other.title != null)
				return false;
		} else if (!title.equals(other.title))
			return false;
		if (yearPublished != other.yearPublished)
			return false;
		return true;
	}

	public String toString() {
		return "Title: " + title + "\nAuthor: " + author + "\nYear of publishing: " + yearPublished + "\n\n"; 
	}
	
}
