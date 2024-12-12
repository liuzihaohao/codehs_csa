import java.util.Scanner;

public class Discounts
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        // Create a scanner object
        
        // Ask how many hours were you parked
        
        // Compute cost - $4.25
        
        // If parked for more than 3 hours, apply 25% discount
        
        // If cost is under $7, set cost to $7
        
        // Display the final cost
        System.out.println("How many hours were you parked? ");
        double a=scanner.nextInt()*4.25;
        
        if(a<7){
            System.out.println("You owe $7.0");
        }else if(a>(3*4.25)){
            System.out.println("You owe $"+(a*3/4));
        }else{
            System.out.println("You owe $"+a);
        }
    }
}