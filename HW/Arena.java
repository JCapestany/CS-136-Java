import java.util.*;

/**
this class runs the program and creates the arena and the characters
*/
public class Arena
{
	public static void main(String[] args)
	{
		// creates all the fighters
		Beserker b1 = new Beserker();
		Beserker b2 = new Beserker();
		Warrior w1 = new Warrior();
		Warrior w2 = new Warrior();
		Mage m1 = new Mage();
		Mage m2 = new Mage();

		// creates the array of fighters
		Fighter[] people = new Fighter[6];
		// creates an array list of
		ArrayList<Fighter> dead = new ArrayList<Fighter>();

		// adds everyone to the list
		people[0] = b1;
		people[1] = b2;
		people[2] = w1;
		people[3] = w2;
		people[4] = m1;
		people[5] = m2;

		// makes sure at least two people are alive
		while(dead.size() < 5)
		{
			// this prints out everyone in the arena
			System.out.println("\nIn the Arena...");
			//loops through everyone
			for(int i = 0; i < 6; i++)
			{
				// prints out all the people
				System.out.println(people[i].getFighter());
			}
			// loops through everyone for their turns
			for(int i = 0; i < 6; i++)
			{
				// if the person is a mage
				if (people[i] instanceof Mage)
				{
					// loop through everyone
					for (Fighter q : people)
					{
						// check if both the attacker and the person taking damage is alive
						if (q.isAlive())
						{
							if (people[i].isAlive())
							{
								// deal damage
								q.takeDamage(people[i].attack(), people[i].getType(), people[i]);
							}
							// if the person dies from the attack
							if (!q.isAlive())
							{
								// if the person is a mage
								if (q instanceof Mage)
								{
									// do death attack
									System.out.println("Death attack has been used!");
									people[i].takeDamage(q.attack(), q.getType() , q);
									if (!people[i].isAlive() && !people[i].equals(q))
									{
										// add the person to the list of dead people
										// if they die from death attack.
										dead.add(people[i]);
									}
								}
								// add the dead prson to death array list
								dead.add(q);
							}
						}
					}
				}
				// if the person is a warrior
				if (people[i] instanceof Warrior)
				{
					// makes sure there is at least one other target
					if(dead.size() < 5)
					{
						// get target and name it q
						Fighter q = people[i].getTarget(people, people[i]);
						// check if both the attacker and the person taking damage is alive
						if (q.isAlive())
						{
							if (people[i].isAlive())
							{
								// deal damage
								q.takeDamage(people[i].attack(), people[i].getType(), people[i]);
							}
							// if the person dies from the attack
							if (!q.isAlive())
							{
								// if the person is a mage
								if (q instanceof Mage)
								{
									// do death attack
									System.out.println("Death attack has been used!");
									people[i].takeDamage(q.attack(), q.getType() , q);
									if (!people[i].isAlive() && !people[i].equals(q))
									{
										// add the person to the list of dead people
										// if they die from death attack.
										dead.add(people[i]);
									}
								}
								// add the dead prson to death array list
								dead.add(q);
							}
						}
					}
				}
				// if the person is a beserker
				if (people[i] instanceof Beserker)
				{
					// makes sure there is at least one other target
					if(dead.size() < 5)
					{
						// get target and name it q
						Fighter q = people[i].getTarget(people, people[i]);
						// check if both the attacker and the person taking damage is alive
						if (q.isAlive())
						{
							if (people[i].isAlive())
							{
								// deal damage
								q.takeDamage(people[i].attack(), people[i].getType(), people[i]);
							}
							// if the person dies from the attack
							if (!q.isAlive())
							{
								// if the person is a mage
								if (q instanceof Mage)
								{
									// do death attack
									System.out.println("Death attack has been used!");
									people[i].takeDamage(q.attack(), q.getType() , q);
									if (!people[i].isAlive() && !people[i].equals(q))
									{
										// add the person to the list of dead people
										// if they die from death attack.
										dead.add(people[i]);
									}
								}
								// add the dead prson to death array list
								dead.add(q);
							}
						}
					}
				}
			}
		}
		// if there is one person left alive
		if (dead.size() == 5)
		{
			// loop through to fin the alive person
			for (Fighter q : people)
			{
				if (q.isAlive())
				{
					// print the victor out
					System.out.println("The victor is " + q.getFighter());
				}
			}
		}
		// else all 6 must be dead
		else
		{
			// choose a randonm number
			Random rn = new Random();
			int roll = rn.nextInt(6);
			// the victor is indexed at that number
			System.out.println("The random winner is " + people[roll].getFighter());
		}
	}
}
