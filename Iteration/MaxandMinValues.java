import java.util.Scanner;

public class MaxMin
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        // Your code goes here!
        // It is useful to plan out your steps before you get started!
        int minn=-2147483647;
        int maxn=2147483647;
        while(true){
            System.out.println("Enter a number or 0 to quit: ");
            int a=scanner.nextInt();
            if(a==0){
                break;
            }
            minn=(a>minn)?a:minn;
            maxn=(a<maxn)?a:maxn;
            System.out.println("Results so far:");
            System.out.println("Largest number: "+minn);
            System.out.println("Smallest number: "+maxn);
            
        }
    }
}