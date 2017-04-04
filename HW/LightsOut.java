public class LightsOut
{
  //This 2D array keeps track of which squares are lit or unlit. 
  private boolean[][] board;

  /**
  Initializes the game with a board the size of the parameter.
  @param size an int to determine how large to make the game board
  */
  public LightsOut(int size)
  {
    board = new boolean[size][size];
  }

  /**
  Getter for the size of the board.
  @return the size of the board
  */
  public int getSize()
  {
    return board[0].length;
  }

  /**
  Getter to see if a square is lit or not.
  @return true if the square is lit
  @return false if the square is not lit
  */
  public boolean isLit(int row, int col)
  {
    if (board[row][col])
    {
      return true;
    }
    else
    {
      return false;
    }
  }

  /**
  Forces a particular square to be lit or unlit.
  */
  public void forceLit(int row, int col, boolean value)
  {
    board[row][col] = value;
  }

  /**
  Simulates a square being pressed. The square and all adjacent squares are inverted.
  */
  public void press(int row, int col)
  {
    board[row][col] = !board[row][col];
	//If there is no adjacent square when there would normally be we ignore the exception thrown and continue.
    for (int i = 0; i < 4; i++)
    {
      if (i == 0)
      {
        try
        {
          board[row + 1][col] = !board[row + 1][col];
        }
        catch (IndexOutOfBoundsException ex)
        {
          continue;
        }
      }
      if (i == 1)
      {
        try
        {
          board[row - 1][col] = !board[row - 1][col];
        }
        catch (IndexOutOfBoundsException ex)
        {
          continue;
        }
      }
      if (i == 2)
      {
        try
        {
          board[row][col + 1] = !board[row][col + 1];
        }
        catch (IndexOutOfBoundsException ex)
        {
          continue;
        }
      }
      if (i == 3)
      {
        try
        {
          board[row][col - 1] = !board[row][col - 1];
        }
        catch (IndexOutOfBoundsException ex)
        {
          continue;
        }
      }
    }
  }
}
