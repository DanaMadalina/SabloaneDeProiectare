package sablon_carte;

public class Start {

	public static void main(String[] args) 
	{
		Authors author = new Authors("Ilie");
		Book book = new Book("Title", author);
		
		System.out.println(book);

	}

}
