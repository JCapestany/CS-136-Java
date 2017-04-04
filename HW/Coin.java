public class Coin implements Comparable<Coin>
{
	 private double value;
	 private String name;
	 
	 /**
	 Creates a coin with a name and value.
	 @param aValue value of the coin
	 @param aName name of the coin
	 */
	 public Coin(double aValue, String aName)
	 {
		 value = aValue;
		 name = aName;
	 }
	 
	 /**
	 Getter for value.
	 @return value value of the coin
	 */
	 public double getValue()
	 {
		return value;
	 }
	 
	 /**
	 Getter for name.
	 @return name name of the coin
	 */
	 public String getName()
	 {
		return name;
	 }
	 
	 /**
	 Implements the Comparable interface.
	 @return int -1, 0, or 1 depending on the comparison
	 */
	 public int compareTo(Coin coin)
	 {
		 if(this.getValue() > coin.getValue())
		 {
			 return 1;
		 }	 
		 if(this.getValue() < coin.getValue())
		 {
			 return -1;
		 }
		 return 0;
	 }
} 