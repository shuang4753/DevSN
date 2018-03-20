import java.util.List;
import java.io.BufferedReader;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
//
public class UtilitiesCSV {

	private static List<Book> readBookFromCSV(String fileName)
	{
		List<Book> books = new ArrayList<>();
		Path pathToFile = Paths.get(fileName);
		
		// Create an instance of BufferedReader
		// using try with resources, Java 7 feature to close resources
		
		try (BufferedReader br = Files.newBufferedReader(pathToFile, 
				StandardCharsets.US_ASCII))
		{
			// read the first line from the text
			String line = br.readLine();
			
			// loop until all lines are read
			while (line != null)
			{
				String-= attributes = line.split(",");
			}
		}
	}
}
