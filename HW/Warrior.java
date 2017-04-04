import java.util.*;

/**
	this class represents a warrior character
*/
public class Warrior implements Fighter
{
	// tells if the warrior is alive
	public boolean alive = true;
	// stores health
	public int health = 0;

	/**
		this initializes a warrior character
	*/
	public Warrior()
	{
		// generates health with a number between 20 and 40
		Random rn = new Random();
		health = rn.nextInt(21) + 20;
	}

	/**
    gets the damage type
    @return String that is the damage type
  */
	public String getType()
	{
		// returns slashing as damage
		return "slashing";
	}

	/**
    generates an attack
    @return int how much damage is being done
  */
	public int attack()
	{
		// gets a random number between 10 and 16
		Random rn = new Random();
		int dmg = rn.nextInt(7) + 10;
		// returns that number
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
		// if damage is smashing or slashing
		if (damageType == "slashing" || damageType == "smashing")
		{
			// get a random number from 0-99
			Random rn = new Random();
			int roll = rn.nextInt(100);
			// if 0-24 dodge the attack
			if (roll < 24)
			{
				// prints the attack was dodged
				System.out.println("A discplined Warrior (" + Integer.toString(health) + ") dodges the attack from " + person.getFighter());
			}
			// else if 25-99
			else
			{
				// take damage
				health = health - damage;
				// prints a string about taking damage, how much, what type, and from who
				System.out.println(this.getFighter() + " takes " + Integer.toString(damage) + " " + damageType + " damage from " + person.getFighter());
			}
		}
		// if fire damage
		else
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
    gets health points for a character
    @return int that is the health of the character
  */
	public int getHealth()
	{
		// return the amount of HP a character has
		return health;
	}

	/**
    gets the fighter name and health
    @return String that gets the character name and it's health
  */
	public String getFighter()
  {
		// if the warrior is alive
		if(this.isAlive())
		{
			// return a disclined warrior followed by it's health
			return "A discplined Warrior (" + Integer.toString(health) +") ";
		}
		// if the warrior is not alive
		else
		{
			// return a dead warrior followed by it's health (0)
			return "A dead Warrior (0)";
		}
	}

	/**
    @param self - Fighter - the person getting a target
    @param array - an array of fighters - array with all the fighters
    @return Fighter who is the target
  */
	public Fighter getTarget(Fighter[] array, Fighter self)
	{
		// intialize variables
		// highest health out of all the character
		int highestHealth = 0;
		// health being examined
		int health;
		// the person with the highest health
		Fighter personHealth = null;
		// an array list populated with non-dead and not the attacker
		ArrayList<Fighter> target = new ArrayList<Fighter>();
		// loop through all characters
		for (int i = 0; i < array.length; i++)
		{
			// makes sure the attacker is not included
			if (array[i] != self)
			{
				// adds potential targets
				target.add(array[i]);
			}
		}
		// loops trough targets
		for(Fighter q: target)
		{
			// checks health of each fighter
			health = q.getHealth();
			// if its a new high health
			if(health > highestHealth)
			{
				// set health as highest
				highestHealth = health;
				// set as new peson with the highest health
				personHealth = q;
			}
	}
	// return the fighter with the highest health
	return personHealth;
}
}
