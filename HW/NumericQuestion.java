/**
   A question with a numeric answer.
*/
public class NumericQuestion extends Question
{
   private double answer;

   /**
      Constructs a numeric question with no answer.
   */
   public NumericQuestion()
   {
   }

   /**
      Adds the answer to this question.
      @param value the answer to add.
   */
   public void setAnswer(double value)
   {
      answer = value;
   }
   
   /**
      Checks a given answer for correctness.
      @param response the response to check
      @return true if the response was correct within .001, false otherwise
   */
   public boolean checkAnswer(String response)
   {
	   double value = Double.parseDouble(response);
	   if ((answer - value) <= .001 && (answer - value) >= -.001)
		   return true;
	   else
		   return false;
   }
   
   /**
      The value of an NumericQuestion.
      @return 1 the value of a correct question
   */
   public int value()
   {
	   return 1;
   }
   
   public void display()
   {
      // Display the question text
      super.display();
   }
}