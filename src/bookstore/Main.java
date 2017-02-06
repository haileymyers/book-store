package bookstore;

public class Main {
	
	public static void main(String[] args) {
		Service.addBook();
		Service.addBook("unkown", "unkown");
		
		System.out.println(Service.seeBooks());
		
		Service.removeBook(1);
		
		System.out.println(Service.seeBooks());
	}

}
