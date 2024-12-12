import java.util.Scanner;
public class TaffyTester
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

       System.out.println("Starting Taffy Timer...");
       
       while(true){
           System.out.println("Enter the temperature: ");
           int a=scanner.nextInt();
           if(a>=270){
               break;
           }
           System.out.println("\nThe mixture isn't ready yet.");
       }
       System.out.println("Your taffy is ready for the next step!");
       // Your code starts here
    }
}