//De Morgan OR
import java.util.Scanner;

public class NightBiking
{
    public static void main(String[] args)
    {
        Scanner input  = new Scanner(System.in);
        
        //Ask user if they have a headlight
        System.out.println("Do you have a head light? Enter true or false.");
        boolean hasHeadlight = input.nextBoolean();
        
        //Ask user if they have a bike light
        System.out.println("Do you have a bike light? Enter true or false.");
        boolean hasBikelight = input.nextBoolean();
        
        // Negating an OR statement. A person cannot bike at night if it's true 
        // that they do NOT have a headlight OR a bike
        boolean cannotNightBike = !(hasHeadlight || hasBikelight);
        
        // This is an equivalent statement as the Boolean statement 
        // above using De Morgan's Laws.
        // If a person either does NOT have a headlight AND does NOT have a bikelight,
        // he or she cannot bike
        boolean cannotNightBikeDeMorgan = !hasHeadlight && !hasBikelight;
        
        // This checks the Boolean value of cannotNightBike to let the person 
        // know if they can bike at night or not.
        if(cannotNightBike)
        {
            System.out.println("You may not bike at night.");
        }
        else
        {
            System.out.println("You may bike at night!");
        }
        
        // This checks the Boolean value of cannotNightBikeDeMorgan 
        // to let the person 
        // know if they can bike at night or not. 
        // This will produce the SAME results
        // as the if-else above because of De Morgan's Laws!
        if(cannotNightBikeDeMorgan)
        {
            System.out.println("You may not bike at night with De Morgan.");
        }
        else
        {
            System.out.println("You may bike at night with De Morgan!");
        }
        
        // This checks (verifies in this case) 
        // that the 2 Boolean values are indeed equivalent
        if(cannotNightBike == cannotNightBikeDeMorgan)
        {
            System.out.println("De Morgan was right!");
        }
    }
}

