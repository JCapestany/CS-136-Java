import java.util.*;
import java.io.*;

public class NameSeparator
{
	public static void main(String[]args) throws FileNotFoundException
	{
		//Gets the input files and output files ready
		File file = new File("babynames.txt");
		PrintWriter boynames = new PrintWriter("boynames.txt");
		PrintWriter girlnames = new PrintWriter("girlnames.txt");
		
		//Extracts the boys' information into a new file
		int count = 0;
		String name;
		Scanner boys = new Scanner(file);
		while(boys.hasNext())
		{
			name = boys.next();
			count++;
			if (count % 5 == 2)
			{
				boynames.println(name + " " + boys.next() + " " + boys.next());
			}
		}
		boynames.close();
		
		//Extracts the girls' information into a new file
		count = 0;
		Scanner girls = new Scanner(file);
		while(girls.hasNext())
		{
			name = girls.next();
			count++;
			if (count % 5 == 0)
			{
				girlnames.println(name + " " + girls.next() + " " + girls.next());
			}
		}
		girlnames.close();
	}
}