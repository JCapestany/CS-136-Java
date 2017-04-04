public class Sudoku
{
  private char[][] board = new char[9][9];

  /**
	Empty constructer method.
  */
  public Sudoku()
  {
  }

  /**
	Constructer method that sets the sudoku board.
	@param start the string used to initialize the sudoku board
  */
  public Sudoku(String start)
  {
    int j = 0;
    for (int i = 0; i < 90; i++)
    {
      char square = start.charAt(i);
      if (square == '\n')
      {
        j++;
      }
      else
      {
        this.setSquare(j, (i % 10), square);
      }
    }
  }

  /**
	This method returns the element at a specific square.
	@param row row number of sudoku board
	@param col column number of sudoku board
	@return char the element at the specified indecies
  */
  public char getSquare(int row, int col)
  {
    return this.board[row][col];
  }

  /**
	This method sets the element at a specific square.
	@param row row number of sudoku board
	@param col column number of sudoku board
	@param value char value to be set
  */
  public void setSquare(int row, int col, char value)
  {
    this.board[row][col] = value;
  }

  /**
	Determines if the sudoku board is in a valid configuration.
	@return bool determined if board is in valid state
  */
  public boolean isValid()
  {
    for (int i = 0; i < 9; i++)
    {
      char[] rowArray = new char[9];
      char[] squareArray = new char[9];
	  char[] colArray = new char[9];
      for(int j = 0; j < 9; j++)
      {
		squareArray[j] = board[i/3*3 + j / 3][(i%3)*3 + j % 3];
		rowArray[j] = board[i][j];
		colArray[j] = board[j][i];
	  }
	  if(!this.arrayChecker(rowArray) || !this.arrayChecker(colArray) || !this.arrayChecker(squareArray))
	  {
	    return false;
	  }
    }	
    return true;
  }

  /**
	Determines if the board is solved.
	@return bool determined if the board is solved or not
  */
  public boolean isSolved()
  {
    if (!this.isValid())
    {
      return false;
    }
    for (int i = 0; i < 9; i++)
    { 
      for(int j = 0; j < 9; j++)
      {
        if(board[i][j] == ' ')
          return false;
      }
    }
    return true;
  }
  
  /**
	Method used by isValid(). Finds if the array has duplicate entries.
	@param array a char[] array with 9 entries to be checked
	@return bool determined if the array has duplicate entries
  */
  private boolean arrayChecker(char[] array)
  {
    for (int i = 0; i < 9; i++)
    {
      for (int j = 0; j < 9; j++)
      {
        if (array[i] == array[j] && array[i] != ' ' && i != j)
        {
          return false;
        }
      }
    }
    return true;
  }
}