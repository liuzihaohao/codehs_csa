import java.util.Scanner;

public class Divisibility 
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the dividend: ");
        int a=input.nextInt();
        System.out.print("Enter the divisor: ");
        int b=input.nextInt();
        
        System.out.println(a+" is"+((b==0||a%b>0)?" not":"")+" divisible by "+b+"!");
    }
}