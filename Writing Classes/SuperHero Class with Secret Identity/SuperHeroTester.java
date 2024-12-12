public class SuperHeroTester
{
    public static void main(String[] args)
    {
        Power superStrength = new Power("Super Strength", 100);
        SecretIdentity clarkKent = new SecretIdentity("Clark Kent", "Journalist", "Krypton");
        SuperHero superMan = new SuperHero("Superman", superStrength, clarkKent);
        
        //This will return the toString() of the SecretIdentity class
        System.out.println(superMan.getIdentity());
        
        //This will return the toString() of the SuperHero class
        System.out.println(superMan);
    }
}
