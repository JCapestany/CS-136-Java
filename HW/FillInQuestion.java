import java.util.ArrayList;

/**
   A question with a fill in answer.
*/
public class FillInQuestion extends Question
{	
   /**
      Constructs a fill in question with a given statement.
	  @param question the statement to be made into a question
   */
   public FillInQuestion(String question)
   {
	   super.answer = question.split("__")[1];
	   super.text = question.split("__")[0] +"__"+question.split("__")[2];
   }
   
   /**
      The value of an FillInQuestion.
      @return 2 the value of a correct question
   */
   public int value()
   {
	   return 2;
   }

   public void display()
   {
      System.out.println(text);
   }
}