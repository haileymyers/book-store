package bookstore;

public class Main {
	
	public static void main(String[] args) {
		Service service = new Service();
		
		service.addBook();
		service.addBook("unkown", "unkown");
		
		System.out.println(Service.seeBooks());
		
		service.removeBook(0);
		
		System.out.println(Service.seeBooks());
	}

}
