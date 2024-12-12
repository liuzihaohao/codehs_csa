import java.util.Scanner;

public class RollerCoaster 
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);  
        
        int a=input.nextInt();
        int b=input.nextInt();
        
        if(a>=42&&b>=9){
            System.out.println("Welcome aboard!");
        }else{
            System.out.println("Sorry, you are not eligible to ride");
        }
    }
}