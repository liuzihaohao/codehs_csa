import java.util.Scanner;

public class Countdown
{
    public static void main(String[] args)
    {
       // Start here
       Scanner scanner = new Scanner(System.in);
       System.out.println("Enter starting number:");
       System.out.println(countdown(scanner.nextInt())+"Blastoff!");
    }
    
    public static String countdown(int number)
    {
       
       // Base case - return Blastoff!
       if(number<=0){return "";}
       return number+" "+countdown(number-2);
       // Recursive call
       
    }
}