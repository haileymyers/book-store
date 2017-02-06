package bookstore;

public class Book {
	
	private String title;
	private String author;
	private static int counter = 0;
	private int id;
	
	public Book() {}
	
	public Book(String title, String author) {
		this.title = title;
		this.author = author;
		this.id = ++counter;
	}
	
	public String getTitle() {
		return title;
	}
	
	public String getAuthor() {
		return author;
	}
	
	public int getID() {
		return id;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}
	
	public void setAuthor(String author) {
		this.author = author;
	}
	
	public String toString() {
		return "[Title: " + title + ", Author: " + author + "]";
	}

}
