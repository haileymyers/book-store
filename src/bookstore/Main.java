package bookstore;

public class Main {
	
	public static void main(String[] args) {
		Service service = new Service();
		
		service.addBook();
		service.addBook("unkown", "unkown");
		
		System.out.println("Books added: \n" + Service.printBooks());
		
		service.removeBook(0);
		
		System.out.println("Book removed: \n" + Service.printBooks());
		
		service.updateTitle(1, "something");
		
		System.out.println("Book updated: \n" + Service.printBooks());
	}

}
