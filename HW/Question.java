/**
   A question with a text and an answer.
*/
public class Question
{
   protected String text;
   protected String answer;

   /**
      Constructs a question with empty question and answer.
   */
   public Question() 
   {
      text = "";
      answer = "";
   }

   /**
      Sets the question text.
      @param questionText the text of this question
   */
   public void setText(String questionText)   
   {
      text = questionText;
   }

   /**
      Sets the answer for this question.
      @param correctResponse the answer
   */
   public void setAnswer(String correctResponse)
   {
      answer = correctResponse;
   }

   /**
      Checks a given response for correctness.
      @param response the response to check
      @return true if the response was correct, false otherwise
   */
   public boolean checkAnswer(String response)
   {
      return response.toUpperCase().equals(answer.toUpperCase());
   }
   
   /**
	  The value of a question and should be modified by subclasses.
	  @return 0 the default value of a question
   */
   public int value()
   {
	   return 0;
   }

   /**
      Displays this question.
   */
   public void display()
   {
      System.out.println(text);
   }
}