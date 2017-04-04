/**
  blueprint for all fighters/players
*/
public interface Fighter
{
  /**
    @param self - Fighter - the person getting a target
    @param array - an array of fighters - array with all the fighters
    @return Fighter who is the target
  */
  public Fighter getTarget(Fighter[] array, Fighter self);

  /**
    generates an attack
    @return int how much damage is being done
  */
  public int attack();

  /**
    prints out and deals damage to a haracter
    @param damage - int - how much damage is being done
    @param damageType - Str - what type of damage
    @param person - Fighter - the person that is doing the damage
  */
  public void takeDamage(int damage, String damageType, Fighter person);

  /**
    tells is a player is alive or dead
    @return true if the person is alive; else false
  */
  public boolean isAlive();

  /**
    gets health points for a character
    @return int that is the health of the character
  */
  public int getHealth();

  /**
    gets the fighter name and health
    @return String that gets the character name and it's health
  */
  public String getFighter();

  /**
    gets the damage type
    @return String that is the damage type
  */
  public String getType();
}
