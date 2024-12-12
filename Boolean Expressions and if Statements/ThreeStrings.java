import java.util.Scanner;
public class ThreeStrings
{
    public static void main(String[] args)
    {
        // The company's secret code
        // DO NOT change this value
        String companyCode = "1298";
        Scanner scanner = new Scanner(System.in);
        
        // Use comments to organize your logic before you start coding
        System.out.println("Enter your password: ");
        String a=scanner.nextLine();
        
        System.out.println("Enter the company's secret code: ");
        String b=scanner.nextLine();
        
        if(b.equals(companyCode)){
            System.out.println("Access granted");
        }else{
            System.out.println(a+b+" is denied");
        }
    }
}