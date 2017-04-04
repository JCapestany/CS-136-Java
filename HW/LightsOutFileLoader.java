import java.io.*;
import java.util.*;

public class LightsOutFileLoader
{
  /**
  This loads a particular file and changes the LightsOut game to match the file using X's and _'s.
  @param game the LightsOut game to be modified
  @param inputfile the file to be read
  */
  public void load(LightsOut game, File inputfile) throws FileNotFoundException, IOException
  {
    FileReader filereader = new FileReader(inputfile);
    BufferedReader in = new BufferedReader(filereader);
    String line;
    int k = 0;
    try
    {
	  //If a character is an X it forces the square to be lit of unlit if it is an _.
      while ((line = in.readLine()) != null)
      {
        for (int j = 0; j < line.length(); j++)
        {
		  //If the file does not have the same length of the current game throw exception.	
		  if (line.length() > game.getSize())
		  {
			throw new UnsupportedLightsOutFileException("File is wrong size for current game!");
		  }
		  if (line.charAt(j) == 'X') 
		  {
			game.forceLit(k, j, true);
		  }
		  else if (line.charAt(j) == '_')
		  {
			game.forceLit(k, j, false);
		  }
		  //If the file contains anything but an X or _ throw an exception.
		  else
		  {
			throw new UnsupportedLightsOutFileException("Incorrect character in file!");
		  }
        }
        k++;
      }
    }
    catch (UnsupportedLightsOutFileException ex)
    {}
  }
}
