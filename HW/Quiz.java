public class Quiz implements Measurable
{
   private double score;
   private String grade;

   /**
      Construct a quiz with a score and grade.
      @param score quiz score
      @param grade grade of the quiz
   */
   public Quiz(int score, String grade)
   {
      this.score = score;
      this.grade = grade;
   }

   /**
      Getter for the score.
      @return the score
   */
   public double getScore()
   {
      return this.score;
   }
   
   /**
      Getter for the grade.
      @return the grade
   */
   public String getGrade()
   {
      return this.grade;
   }
   
   /**
      Measurable interface method to retrieve measure.
      @return the score
   */
   public double getMeasure()
   {
      return this.score;
   }
}