import java.util.Random;

/**
	this class represents a mage character
*/
public class Mage implements Fighter
{
	// tells if the mage is alive
	public boolean alive = true;
	// stores health
	public int health = 0;

	/**
		this initializes a mage character
	*/
	public Mage()
	{
		// generates health with a number between 60 and 10
		Random rn = new Random();
		health = rn.nextInt(51) + 10;
	}

	/**
    gets health points for a character
    @return int that is the health of the character
  */
	public int getHealth()
	{
		// returns the health
		return health;
	}

	/**
    gets the damage type
    @return String that is the damage type
  */
	public String getType()
	{
		// returns fire as type
		return "fire";
	}

	/**
    generates an attack
    @return int how much damage is being done
  */
	public int attack()
	{
		// gets a number between 0 and 7
		Random rn = new Random();
		int dmg = rn.nextInt(7);
		// does death attack damage
		if (!this.isAlive())
		{
			dmg = 5;
		}
		// returns the number
		return dmg;
	}

	/**
    prints out and deals damage to a haracter
    @param damage - int - how much damage is being done
    @param damageType - Str - what type of damage
    @param person - Fighter - the person that is doing the damage
  */
	public void takeDamage(int damage,  String damageType, Fighter person)
  {
		// if the character is alive
		if (this.isAlive())
		{
			// take damage
		health = health - damage;
		// prints a string about taking damage, how much, what type, and from who
		System.out.println(this.getFighter() + " takes " + Integer.toString(damage) + " " + damageType + " damage from " + person.getFighter());
		}
	}

	/**
    tells is a player is alive or dead
    @return true if the person is alive; else false
  */
	public boolean isAlive()
  {
		// if health is below 0
		if(health <= 0)
		{
			// sethealth to 0
			health = 0;
			// set to not alive
			alive = false;
			// return false
		  return false;
		}
		// else return true
		return true;
	}

	/**
    gets the fighter name and health
    @return String that gets the character name and it's health
  */
	public String getFighter()
  {
		// if the mage is alive
		if(this.isAlive())
		{
			// return a wild mage and its health
			return  "A wild Mage (" + Integer.toString(health) +") ";
		}
		// if not alive
		else
		{
			// return a dead mage with 0 health
			return "A dead Mage (0)";
		}
	}

	/**
    @param self - Fighter - the person getting a target
    @param array - an array of fighters - array with all the fighters
    @return Fighter who is the target
  */
	public Fighter getTarget(Fighter[] array, Fighter self)
	{
		// does nothing because it is never called
		return array[0];
	}

}
