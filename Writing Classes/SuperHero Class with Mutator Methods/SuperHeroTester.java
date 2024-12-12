public class SuperHeroTester
{
    public static void main(String[] args)
    {
        Power speed = new Power("Super Speed", 10);
        SuperHero flash = new SuperHero("The Flash", speed);
        
        System.out.println(flash);
        flash.setStrength(-10);
        // Notice our setter method did not let us set a 
        // negative strength
        System.out.println(flash);
        System.out.println("\nUpdating Flash's Power");
        
        //Mutator method to change the Power of flash
        flash.setPower("Light Speed", 100);
        
        System.out.println("\n"+flash);
        
    }
}
