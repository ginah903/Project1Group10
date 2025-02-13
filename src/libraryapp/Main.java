package libraryapp;
import libraryapp.book.Book;
import libraryapp.library.Library;
public class Main {
	public static void main(String[] args) {
		
		//create new library
		Library myLibrary = new Library();
		
		System.out.println("adding books...");
		//create 3 new books and add them to the library
		if(myLibrary.addBook(new Book("Beloved", "Toni Morrison", "938-0256278379", 24.99))) {
			System.out.println("book successfully added!");
		}
		else {
			System.out.println("failed to add book to the library");
		}
		
		if(myLibrary.addBook(new Book("Calvin and Hobbes", "Bill Watterson", "352-2939074779", 39.99))) {
			System.out.println("book successfully added!");
		}
		else {
			System.out.println("failed to add book to the library");
		}
		
		if (myLibrary.addBook(new Book("Don't Let the Pidgeon Drive the Bus!", "Mo Willems", "688-3028678399", 9.99))) {
			System.out.println("book successfully added!");
		}
		else {
			System.out.println("failed to add book to the library");
		}
		
		if (myLibrary.removeBook(new Book("placeHolder", "placeHolder Author", "352-2939074779", 0))) {
			System.out.println("removing book: Calvin and Hobbes by Bill Watterson (ISBN: 352-2939074779, 39.99)");
		}
		else {
			System.out.println("Cannot remove book: Calvin and Hobbes by Bill Watterson (ISBN: 352-2939074779, 39.99)");
		}
		
		if (myLibrary.removeBook(new Book("placeHolder", "placeHolder Author", "352-2939074779", 0))) {
			System.out.println("removing book: Calvin and Hobbes by Bill Watterson (ISBN: 352-2939074779, 39.99)");
		}
		else {
			System.out.println("Cannot remove book: Calvin and Hobbes by Bill Watterson (ISBN: 352-2939074779, 39.99)");
		}
		
		//searching for book by ISBN test
		if (myLibrary.searchByISBN("938-0256278379") {
			System.out.println("Book found: Beloved by Toni Morrison (ISBN: 938-0256278379, $24.99");
		}
		else {
			System.out.println("Could not find book with ISBN: 938-0256278379");
		}
	}
}
