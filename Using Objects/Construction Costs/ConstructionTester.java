import java.util.Scanner;

public class ConstructionTester
{
    public static void main(String[] args)
    {

        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter the sales tax rate:");
        double a = scanner.nextDouble();
        
        Construction abc=new Construction(8,11,a);

        System.out.println("How many boards do you need?");
        double b = abc.lumberCost(scanner.nextInt());
        
        System.out.println("How many windows do you need? ");
        double c = abc.windowCost(scanner.nextInt());
        
        System.out.println("Total: "+(b+c));
        System.out.println("Grand Total: "+abc.grandTotal(b+c));
    }
}