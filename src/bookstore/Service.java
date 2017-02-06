package bookstore;

import java.util.Map;
import java.util.HashMap;

public class Service {
	
	static private Map<Integer, Book> books = new HashMap<>();
	
	public void addBook() {
		Book book = new Book();
		Service.books.put(book.getID(), book);
	}
	
	public void addBook(String title, String author) {
		Book book = new Book(title, author);
		Service.books.put(book.getID(), book);
	}
	
	public void removeBook(int id) {
		Service.books.remove(id);
	}
	
	public void removeBook(Book book) {
		int id = book.getID();
		Service.books.remove(id);
	}
	
	public static String seeBooks() {
		return Service.books.toString();
	}

}