import java.util.Scanner;

public class CalculatorTester
{
    public static void main(String[] args)
    {
        // Put your code here
        // A good place to start is to
        // create comments like the last exercise
        // to remind yourself what you need to do
        
        //To get started, create a new Calculator object
        
        System.out.println("Enter two doubles");
        
        Scanner scanner = new Scanner(System.in);
        
        double a=scanner.nextDouble();
        double b=scanner.nextDouble();
        
        Calculator c=new Calculator();
        
        c.add(a,b);
        c.subtract(a,b);
        c.multiply(a,b);
        c.divide(a,b);
    }
}