import java.util.Scanner;

public class EvenOdd
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter a number: ");
        int num = input.nextInt();
        
        // With positive numbers, x % y returns the
        // remainder after x is divided by y
        // If you divide an even number by 2, the remainder is 0
        // If you divide an odd number by 2, the remainder is 1
    	if(num % 2 == 0)
    	{
    		System.out.println("Number is even.");
    	}
    	else
    	{
    	    // If this runs, (num % 2) != 0
    		System.out.println("Number is odd.");
    	}
        
    }
}