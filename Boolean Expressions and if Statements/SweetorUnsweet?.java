import java.util.Scanner;

public class DrinkOrder
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        
        // Start here!
        // You'll find it helpful to list the steps you
        // need to take, then write the code
        
        System.out.println("What do you want to drink? ");
        String a=input.nextLine();
        
        System.out.println("How many teaspoons of sugar do you want? ");
        int b=input.nextInt();
        
        System.out.println("\nConfirming your order. You wanted: \n"+a+((b!=0)?" with sugar":""));
    }
}