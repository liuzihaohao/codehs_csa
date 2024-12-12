import java.util.Scanner;

public class HowFarAway 
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter the latitude of the starting location: ");
        double a=scanner.nextDouble();
        
        System.out.println("Enter the longitude of the starting location: ");
        double b=scanner.nextDouble();
        
        System.out.println("Enter the latitude of the ending location: ");
        double c=scanner.nextDouble();
        
        System.out.println("Enter the longitude of the ending location: ");
        double d=scanner.nextDouble();
        
        System.out.println("The distance is "+(new GeoLocation(a,b)).distanceFrom(new GeoLocation(c,d))+"miles.");
    }
}