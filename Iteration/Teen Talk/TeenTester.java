
import java.util.Scanner;

public class TeenTester
{
    public static void main(String[] args)
    {
        // Create a new Teen object and print it out; see the Teen class file
        // to see how the constructor and toString method work.
        Scanner scanner = new Scanner(System.in);

        Teen myFriend = new Teen("Sonequa", "Martin-Green", 10);
        System.out.println(myFriend.toString());
        
        // Ask the user to input a text message
        System.out.println("Enter a text: ");
        
        System.out.println("\nThe modified text would be: \n"+myFriend.teenTalk(scanner.nextLine()));
        // Call teenTalk method to translate the message to teen talk
    }
}