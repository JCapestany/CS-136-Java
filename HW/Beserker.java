import java.util.*;

/**
	this class represents a beserker character
*/
public class Beserker implements Fighter
{
	// tells if the beserker is alive
	public boolean alive = true;
	// stores health
	public int health = 0;

	/**
		this class initializes a beserker character
	*/
	public Beserker()
	{
		// sets health to 35
		health = 35;
	}

	/**
    gets the damage type
    @return String that is the damage type
  */
	public String getType()
	{
		// returns smashing as the type
		return "smashing";
	}

	/**
    generates an attack
    @return int how much damage is being done
  */
	public int attack()
	{
		// always does 20 damage
		return 20;
	}

	/**
    prints out and deals damage to a haracter
    @param damage - int - how much damage is being done
    @param damageType - Str - what type of damage
    @param person - Fighter - the person that is doing the damage
  */
	public void takeDamage(int damage,  String damageType, Fighter person)
  {
		// if the damage is slashing
		if (damageType == "slashing")
		{
			// double damage
      damage = damage * 2;
			// takes damage
      health = health - damage;
			// prints a string about taking damage, how much, what type, and from who
			System.out.println(this.getFighter() + " takes " + Integer.toString(damage) + " " + damageType + " damage from " + person.getFighter());
    }
		// if a damage is fire
    if (damageType == "fire")
		{
			// half damage
      damage = (int)((double)damage * .5);
			// takes damage
      health = health - damage;
			// prints a string about taking damage, how much, what type, and from who
			System.out.println(this.getFighter() + " takes " + Integer.toString(damage) + " " + damageType + " damage from " + person.getFighter());
	  }
		// other beserkers smash
		else
		{
			// takes damage
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
    gets health points for a character
    @return int that is the health of the character
  */
	public int getHealth()
	{
		// returns health points
		return health;
	}

	/**
    gets the fighter name and health
    @return String that gets the character name and it's health
  */
	public String getFighter()
  {
		// if the beserker is alive
		if(this.isAlive())
		{
			// return a disclined beserker followed by it's health
			return "A raging Beserker (" + Integer.toString(health) +") ";
		}
		// if the beserker is not alive
		else
		{
			// return a dead beserker followed by it's health (0)
			return "A dead Beserker (0)";
		}
	}

	/**
    @param self - Fighter - the person getting a target
    @param array - an array of fighters - array with all the fighters
    @return Fighter who is the target
  */
	public Fighter getTarget(Fighter[] array, Fighter self)
	{
		// get a random number
    Random rn = new Random();
    int roll = rn.nextInt(6);
		// choose someone who is alive
    while(!array[roll].isAlive())
    {
      roll = rn.nextInt(6);
    }
		// return the person at that index
    return array[roll];
}
}
