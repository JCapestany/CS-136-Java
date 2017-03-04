public class Person implements Measurable
{
   private double height;
   private String name;

   /**
      Construct a person with a height and name.
      @param height height in cm
      @param name name of the person
   */
   public Person(String name,int height)
   {
      this.name = name;
      this.height = height;
   }

   /**
      Getter for the name.
      @return the name
   */
   public String getName()
   {
      return this.name;
   }
   
   /**
      Measurable interface method to retrieve measure.
      @return the score
   */
   public double getMeasure()
   {
      return this.height;
   }
}