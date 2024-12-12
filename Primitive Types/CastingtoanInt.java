import java.util.Scanner;

public class CastingToInt
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a double: ");
        double myDouble=scanner.nextDouble();
        System.out.println(myDouble);
        System.out.println((int)myDouble);
        myDouble+=0.5;
        System.out.println(myDouble);
        System.out.println((int)myDouble);
    }
}