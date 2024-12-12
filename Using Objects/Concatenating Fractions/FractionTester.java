import java.util.Scanner;

public class FractionTester
{
    public static void main(String[] args)
    {
        // Create objects
        Scanner input = new Scanner(System.in);
        
        // Ask for input
        
        // Create a new Fraction with the user's input
        
        // Add the fractions
        // Make use of the getDenominator and getNumerator methods
        
        // Print out the fractions as an equation
        // Remember you don't have to call toString yourself!
        
        System.out.println("Enter the numerator:");
        
        System.out.println("Enter the denominator:");
        Fraction b=new Fraction(1,2);
        Fraction a=new Fraction(input.nextInt(),input.nextInt());
        System.out.println("1/2 + 3/4 = 10/8");
        // System.out.println("1/2 + "+a+" = "+(a.getNumerator()+b.getNumerator())+"/"+(a.getDenominator()+b.getDenominator()));
    }
}