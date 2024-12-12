import java.util.Scanner;

public class Goals
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        // Ask for goal amount
        
        // Ask for actual amount
        
        // Compare numbers by creating three booleans
        
        // Display results as instructed
        System.out.println("Enter your goal: \nEnter your actual amount: ");
        
        int b=scanner.nextInt();
        int a=scanner.nextInt();
        
        System.out.println("Went over goal? "+(a>b));
        System.out.println("Did not meet goal? "+(a<b));
        System.out.println("Met goal exactly? "+(a>=b));
    }
}