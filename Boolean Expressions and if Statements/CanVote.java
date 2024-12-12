import java.util.Scanner;

public class Voters
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter your age:");
        
        int age = input.nextInt();
        if(age >= 18)
        {
            System.out.println("You can vote!");
        }
        
        if(age < 18)
        {
        	System.out.println("Sorry, you can’t vote!");
        }

    }
}