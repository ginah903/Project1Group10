package libraryapp.library;
import libraryapp.book.Book;

public class Library {
	private Book[] books;
	private int count;
	
	public Library() {
		books = new Book[5];
		count = 0;
	}
	
	
	/**
	 * Method that adds a book to the Book array
	 * 
	 * @param book The book to be added to the array
	 * @return Returns true if the book was added successfully, false if not added.
	 */
	public boolean addBook(Book book) {
		if(count < books.length) {
			books[count] = book;
			count++;
			return true;
		}
		
		return false;
	}
}


