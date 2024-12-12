public class SuperHero
{
	private String name;
	private Power superPower;
	private SecretIdentity identity;

	public SuperHero(String heroName, Power power, SecretIdentity theIdentity)
	{
		name = heroName;
		superPower = new Power(power.getName(),power.getStrength());
		identity = new SecretIdentity(theIdentity.getRealName(),theIdentity.getOccupation(), theIdentity.getHomePlanet());
	}
	
	public int getStrength()
	{
	    return superPower.getStrength();
	}
	
	public SecretIdentity getIdentity()
	{
	    return identity;
	}
	
	//This will include the toString() from the identity class.
	public String toString()
	{
	    return name + "\'s secret identity: " + identity; 
	}
}
