import java.util.Scanner;

public class MovieRatings
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter movie rating (as a decimal)");
        double good=scanner.nextDouble()+0.5;
        
        System.out.println("Rating rounded: "+((int)good));
    }
}