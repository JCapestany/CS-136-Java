import java.util.Scanner;
import java.util.ArrayList;

public class QuestionsApp
{
   public static void main(String[] args)
   {
	  // Initializes an arraylist to store our questions
	  ArrayList<Question> list = new ArrayList<Question>();
	  
	  // The rest is just creating the questions
      NumericQuestion first = new NumericQuestion();
      first.setText("What is 20 - 7?");
      first.setAnswer(13);
	  list.add(first);

      AnyCorrectChoiceQuestion second = new AnyCorrectChoiceQuestion();
      second.setText("Which is not a U.S. state?");
      second.addChoice("Puerto Rico", true);
      second.addChoice("California", false);
      second.addChoice("Delaware", false);
      second.addChoice("Guam", true);
	  list.add(second);
	  
	  NumericQuestion third = new NumericQuestion();
	  third.setText("What is  4 * 5?");
	  third.setAnswer(20);
	  list.add(third);
	  
	  FillInQuestion fourth = new FillInQuestion("The inventor of Java was __James Gosling__.");
	  list.add(fourth);
	  
	  AnyCorrectChoiceQuestion fifth = new AnyCorrectChoiceQuestion();
	  fifth.setText("Which letter is a vowel?");
	  fifth.addChoice("A", true);
	  fifth.addChoice("B", false);
	  fifth.addChoice("C", false);
	  fifth.addChoice("D", false);
	  fifth.addChoice("E", true);
	  list.add(fifth);
	  
	  FillInQuestion sixth = new FillInQuestion("April comes after __March__.");
	  list.add(sixth);
	  
	  // These two variables will be used to keep track points
	  int points = 0;
	  int max = 0;

	  // This for loop presents the questions as well as awarding points for correct answers
      for (Question q : list)
	  {
		  if (presentQuestion(q))
		  {
			  System.out.println("CORRECT\n");
			  points = q.value() + points;
			  max = q.value() + max;
		  }
		  else
		  {
			  System.out.println("WRONG\n");
			  max = q.value() + max;
		  }
	  }
	  // Displays how many points were earned
	  System.out.printf("Total score is %d out of %d.", points, max);
   }

   /**
      Presents a question to the user and checks the response.
      @param q the question
   */
   public static boolean presentQuestion(Question q)
   {
      q.display();
      System.out.print("Your answer: ");
      Scanner in = new Scanner(System.in);
      String response = in.nextLine();
	  return q.checkAnswer(response);
   }
}
