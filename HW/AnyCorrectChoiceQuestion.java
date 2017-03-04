import java.util.ArrayList;

/**
   A question with multiple choices and mulitple correct answers.
*/
public class AnyCorrectChoiceQuestion extends Question
{
   private ArrayList<String> choices;
   private ArrayList<Integer> answers;
   private int count = 0;

   /**
      Constructs an any correct choice question with no choices.
   */
   public AnyCorrectChoiceQuestion()
   {
      choices = new ArrayList<String>();
	  answers = new ArrayList<Integer>();
   }

   /**
      Adds an answer choice to this question.
      @param choice the choice to add
      @param correct true if this is the correct choice, false otherwise
   */
   public void addChoice(String choice, boolean correct)
   {
	  count++;
      choices.add(choice);
      if (correct) 
      {
         answers.add(count);
      }
   }
   
   /**
      The value of an AnyCorrectChoiceQuestion.
      @return 3 the value of a correct question
   */
   public int value()
   {
	   return 3;
   }
   
   /**
      Checks a given response for correctness.
      @param response the response to check
      @return true if the response was correct, false otherwise
   */
   public boolean checkAnswer(String response)
   {
	   int value = Integer.parseInt(response);
	   if (answers.contains(value))
		   return true;
	   else
		   return false;
   }
   
   public void display()
   {
      // Display the question text
      super.display();
      // Display the answer choices
      for (int i = 0; i < choices.size(); i++)
      {
         int choiceNumber = i + 1;
         System.out.println(choiceNumber + ": " + choices.get(i));     
      }
	  System.out.println("More than one answer may be correct.");
   }
}