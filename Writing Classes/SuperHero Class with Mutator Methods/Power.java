public class Power
{
	private String name;
	private int strength;

	public Power(String theName, int theStrength)
	{
		name = theName;
		strength = theStrength;
	}
	
	public String getName()
	{
		return name;
	}

	public int getStrength()
	{
		return strength;
	}
	
	public void setStrength(int theStrength)
	{
	    strength = theStrength;
	}
	
	public void setName(String theName)
	{
	    name = theName;
	}
	public String toString()
	{
	    return "Power: "+ name +", Strength: " + strength; 
	}
}

