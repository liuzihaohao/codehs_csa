import java.util.Scanner;
import java.util.Arrays;
public class FindMedian 
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first integer: ");
        int a=scanner.nextInt();
        System.out.println("Enter the second integer: ");
        int b=scanner.nextInt();
        System.out.println("Enter the third integer: ");
        int c=scanner.nextInt();
        
        int[] aaa = new int[]{a, b, c};
        Arrays.sort(aaa);
        
        System.out.println("The median is "+aaa[1]);
    }
}