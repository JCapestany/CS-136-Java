import java.util.*;
import java.io.*;

public class FileCount
{  
	/**
	Reads a files and prints the number of words, lines, and characters.
	*/
    public static void main(String[]args) throws FileNotFoundException, IOException
    {
		//Takes a file name from the user to open
		Scanner console = new Scanner(System.in);           

		System.out.println("File to be read: ");
		String inputFile = console.next();

		File file = new File(inputFile);

		//Numbers of words, lines, and characters
		int words = 0;
		int lines = 0;
		int chars = 0;

		//Finds the number of words
		Scanner w = new Scanner(file);
		while(w.hasNext())
		{
			w.next();
			words++;
		}

		//Finds the number of lines
		Scanner l = new Scanner(file);
		while(l.hasNextLine())
		{
			l.nextLine();
			lines++;
		}

		//Finds the number of characters
		BufferedReader buffer = new BufferedReader(new FileReader(file));
		int c = 0;
		while((c = buffer.read()) != -1)
		{
			chars++;
		}

		//Display results
		System.out.println("Number of lines: " + lines);
		System.out.println("Number of words: " + words);
		System.out.println("Number of characters: " + chars);
    }
}
	