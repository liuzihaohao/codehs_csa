import java.util.Scanner;

public class Numbers
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int a=scanner.nextInt();
        
        if(a<223){
            System.out.println("Are you sure? That's a new world record!");
        }else{
            System.out.println("Right on! Keep running!");
        }
    }
}