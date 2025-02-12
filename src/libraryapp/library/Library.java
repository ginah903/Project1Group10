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
	
	
	/**
	 * Removes a specific book from the array by checking
	 * the ISBN
	 * 
	 * shifts all of the books down by one and makes the
	 * top book null so there are no duplicates
	 * 
	 * @param book The book to remove from the array
	 */
	public boolean removeBook(Book book) {
		for(int i = 0; i < count; i++) {
			if(books[i].equals(book)) {
				for(int j = i; j < count - 1; j++) {
					books[j] = books[j + 1];
				}
				books[count - 1] = null;
				count--;
				return true;
			}
		}
		
		return false;
	}
}
