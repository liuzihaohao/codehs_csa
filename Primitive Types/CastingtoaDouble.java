import java.util.Scanner;

public class CastingToDouble
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("First Int: ");
        int int1=scanner.nextInt();
        
        System.out.print("Second Int: ");
        int int2=scanner.nextInt();
        
        System.out.println((double)int1/(double)int2);
    }
}