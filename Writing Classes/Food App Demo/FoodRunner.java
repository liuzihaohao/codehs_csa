import java.util.Scanner;

public class FoodRunner
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        Food a=new Food("Hamburgers",600);
        Food b=new Food("French Fries",350);
        Food c=new Food("Coke",200);
        
        System.out.println(a);
        System.out.println("How many would you like?");
        int aa=scanner.nextInt()*600;
        
        System.out.println(b);
        System.out.println("How many would you like?");
        int bb=scanner.nextInt()*350;
        
        System.out.println(c);
        System.out.println("How many would you like?");
        int cc=scanner.nextInt()*200;
        
        System.out.println("Your meal will have a total of "+(aa+bb+cc)+" calories");
    }
}