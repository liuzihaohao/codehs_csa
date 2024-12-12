public class SecretIdentity
{
	private String realName;
	private String occupation;
	private String homePlanet;

	public SecretIdentity(String name, String occupat, String planet)
	{
		realName = name;
		occupation = occupat;
		homePlanet = planet;
	}
	
	public String getRealName()
    {
    	return realName;
    }
    
    public String getOccupation()
    {
    	return occupation;
    }
    public String getHomePlanet()
    {
    	return homePlanet;
    }
    public String toString()
    {
    	return "Real Name: " + realName + " is from planet " + homePlanet + " and works as a " + occupation + ".";
    }

}
