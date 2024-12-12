public class SuperHeroTester
{
    public static void main(String[] args)
    {
        Power speed = new Power("Super Speed", 10);
        
        
        SuperHero flash = new SuperHero("The Flash", speed);
        SuperHero shazam = new SuperHero("Shazam", speed);
        
        System.out.print("Shazam's Strength: ");
        System.out.println(shazam.getStrength());
        System.out.print("Flash's Strength: ");
        System.out.println(flash.getStrength());
        
        //When setting the strength of theFlash, shazam will change too!
        //Uncomment out the initialization of superPower in the SuperHero class
        //file to fix the object reference.
        System.out.println("\nUpdating Flash's strength to 15\n");
        flash.setStrength(15);
        
        System.out.print("Shazam's Strength: ");
        System.out.println(shazam.getStrength());
        System.out.print("Flash's Strength: ");
        System.out.println(flash.getStrength());
    }
}
