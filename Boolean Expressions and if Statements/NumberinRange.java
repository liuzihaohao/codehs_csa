import java.util.Scanner;

public class Hours
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        
        // In military time, the hours go from 0 to 24
        // Ask the user for an hour
        System.out.println("Enter an hour of the day: ");
        int hour = input.nextInt();
        
        // Verify it is in the range [0, 24]
        // Note we have to use && here
        // If you use ||, this would evaluate to true no matter what
        // number you entered
        if(hour >= 0 && hour <= 24)
        {
            System.out.println("Valid hour");
        }
        else 
        {
            System.out.println("Not a valid hour");
        }
        
    }
}
