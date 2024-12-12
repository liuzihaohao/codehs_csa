class SuperHeroTester
{
    public static void main(String[] args)
    {
        Power speed = new Power("Speed", 10);
        System.out.println("Creating the Flash!");
    
        SuperHero theFlash = new SuperHero("The Flash", speed);
        
        System.out.println("Number of SuperHeroes Created:");
        System.out.println(SuperHero.getNumSuperHeroes());
        
        System.out.println("Creating Shazam!");
        SuperHero shazam = new SuperHero("Shazam", speed);
        
        System.out.println("Number of SuperHeroes Created:");
        System.out.println(SuperHero.numSuperHeroes);
    }


}
