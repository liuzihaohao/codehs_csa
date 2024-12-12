import java.util.Scanner;

public class QuoteMachine
{
    
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        
        // Ask for a quote
        // Ask for the author
        
        // Create a new String that has the quote in quotation marks
        // Don't forget to escape the quotation marks
        
        // Print the quote, then the author on the next line 
        // But you can only use ONE print statement!
        System.out.println("Enter a quote:");
        System.out.println("Enter the author of the quote:");
        
        System.out.println("\""+input.nextLine()+"\"\n"+input.nextLine());
    }
}