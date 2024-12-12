import java.util.Scanner;

public class Salmon
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        
        int a=input.nextInt();
        
        if(3<=a&&a<=6){
            System.out.println("Spring spawning season");
        }else if(9<=a&&a<=11){
            System.out.println("Fall spawning season");
        }else{
            System.out.println("Not spawning season");
        }
    }
}