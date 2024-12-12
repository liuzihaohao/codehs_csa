import java.util.Scanner;

public class ScannerClient
{
    // This program uses a Scanner object to ask the user for
    // an integer and print its square and cube
    public static void main(String[] args)
    {
        
        // Declare a Scanner variable
        Scanner input;
        
        // Create and assign a Scanner object
        input = new Scanner(System.in);
        
        
        System.out.println("Enter an integer: ");
        
        // Call the method "nextInt" on the Scanner object
        int num1 = input.nextInt();
        
        // We had to use the Scanner object in our program to complete the task
        
        // Print the result
        System.out.println("The square of " + num1 + " is " + (num1 * num1));
        System.out.println("The cube of " + num1 + " is " + (num1 * num1* num1));
        
        
        
        
    }
}
