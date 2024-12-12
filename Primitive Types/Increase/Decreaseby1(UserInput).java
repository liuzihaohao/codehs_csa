import java.util.Scanner;

public class IncreaseDecrease
{
    public static void main(String args[]) 
    {
    
        int num1;
        int num2;
        
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the number you would like to INCREASE by 1:");
        num1 = input.nextInt();
        System.out.println("Please enter the number you would like to DECREASE by 1:");
        num2 = input.nextInt();
    
        num1++;
        num2--;
    
        System.out.print("Number 1 is now = ");
        System.out.println(num1);
        System.out.print("Number 2 is now = ");
        System.out.println(num2);
    }
}