package libraryapp;
import libraryapp.book.Book;
import libraryapp.library.Library;
public class Main {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
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
		
		if(myLibrary.addBook(new Book("Calvin and Hobbes", "Bill Watterson", "352-2939074779", 24.99)) {
			System.out.println("book successfully added!");
		}
		else {
			System.out.println"failed to add book to the library");
		}
		
		if(myLibrary.addBook(new Book("Don't Let the Pidgeon Drive the Bus!", "Mo Willems", "688-3028678399", 24.99))) {
			System.out.println("book successfully added!");
		}
		else {
			System.out.println("failed to add book to the library");
		}
	}
}
