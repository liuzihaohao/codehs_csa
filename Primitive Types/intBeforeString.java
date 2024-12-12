import java.util.Scanner;

public class UserInput
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        
        /**
         * nextLine() reads an entire line
         * 
         * nextInt(), nextDouble(), next(), etc.
         *     only read part of the line.
         * 
         * If there is still a part of the line available
         * the Scanner object will read that without
         * prompting the user
         */
         
        System.out.println("**Example of reading multiple items in one prompt**");
        System.out.println("Enter two integers separated by a space: ");
        // Both numbers will be read in with only the first prompt
        int one = input.nextInt();
        int two = input.nextInt();
        System.out.println("The sum of these numbers is: " + (one + two));
        System.out.println();
         
        System.out.println("**Example where you fail to clear the buffer**");
        System.out.println("Enter your age: ");
        int age = input.nextInt();
        System.out.println("Enter your name: ");
        // When you run this, it will not actually prompt you
        // for your name. It will use the end of the previous
        // input instead of asking you.
        String name = input.nextLine();
        System.out.println("Age: " + age);
        System.out.println("Name: " + name); // Should be blank
        System.out.println();
        
        System.out.println("**Example where you correctly clear the buffer**");
        System.out.println("Enter the day of the month: ");
        int day = input.nextInt();
        // To get around the problem from above, we need to
        // clear the buffer before prompting with next line.
        input.nextLine(); // Removes any remaining input
        System.out.println("Enter the month name: ");
        String month = input.nextLine();
        System.out.println("It is day " + day + " of " + month);
        
    }
}
