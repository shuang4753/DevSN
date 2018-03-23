import java.util.List; 
//


public class Runner {

	public static void main(String[] args) {
		List<Book> books = UtilitiesCSV.readBookFromCSV("books.txt");
		for (Book b : books)
		{
			System.out.println(b);
		}

	}

}
