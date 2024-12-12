import java.util.Scanner;

public class Scores
{
    public static void main(String[] args)
    {
        Scanner input=new Scanner(System.in);

        System.out.print("Please enter the first test name: ");
        String tmp=input.nextLine();
        System.out.print("Please enter the first test score: ");
        double a=input.nextDouble();

input.nextLine();

        System.out.print("Please enter the second test name: ");
        String tmp2=input.nextLine();
        System.out.print("Please enter the second test score: ");
        double b=input.nextDouble();

input.nextLine();

        System.out.print("Please enter the third test name: ");
        String tmp3=input.nextLine();
        System.out.print("Please enter the third test score: ");
        double c=input.nextDouble();

        System.out.println("Your average score is: "+((a+b+c)/3));
    }
}