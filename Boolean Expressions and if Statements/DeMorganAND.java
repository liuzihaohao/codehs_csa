import java.util.Scanner;

public class Biking
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        
        //Ask the user if they have a bike
        System.out.println("Do you have a bike? Enter true or false.");
        boolean hasBike = input.nextBoolean();
      
        //Ask the user if they have a helmet
        System.out.println("Do you have a helmet? Enter true or false.");
        boolean hasHelmet = input.nextBoolean();
        
        // Negating an AND statement. A person cannot bike if it's true 
        // that they do NOT have a helment AND a bike
        boolean cannotBike = !(hasBike && hasHelmet);
        
        // This is an equivalent statement as the Boolean statement 
        // above using De Morgan's Laws.
        // If a person either does NOT have a bike OR does NOT have a helmet,
        // he or she cannot bike
        boolean cannotBikeDeMorgan = !hasBike || !hasHelmet;
        
        // This checks the Boolean value of cannotBike to let the person 
        // know if they can bike or not.
        if(cannotBike)
        {
            System.out.println("You may not bike.");
        }
        else
        {
            System.out.println("You may bike!");
        }
        
        // This checks the Boolean value of cannotBikeDeMorgan to let the person 
        // know if they can bike or not. This will produce the SAME results
        // as the if-else above because of De Morgan's Laws!
        if(cannotBikeDeMorgan)
        {
            System.out.println("You may not bike with De Morgan.");
        }
        else
        {
            System.out.println("You may bike with De Morgan!");
        }
        
        // This checks (verifies in this case) that the 
        // 2 Boolean values are indeed equivalent
        if(cannotBike == cannotBikeDeMorgan)
        {
            System.out.println("De Morgan was right!");
        }
    }
}
