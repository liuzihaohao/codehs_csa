import java.util.*;

public class NightOut
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        // Start here!
        System.out.println("How much does dinner usually cost? ");
        double a=input.nextDouble()*3;
        System.out.println("How much is laser tag for one person? ");
        double b=input.nextDouble()*2;
        System.out.println("How much does a triple scoop cost? ");
        double c=input.nextDouble();c=c/3+c;
        
        System.out.println("Dinner: $"+a);
        System.out.println("Laser Tag: $"+b);
        System.out.println("Ice cream: $"+c);
        System.out.println("Grand Total: $"+(a+b+c));
    }
}