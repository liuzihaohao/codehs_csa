import java.util.Scanner;

public class NegativeNumbers 
{
    // This program reads a number from the
    // user and prints if it is negative.
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Number: ");
        int number = input.nextInt();
        if (number < 0)
        {
            System.out.println("Number is negative");
        }
    }
}