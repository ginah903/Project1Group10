package libraryapp.Library;
import libraryapp.book.Book;

public class Library {
	private java.awt.print.Book[] books;
	private int count;
	
	public Library() {
		books = new Book[5];
		count = 0;
	}
	
	
	/**
	 * Method that adds a book to the Book array
	 * 
	 * @param book The book to be added to the array
	 */
	public boolean addbook(Book book) {
		if(count < books.length) {
			books[count] = book;
			count++;
			return true
		}
		
		return false;
	}
}

/* hey mamas 
/*af