import java.util.Scanner;

public class Basketball
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter player one's name: ");
        String a=input.nextLine();
        System.out.println("Enter player two's name: ");
        String b=input.nextLine();
        
        System.out.println("Enter "+a+"'s score");
        int aa=input.nextInt();
        System.out.println("Enter "+b+"'s score");
        int bb=input.nextInt();
        
        System.out.println();
        if(a.compareTo(b)<=0){
            System.out.println(a+" scored "+aa+" points");
            System.out.println(b+" scored "+bb+" points");
        }else{
            
            System.out.println(b+" scored "+bb+" points");
            System.out.println(a+" scored "+aa+" points");
        }
        
        if(aa>bb){
            
            System.out.println(a+" wins!");
        }else{
            System.out.println(b+" wins!");
        }
    }
}