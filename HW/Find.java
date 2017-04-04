import java.util.*;
import java.io.*;

public class Find
{
	/**
	Prints any line containing a specific word in any of the specified files.
	@param args String array containing a word in 0th index and files in the rest of the array.
	*/
	public static void main(String[] args) throws FileNotFoundException
	{
		//Saves the first argument as the word to search for.
		String word = args[0];
		
		//This will allow an arbitrary amount of files.
		for (String s : args)
		{
			//Since the first argument is not a file, we skip it.
			if (s == word)
			{
				continue;
			}
			//Searches line by line of a file until it finds a line that contains the word.
			try
			{
				File file = new File(s);
				Scanner in = new Scanner(file);
				String line;
				int count = 0;
					
				while (in.hasNextLine())
				{	
					count++;
					line = in.nextLine();
					//If the line contains the word, print the name of the file, the whole line, and which line.
					if (line.contains(word))
					{
						System.out.printf("%s (%d): %s\n", s, count, line);
					}
				}
				in.close();
			}
			//If the file can't be found, let them know.
			catch (FileNotFoundException ex)
			{
				System.out.println("Sorry, I can't find " + s);
			}
			//Ensures that the loop continues if a file can't be found.
			finally
			{
				continue;
			}
		}
	}
}