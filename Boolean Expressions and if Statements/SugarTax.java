import java.util.Scanner;

public class AddedSugar
{
    public static void main(String[] args)
    {
        // Ask the user for the grams of sugar
        
        // Use a boolean expression to print if they can eat more sugar
        
        System.out.println("How many grams of sugar have you eaten today? ");
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("You can eat more sugar: "+(scanner.nextInt()<30));
    }
}