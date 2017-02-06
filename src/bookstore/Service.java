package bookstore;

import java.util.Map;
import java.util.HashMap;

public class Service {
	
	static private Map<Integer, Book> books = new HashMap<>();
	
	public static void addBook() {
		Book book = new Book();
		books.put(book.getID(), book);
	}
	
	public static void addBook(String title, String author) {
		Book book = new Book(title, author);
		books.put(book.getID(), book);
	}
	
	public static void removeBook(int id) {
		books.remove(id);
	}
	
	public static void removeBook(Book book) {
		int id = book.getID();
		books.remove(id);
	}
	
	public static String seeBooks() {
		return books.toString();
	}

}