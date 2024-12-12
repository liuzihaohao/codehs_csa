import java.util.*;

public class CanVote
{
    public static void main(String[] args)
    {
        Scanner userInput = new Scanner(System.in);
        
        System.out.println("Enter your age:");
        int age = userInput.nextInt();
        
        // Check if age is greater than or equal to 18
        boolean oldEnoughToVote = age >= 18;
        
        System.out.println("Old enough to vote in the US: " + oldEnoughToVote);

    }
}