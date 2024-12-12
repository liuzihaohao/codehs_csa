import java.util.Scanner;

public class CalculatorTester
{
    public static void main(String[] args)
    {
        System.out.println("Enter two doubles");
        Scanner scanner = new Scanner(System.in);
        
        double a=scanner.nextDouble();
        double b=scanner.nextDouble();
        
        System.out.println(a+" + "+b+" = "+(a+b));
        System.out.println(a+" - "+b+" = "+(a-b));
        System.out.println(a+" * "+b+" = "+(a*b));
        System.out.println(a+" / "+b+" = "+(a/b));
    }
}