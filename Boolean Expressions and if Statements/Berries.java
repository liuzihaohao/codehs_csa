import java.util.Scanner;

public class Berries
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter the initial of the berry: ");
        char a=scanner.nextLine().charAt(0);
        
        if(a=='E'){
            System.out.println("You ordered Elderberry");
        }else if(a=='G'){
            System.out.println("You ordered Gooseberry");
        }else if(a=='L'){
            System.out.println("You ordered Lingonberry");
        }else{
            
            System.out.println("Berry not recognized");
        }
    }
}