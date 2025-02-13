package libraryapp.book;


public class Book {
	private String title;
	private String author;
	private String ISBN;
	private double price;
	
	/**
	 * Default constructor to initialize title, author, 
	 * and ISBN to "Unknown" and price to 0.0.
	 */
	public Book() {
		this.title = "Unknown";
		this.author = "Unknown";
		this.ISBN = "Unknown";
		this.price = 0.0;
	}
	
	/**
	 * Parameterized constructor to initialize title, author, ISBN, 
	 * and price to provided values. 
	 * @param title The title of the book.
	 * @param author The author of the book.
	 * @param ISBN The ISBN of the book.
	 * @param price The price of the book.
	 */
	public Book(String title, String author, String ISBN, double price) {
		this.title = title;
		this.author = author;
		this.ISBN = ISBN;
		this.price = price;
	}
	
	/**
	 * Copy constructor that creates a new Book object from another
	 * book.
	 * @param other The Book object to copy values from.
	 */
	public Book(Book other) {
		if (other != null) {
			this.title = other.title;
			this.author = other.author;
			this.ISBN = other.ISBN;
			this.price = other.price;
		}
	}
	
	/**
	 * Gets the title of the book.
	 * @return The title of the book. 
	 */
	public String getTitle() {
		return title;
	}
	
	/**
	 * Sets the title of the book to a provided string.
	 * @param title The title to set the book to.
	 */ 
	public void setTitle(String title) {
		this.title = title;
	}
	
	/**
	 * Gets the author of the book.
	 * @return Returns the author of the book.
	 */
	public String getAuthor() {
		return author;
	}
	
	/**
	 * Sets the author of the book to a provided string.
	 * @param author The author to set the book to.
	 */ 
	public void setAuthor(String author) {
		this.author = author;
	}
	
	/**
	 * Gets the ISBN of the book.
	 * @return Returns the ISBN of the book.
	 */
	public String getISBN() {
		return ISBN;
	}
	
	/**
	 * Sets the ISBN of the book to a provided string.
	 * @param ISBN The ISBN to set the book to.
	 */ 
	public void setISBN(String ISBN) {
		this.ISBN = ISBN;
	}
	
	/**
	 * Gets the price of the book.
	 * @return Returns the price of the book.
	 */
	public double getPrice() {
		return price;
	}
	
	/**
	 * Sets the price of the book to a provided double.
	 * @param price The price to set the book to.
	 */ 
	public void setPrice(double price) {
		this.price = price;
	}
	
	/**
	 * Returns a string representation of the book, including 
	 * the title, author, ISBN, and price. 
	 */
	@Override
	public String toString() {
		return title + " by " + author + " (ISBN: " + ISBN + ", $" + price + )";
	}
	
	/**
	 * Returns true if two books have the same ISBN.
	 * 
	 */ 
	@Override
	public boolean equals(Object other) {
		Book book = (Book)other;
		if (this.ISBN.equals(book.ISBN)) {
			return true;
		}
		return false;
	}
	
	
	

}
