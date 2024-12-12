import java.util.Scanner;

public class TriviaGame
{
    public static void main(String[] args)
    {
        //This program uses Method Decomposition to break each step into a subproblem
        //This program is easier to read and understand because it uses methods
        // and has fewer lines of code.
        Scanner input = new Scanner(System.in);
        Trivia game = new Trivia();
        System.out.println("Here's your question:");
        System.out.println(game.getQuestion());
        String response = input.nextLine();
        boolean isCorrect = game.checkResponse(response);
        printResponse(isCorrect);
    }
    
    
    /**
     * Prints whether a user's response is correct or incorrect
     * Preconditions: Must be passed a valid boolean variable
     * Postconditions: Will print correct or incorrect depending on boolean
     * 
     * @param isCorrect - boolean value based on user response to trivia question
     */
    public static void printResponse(boolean isCorrect)
    {
        if(isCorrect)
        {
        	System.out.println("That’s correct!");
        }
        else
        {
            System.out.println("Sorry, that's not correct.");
        }
    }
}
