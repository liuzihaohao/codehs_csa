import java.util.Scanner;

public class Citation
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the author's name as 'Last name, First name':");
        String a = scanner.nextLine();
        System.out.println("Enter the year the book was published: ");
        String b = scanner.nextLine();
        System.out.println("Enter the title of the book: ");
        String c = scanner.nextLine();
        System.out.println("Enter the publisher of the book: ");
        String d = scanner.nextLine();
        
        System.out.println(a+". "+c+".\n"+d+", "+b+".");
    }
}