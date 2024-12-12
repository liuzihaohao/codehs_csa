public class SuperHero
{
	private String name;
	private Power superPower;
	//Static methods exist across all objects of a class
	public static int numSuperHeroes = 0;

	public SuperHero(String heroName, Power power)
	{
		name = heroName;
		superPower = new Power(power.getName(),power.getStrength());
		numSuperHeroes++;
	}
	
	public static int getNumSuperHeroes()
	{
	    return SuperHero.numSuperHeroes;
	}
}
