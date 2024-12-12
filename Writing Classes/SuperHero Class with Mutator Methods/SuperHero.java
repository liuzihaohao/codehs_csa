public class SuperHero
{
	private String name;
	private Power superPower;

	public SuperHero(String heroName, Power power)
	{
		name = heroName;
		superPower = new Power(power.getName(),power.getStrength());
	}
	
	public int getStrength()
	{
	    return superPower.getStrength();
	}
	
	/* By using Setter methods, we can do data validation
	 * that would not be possible with direct access. 
	 */
	public void setStrength(int strength)
	{
	    // Validate strength is at least 0
	    if (strength < 0) {
	        strength = 0;
	    }
	    superPower.setStrength(strength);
	}
	
	public void setName(String theName)
	{
	    name = theName;
	}
	
	public void setPower(String name, int strength)
	{
	    //We need to call the mutators methods from the Power class to change the values of Power
	    superPower.setName(name);
	    superPower.setStrength(strength);
	}
	public String toString()
	{
	    return "Name: "+ name +", " + superPower;
	}
}
