public class SuperHero
{
	private String name;
	private Power superPower;

	public SuperHero(String heroName, Power power)
	{
		name = heroName;
		
		//Comment out:
		superPower = power;
		//Assigning power to superPower makes superPower an alias of power
		//The correct initialization is the commented assignment below.
		//Uncomment below, and comment out the superPower = power.
		
		//superPower = new Power(power.getName(),power.getStrength());
	}
	
	public int getStrength()
	{
	    return superPower.getStrength();
	}
	
	public void setStrength(int strength)
	{
	    superPower.setStrength(strength);
	}
}
